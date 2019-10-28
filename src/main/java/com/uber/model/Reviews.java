package com.uber.model;

import lombok.Data;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
@Entity
@EntityListeners(AuditingEntityListener.class)
public class Reviews {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(columnDefinition = "integer default 0")
    private int rating;

    @Lob
    @NotBlank
    private String reviewContent;

    @NotNull
    private Long authorCustomer;

    @OneToOne
    @JoinColumn(name= "serviceProviderId", referencedColumnName = "id")
    private User user;
}
