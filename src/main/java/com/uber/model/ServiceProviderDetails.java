package com.uber.model;

import lombok.Data;
import org.hibernate.annotations.NaturalId;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import javax.validation.constraints.*;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


@Data
@Entity
@EntityListeners(AuditingEntityListener.class)
public class ServiceProviderDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    private String address;

    @NotNull
    private Long user_id;

    @NotNull
    @Min(1000000000)
    private Long phone;

    @OneToMany(mappedBy = "serviceProviderDetails", cascade = CascadeType.ALL)
    private List<Vehicles> vehiclesList;
}