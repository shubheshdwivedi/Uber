package com.uber.controller;

import com.uber.dao.shipmentDao;

import com.uber.model.Shipment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

// CURRENTLY NOT REQUIRED AS WE ARE USING SPRING DATA REST
// https://docs.spring.io/spring-data/rest/docs/current/reference/html/
// API SETUP IS THROUGH @RepositoryRestController
// CUSTOM QUERIES MAY UTILIZE THESE FILES LATER ON
@RestController
@RequestMapping("/api")
public class shipmentController {

    @Autowired
    shipmentDao shipmentDao;
}
