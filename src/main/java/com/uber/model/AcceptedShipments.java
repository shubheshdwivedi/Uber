package com.uber.model;

import lombok.Data;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
@Entity
@EntityListeners(AuditingEntityListener.class)
public class AcceptedShipments {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotNull
    private Long serviceProviderId;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="vehicle_id", referencedColumnName = "id")
    private Vehicles vehicles;

    @NotNull
    private Long expectedDays;

    @Column(columnDefinition = "integer default 0")
    private int status;
}
