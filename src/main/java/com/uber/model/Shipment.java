package com.uber.model;


import lombok.Data;

import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Data
@Entity
@EntityListeners(AuditingEntityListener.class)
public class Shipment {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotNull
    private String source;

    @NotNull
    private String destination;

    @NotNull
    private String typeOfCargo;

    @NotNull
    @Column(columnDefinition = "integer default 0")
    private int status;

    @Column(columnDefinition = "integer default 0")
    private float weight;

    @LastModifiedDate
    private Date creationDate;

    // Mapping URL : curl -i -X PUT -H "Content-Type:text/uri-list" -d "http://localhost:8080/api/shipment/1" http://localhost:8080/api/bid/1/shipment
    @OneToMany(mappedBy = "shipment", cascade = CascadeType.ALL)
    private Set<Bid> bids;

}
