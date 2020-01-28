package com.pablo.dao;

import com.pablo.entity.Human;
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
    @Autowired HumanRepository humanRepository;

    @GetMapping("/humans")
    public List<Human> getAllHumans() {
        return humanRepository.findAll();
    }

    @GetMapping("/humans/get/{first_name}")
    public Optional<Human> getByFirstName(@PathVariable(value = "first_name") String firstName) {
        return humanRepository.findHumanByFirstName(firstName);
    }

    @PostMapping("/humans/save")
    @ResponseStatus(HttpStatus.OK)
    @Transactional
    public Human createHuman(@Valid @RequestBody Human human) {
        return humanRepository.saveAndFlush(human);
    }

}
