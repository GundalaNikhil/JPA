package com.repo;

import com.entities.Employees;
import org.springframework.data.jpa.repository.JpaRepository;

public interface employee extends JpaRepository<Employees, Integer> {
}
