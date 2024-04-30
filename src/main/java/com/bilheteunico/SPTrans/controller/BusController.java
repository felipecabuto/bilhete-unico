package com.bilheteunico.SPTrans.controller;

import com.bilheteunico.SPTrans.entity.Bus;
import com.bilheteunico.SPTrans.service.BusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/buses")
public class BusController {
    @Autowired
    private BusService busService;

    @PostMapping
    public ResponseEntity<Bus> createBus(@RequestBody Bus bus) {
        Bus savedBus = busService.saveBus(bus);
        return new ResponseEntity<>(savedBus, HttpStatus.CREATED);
    }

    @GetMapping
    public List<Bus> getAllBuses() {
        return busService.findAllBuses();
    }
}