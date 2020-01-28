package com.pablo.dao;

import com.pablo.entity.Human;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface HumanRepository extends JpaRepository<Human, String> {
    Optional<Human> findHumanByFirstName(String firstName);
}
