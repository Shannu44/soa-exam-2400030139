package com.klef.soa.exam.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.klef.soa.exam.entity.Cafeteria;

public interface CafeteriaRepository extends JpaRepository<Cafeteria, Long> {
}
