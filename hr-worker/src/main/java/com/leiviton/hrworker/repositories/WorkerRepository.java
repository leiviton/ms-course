package com.leiviton.hrworker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.leiviton.hrworker.entities.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long> {

}
