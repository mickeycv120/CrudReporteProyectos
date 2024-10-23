package com.mickey.web.app.crudspring.models.dao;

import java.util.List;

public interface IGenericClientDAO<T> {
    List<T> findAll();
}
