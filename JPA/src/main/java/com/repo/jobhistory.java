package com.repo;

import com.entities.Countries;
import com.entities.JobHistory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface jobhistory extends JpaRepository<JobHistory,Integer> {
}
