package com.uber.model;

import lombok.Data;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Data
@Entity
@EntityListeners(AuditingEntityListener.class)
public class Vehicles {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @NotBlank
    private String vehicleName;

    @NotBlank
    private String vehicleType;

    @NotBlank
    private String vehicleNumber;

    @ManyToOne
    @JoinColumn(name = "userid")
    private ServiceProviderDetails serviceProviderDetails;

    @OneToOne(mappedBy = "vehicles")
    private AcceptedShipments acceptedShipments;
}
