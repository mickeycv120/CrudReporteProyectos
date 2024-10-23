package com.mickey.web.app.crudspring.models.dao;

import com.mickey.web.app.crudspring.models.entity.Areas;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public class AreasDAOImpl implements IGenericClientDAO<Areas> {

    @PersistenceContext
    private EntityManager em;

    @SuppressWarnings("unchecked")
    @Transactional(readOnly = true)
    @Override
    public List<Areas> findAll() {
        return em.createQuery("from Areas").getResultList();
    }
}
