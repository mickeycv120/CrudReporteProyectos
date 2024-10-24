package com.mickey.web.app.crudspring.models.dao;

import com.mickey.web.app.crudspring.models.entity.Areas;

import java.util.List;

public interface IAreaDao<T> {
    public List<T> findAll();
}
