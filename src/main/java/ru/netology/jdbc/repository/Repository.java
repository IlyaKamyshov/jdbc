package ru.netology.jdbc.repository;

import java.util.List;

public interface Repository {
    List<String> getProductName(String name);
}
