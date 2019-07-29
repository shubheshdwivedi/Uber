package com.uber.repository;

import com.uber.model.Shipment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.stereotype.Repository;
import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
@RepositoryRestResource(collectionResourceRel = "shipment", path = "shipment")
public interface shipmentRepository extends JpaRepository<Shipment, Long> {

    @RestResource(path = "findBySource", rel = "findBySource")
    public List<Shipment> findBySourceStartsWith(@Param("Source") String source);

    @RestResource(path = "getShipmentsByStatus", rel = "getShipmentsByStatus")
    public List<Shipment> findShipmentsByStatus(@Param("Status") int status);

}
