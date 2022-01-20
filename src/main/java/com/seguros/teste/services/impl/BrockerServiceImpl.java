package com.seguros.teste.services.impl;

import com.seguros.teste.domain.dtos.Brocker;
import com.seguros.teste.domain.dtos.BrockerDTO;
import com.seguros.teste.domain.dtos.BrockerInfo;
import com.seguros.teste.services.BrockerService;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class BrockerServiceImpl implements BrockerService{
    
    public static RestTemplate client = new RestTemplate();

    public BrockerDTO getBrockerData(String document){
        Brocker brocker = getBrocker(document);
        BrockerInfo brockerInfo = getBrockerInfo(brocker.getCode());

        BrockerDTO brockerResponse = new BrockerDTO(brocker, brockerInfo);
        return brockerResponse;
    }

    public Brocker getBrocker(String document){
        ResponseEntity<Brocker> entity = 
        client.getForEntity(
            "https://607732991ed0ae0017d6a9b0.mockapi.io/insurance/v1/broker/"+document,
             Brocker.class);
        return entity.getBody();
    }

    public BrockerInfo getBrockerInfo(String code){
        ResponseEntity<BrockerInfo> entity2 = client.getForEntity("https://607732991ed0ae0017d6a9b0.mockapi.io/insurance/v1/brokerData/"+code, BrockerInfo.class);
        return entity2.getBody();
    }
}