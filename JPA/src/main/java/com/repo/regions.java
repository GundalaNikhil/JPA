package com.repo;

import com.entities.Regions;
import org.springframework.data.jpa.repository.JpaRepository;

public interface regions extends JpaRepository<Regions,Integer> {
}
