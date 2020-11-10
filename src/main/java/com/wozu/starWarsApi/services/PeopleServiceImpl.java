package com.wozu.starWarsApi.services;

import com.wozu.starWarsApi.models.People;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class PeopleServiceImpl implements PeopleService{
    @Override
    public People getPeople(String search) {
        String url = "https://swapi.dev/api/people/?search=" + search;
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(url, People.class);
    }
}
