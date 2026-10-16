package com.klef.soa.exam.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.klef.soa.exam.entity.Cafeteria;
import com.klef.soa.exam.service.CafeteriaService;

@RestController
public class CafeteriaController {

    private final CafeteriaService service;

    public CafeteriaController(CafeteriaService service) {
        this.service = service;
    }

    @PostMapping("/Add")
    public ResponseEntity<Cafeteria> add(@RequestBody Cafeteria cafeteria) {
        return new ResponseEntity<>(service.addCafeteria(cafeteria), HttpStatus.CREATED);
    }

    @GetMapping("/DisplayAll")
    public ResponseEntity<List<Cafeteria>> displayAll() {
        return ResponseEntity.ok(service.getAllCafeterias());
    }

    @DeleteMapping("/Delete/{id}")
    public ResponseEntity<String> delete(@PathVariable Long id) {
        if (!service.deleteCafeteria(id)) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body("Cafeteria not found with id: " + id);
        }
        return ResponseEntity.ok("Cafeteria deleted successfully!");
    }
}
