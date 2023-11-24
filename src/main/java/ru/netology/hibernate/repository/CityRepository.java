package ru.netology.hibernate.repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CityRepository {
    @PersistenceContext
    private EntityManager manager;

     public List getPersonsByCity(String city) {
        return manager.createQuery("SELECT p FROM Person p WHERE p.cityOfLiving = :city")
                .setParameter("city",city).getResultList();
    }
}