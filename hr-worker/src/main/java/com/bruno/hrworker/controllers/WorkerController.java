package com.bruno.hrworker.controllers;

import com.bruno.hrworker.entities.Worker;
import com.bruno.hrworker.services.WorkerService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/workers")
@RequiredArgsConstructor
@Log4j2
public class WorkerController {

    private final WorkerService workerService;

    @GetMapping
    public ResponseEntity<Iterable<Worker>> findAll() {
        return ResponseEntity.ok(workerService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Worker> findById(@PathVariable Long id) {
        return ResponseEntity.ok(workerService.findById(id));
    }

}
