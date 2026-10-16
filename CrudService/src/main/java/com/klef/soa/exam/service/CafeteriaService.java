package com.klef.soa.exam.service;

import java.util.List;
import com.klef.soa.exam.entity.Cafeteria;

public interface CafeteriaService {

    Cafeteria addCafeteria(Cafeteria cafeteria);

    List<Cafeteria> getAllCafeterias();

    String deleteCafeteria(Long id);
}