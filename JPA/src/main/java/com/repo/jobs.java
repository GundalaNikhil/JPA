package com.repo;

import com.entities.Countries;
import com.entities.Jobs;
import org.springframework.data.jpa.repository.JpaRepository;

public interface jobs extends JpaRepository<Jobs,Integer> {

}
