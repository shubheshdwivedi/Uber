package com.uber.model;


import lombok.Data;

import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.Date;

@Data
@Entity
@EntityListeners(AuditingEntityListener.class)
public class Shipment {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotBlank
    private String source;

    @NotBlank
    private String destination;

    @NotBlank
    private String typeOfCargo;

    private int status;

    @Column(columnDefinition = "integer default 0")
    private float weight;

    @LastModifiedDate
    private Date creationDate;
}
