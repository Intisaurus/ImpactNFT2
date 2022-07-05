package com.example.impactnft.controller;

import com.example.impactnft.entity.Incentive;
import com.example.impactnft.repository.IncentiveRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin("http://localhost:8081/")
public class IncentiveController {
    @Autowired
    private IncentiveRepository incentiveRepository;

    @GetMapping("/incentives")
    public List<Incentive> fetchIncentives(){
        return incentiveRepository.findAll();
    }
}
