package com.mickey.web.app.crudspring.models.entity;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "areas")
public class Areas{


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_area")
    private Long idArea;

    @Column(name = "area",length = 70)
    private String area;


    public void setidArea(Long idArea) {
        this.idArea = idArea;
    }

    public Long getidArea() {
        return idArea;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }
}
