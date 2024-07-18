package ru.netology.jdbc.service;

import ru.netology.jdbc.repository.Repository;

import java.util.stream.Collectors;

@org.springframework.stereotype.Service
public class ServiceList implements Service {

    private final Repository repository;

    public ServiceList(Repository repository) {
        this.repository = repository;
    }

    @Override
    public String getProduct(String name) {
        return repository
                .getProductName(name)
                .stream()
                .collect(Collectors.joining(", "));
    }

}
