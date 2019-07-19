package com.uber.dao;

import com.uber.model.Shipment;

import com.uber.repository.shipmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class shipmentDao {

    @Autowired
    shipmentRepository shipmentRepository;

    /*
     * Function to save Shipment to database
     */
    public Shipment save(Shipment shipment) {
        return shipmentRepository.save(shipment);
    }

    /*
     * Function to return all shipments from database
     */
    public List<Shipment> findAll() {
        return shipmentRepository.findAll();
    }

    /*
     * Function to return one shipment from database
     * [ findOne is now returns Optional <T> as return type ]
     */
    public Shipment findOne(Long shipmentId) {
        Optional<Shipment> shipment = shipmentRepository.findById(shipmentId);
        if (shipment.isPresent())
            return shipment.get();
        else
            return null;
    }

    /*
     * Function to delete a shipment
     * [ Not configured for now ]
     */
    public void delete(Shipment shipment) {
        shipmentRepository.delete(shipment);
    }
}
