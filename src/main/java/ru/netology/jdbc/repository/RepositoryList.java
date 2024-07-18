package ru.netology.jdbc.repository;

import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import java.util.List;

import static ru.netology.jdbc.util.SQL.read;

@org.springframework.stereotype.Repository
public class RepositoryList implements Repository {

    private final String script = read("select-product.sql");
    private final NamedParameterJdbcTemplate jdbcTemplate;

    public RepositoryList(NamedParameterJdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public List<String> getProductName(String name) {

        MapSqlParameterSource parameterSource = new MapSqlParameterSource("name", name);

        return jdbcTemplate.queryForList(script, parameterSource, String.class);

    }

}
