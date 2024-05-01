package com.bilheteunico.SPTrans.service;

import com.bilheteunico.SPTrans.dto.StopPointData;
import com.bilheteunico.SPTrans.repositories.StopPointRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class StopPointSynchronizationService {

    @Autowired
    private StopPointRepository stopPointRepository;

    @Scheduled(cron = "0 0 1 * * ?")
    public void synchronizeStopPoints() {
        String url = "https://developer.transportapi.com/api/v1/stop-points";
        RestTemplate restTemplate = new RestTemplate();
        StopPointData stopPointData = restTemplate.getForObject(url, StopPointData.class);

//        stopPointRepository.saveAll(stopPointData.getStopPoints());
    }
}