package com.repo;

import com.entities.Departments;
import org.springframework.data.jpa.repository.JpaRepository;

public interface departments extends JpaRepository<Departments,Integer> {

}
