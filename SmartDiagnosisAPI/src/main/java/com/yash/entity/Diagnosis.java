package com.yash.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Diagnosis {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String symptoms;

    private String conditionName;

    private String probability;

    private String nextStep;

    private LocalDateTime createdAt = LocalDateTime.now();

    public Diagnosis() {
    	
    }

    public Diagnosis(String symptoms, String conditionName, String probability, String nextStep) {
        this.symptoms = symptoms;
        this.conditionName = conditionName;
        this.probability = probability;
        this.nextStep = nextStep;
    }

    public Integer getId() {
        return id;
    }

    public String getSymptoms() {
        return symptoms;
    }

    public void setSymptoms(String symptoms) {
        this.symptoms = symptoms;
    }

    public String getConditionName() {
        return conditionName;
    }

    public void setConditionName(String conditionName) {
        this.conditionName = conditionName;
    }

    public String getProbability() {
        return probability;
    }

    public void setProbability(String probability) {
        this.probability = probability;
    }

    public String getNextStep() {
        return nextStep;
    }

    public void setNextStep(String nextStep) {
        this.nextStep = nextStep;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }
}