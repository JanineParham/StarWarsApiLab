package com.wozu.starWarsApi.controllers;

import com.wozu.starWarsApi.models.People;
import com.wozu.starWarsApi.services.PeopleServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class PeopleController {

    @Autowired
    PeopleServiceImpl peopleService;

    @GetMapping("/person/{search}")
    @ResponseBody
    public People getPerson(@RequestParam String search){
        return peopleService.getPeople(search);
    }
}
