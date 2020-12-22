package com.repo;

import com.entities.Countries;
import com.entities.Locations;
import org.springframework.data.jpa.repository.JpaRepository;

public interface locations extends JpaRepository<Locations,Integer> {
}
