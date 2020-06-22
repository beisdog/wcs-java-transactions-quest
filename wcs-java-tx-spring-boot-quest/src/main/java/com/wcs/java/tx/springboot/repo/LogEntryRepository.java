package com.wcs.java.tx.springboot.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wcs.java.tx.springboot.entities.LogEntry;

@Repository
public interface LogEntryRepository extends JpaRepository<LogEntry, Long>{

}
