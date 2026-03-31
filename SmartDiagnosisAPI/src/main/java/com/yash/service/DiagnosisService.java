package com.yash.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
import com.yash.entity.Diagnosis;


@Service
public class DiagnosisService {

    public List<Diagnosis> generateDiagnosis(String symptoms) {

        List<Diagnosis> list = new ArrayList<>();

        if (symptoms.contains("fever") && symptoms.contains("cough")) {

            list.add(new Diagnosis(
                    symptoms,
                    "Flu",
                    "75%",
                    "CBC Test, Consult General Physician"));

            list.add(new Diagnosis(
                    symptoms,
                    "Viral Infection",
                    "65%",
                    "Blood Test, Hydration"));

        } 
        else if (symptoms.contains("chest pain")) {

            list.add(new Diagnosis(
                    symptoms,
                    "Bronchitis",
                    "70%",
                    "Chest X-ray, Pulmonologist"));

        } 
        else {

            list.add(new Diagnosis(
                    symptoms,
                    "General Infection",
                    "50%",
                    "Basic Health Checkup"));
        }

        return list;
        
    }
}