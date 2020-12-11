package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;

public interface SampleDataDao extends JpaRepository<SampleData, Long> {

}
