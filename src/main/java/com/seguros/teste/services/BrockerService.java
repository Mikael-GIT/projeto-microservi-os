package com.seguros.teste.services;

import com.seguros.teste.domain.dtos.Brocker;
import com.seguros.teste.domain.dtos.BrockerDTO;
import com.seguros.teste.domain.dtos.BrockerInfo;

import org.springframework.stereotype.Service;

@Service
public interface BrockerService {

    public BrockerDTO getBrockerData(String document);

    public Brocker getBrocker(String document);

    public BrockerInfo getBrockerInfo(String code);

}