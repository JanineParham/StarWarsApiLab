package com.wozu.starWarsApi.services;

import com.wozu.starWarsApi.models.People;
import org.springframework.stereotype.Service;

@Service
public interface PeopleService {
    public People getPeople(String search);
}
