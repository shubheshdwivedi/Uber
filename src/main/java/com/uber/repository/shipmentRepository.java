package com.uber.repository;


import com.uber.model.Shipment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional
public interface shipmentRepository extends JpaRepository<Shipment, Long> {


}
