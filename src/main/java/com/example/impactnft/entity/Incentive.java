package com.example.impactnft.entity;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "incentives")
public class Incentive {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "incentive_name", nullable = false)
    private String incentiveName;

    @Column(name = "incentive_description")
    private String incentiveDescription;


}
