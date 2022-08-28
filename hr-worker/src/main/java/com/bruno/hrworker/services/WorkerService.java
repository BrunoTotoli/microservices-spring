package com.bruno.hrworker.services;

import com.bruno.hrworker.entities.Worker;
import com.bruno.hrworker.repositories.WorkerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class WorkerService {

    private final WorkerRepository workerRepository;

    public Iterable<Worker> findAll() {
        return workerRepository.findAll();
    }

    public Worker findById(Long id) {
        return workerRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Invalid id"));
    }
}
