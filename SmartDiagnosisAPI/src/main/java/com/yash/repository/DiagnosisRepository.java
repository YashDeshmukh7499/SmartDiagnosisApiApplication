package com.yash.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.yash.entity.Diagnosis;

public interface DiagnosisRepository extends JpaRepository<Diagnosis, Integer> {

}