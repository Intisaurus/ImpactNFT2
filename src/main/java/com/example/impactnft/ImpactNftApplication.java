package com.example.impactnft;

import com.example.impactnft.entity.Incentive;
import com.example.impactnft.repository.IncentiveRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class ImpactNftApplication {

    public static void main(String[] args) {
        SpringApplication.run(ImpactNftApplication.class, args);
    }

    @Autowired
    private IncentiveRepository incentiveRepository;

    @PostConstruct
    protected void init(){
        Incentive incentive1 = new Incentive();
        incentive1.setIncentiveName("General Incentive");
        incentive1.setIncentiveDescription("The description of the general incentive would go here.");

        incentiveRepository.save(incentive1);
    }


}
