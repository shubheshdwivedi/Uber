package com.uber.repository;

import com.uber.model.AcceptedShipments;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional
@RepositoryRestResource(collectionResourceRel = "AcceptedShipments", path = "AcceptedShipments")
public interface acceptedShipmentsRepository extends JpaRepository<AcceptedShipments, Long> {
}
