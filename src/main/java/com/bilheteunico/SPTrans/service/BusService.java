package com.bilheteunico.SPTrans.service;

import com.bilheteunico.SPTrans.entity.Bus;
import com.bilheteunico.SPTrans.repositories.BusRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BusService {
    @Autowired
    private BusRepository busRepository;

    public Bus saveBus(Bus bus) {
        return busRepository.save(bus);
    }

    public List<Bus> findAllBuses() {
        return busRepository.findAll();
    }
}