package com.uber.repository;

import com.uber.model.Shipment;
import com.uber.model.Vehicles;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.stereotype.Repository;
import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
@RepositoryRestResource(collectionResourceRel = "vehicles", path = "vehicles")
public interface vehiclesRepository extends JpaRepository<Vehicles, Long> {

}
