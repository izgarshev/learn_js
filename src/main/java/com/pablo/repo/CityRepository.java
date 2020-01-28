package com.pablo.repo;

import com.pablo.entity.City;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CityRepository extends JpaRepository<City, Long> {
    City getCityById(Long id);
}
