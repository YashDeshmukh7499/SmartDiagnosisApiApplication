package com.yash.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.yash.dto.DiagnosisRequest;
import com.yash.entity.Diagnosis;
import com.yash.repository.DiagnosisRepository;
import com.yash.service.DiagnosisService;

@RestController
@RequestMapping("/api")
@CrossOrigin("*")
public class DiagnosisController {

    @Autowired
    private DiagnosisService diagnosisService;

    @Autowired
    private DiagnosisRepository diagnosisRepository;

    @PostMapping("/diagnose")
    public List<Diagnosis> diagnose(@RequestBody DiagnosisRequest request) {

        List<Diagnosis> result =
                diagnosisService.generateDiagnosis(
                        request.getSymptoms().toLowerCase());

        return diagnosisRepository.saveAll(result);
    }

    @GetMapping("/history")
    public List<Diagnosis> getHistory() {
        return diagnosisRepository.findAll();
    }
}