package com.repo;

import com.entities.Countries;
import org.springframework.data.jpa.repository.JpaRepository;

public interface countries extends JpaRepository<Countries,Integer> {
}
