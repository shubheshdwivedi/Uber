package com.uber.controller;

import com.uber.dao.shipmentDao;

import com.uber.model.Shipment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;


@RestController
@RequestMapping("/api")
public class shipmentController {

    @Autowired
    shipmentDao shipmentDao;

    /*
        fn: Saving an employee
        type: POST
        route: /shipment
     */
    @PostMapping("/shipment")
    public Shipment createShipment(@Valid @RequestBody Shipment shipment) {
        return shipmentDao.save(shipment);
    }

    /*
        fn: Viewing all shipments
        type: GET
        route: /shipment
    */
    @GetMapping("/shipment")
    public List<Shipment> getAllShipments() {
        return shipmentDao.findAll();
    }

    /*
        fn: Viewing one shipment
        type: GET
        route: /shipment/:id
    */
    @GetMapping("/shipment/{id}")
    public ResponseEntity<Shipment> getShipmentById(@PathVariable(value = "id") Long shipment_id) {
        Shipment shipment = shipmentDao.findOne(shipment_id);

        if(shipment == null)
            return ResponseEntity.notFound().build();

        return ResponseEntity.ok().body(shipment);
    }


}
