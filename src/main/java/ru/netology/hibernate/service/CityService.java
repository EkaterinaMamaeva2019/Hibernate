package ru.netology.hibernate.service;

import org.springframework.stereotype.Service;
import ru.netology.hibernate.repository.CityRepository;

import java.util.List;

@Service
public class CityService {
    private final CityRepository repository;

    public CityService(CityRepository repository) {
               this.repository =repository;
    }
    public List getPersonsByCity(String city) {
        return repository.getPersonsByCity(city);
    }
}
