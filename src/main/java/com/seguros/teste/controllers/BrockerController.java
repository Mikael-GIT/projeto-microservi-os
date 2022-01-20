package com.seguros.teste.controllers;

import com.seguros.teste.domain.dtos.BrockerDTO;
import com.seguros.teste.services.BrockerService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/brocker")
public class BrockerController {
    
    @Autowired
    private BrockerService brockerService;

    @GetMapping("/{document}")
    public ResponseEntity<BrockerDTO> getBrockerData(@PathVariable String document){
        BrockerDTO brocker = brockerService.getBrockerData(document);
        return  ResponseEntity.ok().body(brocker);
    }
}