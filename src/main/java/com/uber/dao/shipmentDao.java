package com.uber.dao;

import com.uber.model.Shipment;

import com.uber.repository.shipmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


// CURRENTLY NOT REQUIRED AS WE ARE USING SPRING DATA REST
// https://docs.spring.io/spring-data/rest/docs/current/reference/html/
// API SETUP IS THROUGH @RepositoryRestController
// CUSTOM QUERIES MAY UTILIZE THESE FILES LATER ON
@Service
@Component
public class shipmentDao {

    @Autowired
    shipmentRepository shipmentRepository;

}
