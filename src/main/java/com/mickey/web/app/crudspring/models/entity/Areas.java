package com.mickey.web.app.crudspring.models.entity;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name = "areas")
public class Areas{


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_area")
    private Long idArea;

    @Column(name = "area",length = 70)
    private String area;

    /*@OneToMany(mappedBy = "idArea")
    private Set<LideresAreas> lideresAreas = new LinkedHashSet<>();

    public Set<LideresAreas> getLideresAreas() {
        return lideresAreas;
    }

    public void setLideresAreas(Set<LideresAreas> lideresAreas) {
        this.lideresAreas = lideresAreas;
    }*/


    public void setIdArea(Long idArea) {
        this.idArea = idArea;
    }

    public Long getIdArea() {
        return idArea;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }
}
