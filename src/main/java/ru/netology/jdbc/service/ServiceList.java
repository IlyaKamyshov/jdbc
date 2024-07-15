package ru.netology.jdbc.service;

import ru.netology.jdbc.repository.Repository;

@org.springframework.stereotype.Service
public class ServiceList implements Service {

    Repository repository;

    public ServiceList(Repository repository) {
        this.repository = repository;
    }

    @Override
    public String getProduct(String name) {
        return repository.getProductName(name);
    }

}
