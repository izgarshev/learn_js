package com.pablo.controllers;

import com.pablo.entity.Human;
import com.pablo.repo.HumanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class HumanController {
    @Autowired
    HumanRepository repository;

    @GetMapping("/humans")
    public List<Human> getAllHumans() {
        return repository.findAll();
    }

    @GetMapping("/humans/get/{first_name}")
    public Optional<Human> getByFirstName(@PathVariable(value = "first_name") String firstName) {
        return repository.findHumanByFirstName(firstName);
    }

    @PostMapping("/humans/save")
    @ResponseStatus(HttpStatus.OK)
    @Transactional
    public Human createHuman(@Valid @RequestBody Human human) {
        return repository.saveAndFlush(human);
    }

}
