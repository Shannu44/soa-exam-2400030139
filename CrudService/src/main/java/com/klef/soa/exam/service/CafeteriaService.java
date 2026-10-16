package com.klef.soa.exam.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.klef.soa.exam.entity.Cafeteria;
import com.klef.soa.exam.repository.CafeteriaRepository;

@Service
public class CafeteriaService {

    private final CafeteriaRepository repository;

    public CafeteriaService(CafeteriaRepository repository) {
        this.repository = repository;
    }

    public Cafeteria addCafeteria(Cafeteria cafeteria) {
        return repository.save(cafeteria);
    }

    public List<Cafeteria> getAllCafeterias() {
        return repository.findAll();
    }

    public boolean deleteCafeteria(Long id) {
        if (!repository.existsById(id)) {
            return false;
        }
        repository.deleteById(id);
        return true;
    }
}
