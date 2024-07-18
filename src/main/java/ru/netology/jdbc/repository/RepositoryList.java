package ru.netology.jdbc.repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

import java.util.List;

@org.springframework.stereotype.Repository
public class RepositoryList implements Repository {

    @PersistenceContext
    private final EntityManager entityManager;

    public RepositoryList(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public List getProductName(String name) {
        return entityManager
                .createQuery("select o.productName from Order o " +
                        "left join Customer c on c.id = o.customer.id where c.name = :name")
                .setParameter("name", name)
                .getResultList();
    }

}
