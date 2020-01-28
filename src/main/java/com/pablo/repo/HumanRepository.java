package com.pablo.repo;

import com.pablo.entity.Human;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface HumanRepository extends JpaRepository<Human, Long> {
    Optional<Human> findHumanByFirstName(String firstName);
}
