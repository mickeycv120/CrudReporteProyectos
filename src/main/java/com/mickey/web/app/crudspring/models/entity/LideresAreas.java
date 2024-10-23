package com.mickey.web.app.crudspring.models.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "lideres_areas")
public class LideresAreas {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_lider_area")
    private Long idLiderArea;

    @Column(name = "id_empleado")
    private Long idEmpleado;
    @Column(name = "id_area")
    private Long idArea;

    public void setIdLiderArea(Long idLiderArea) {
        this.idLiderArea = idLiderArea;
    }

    public Long getIdLiderArea() {
        return idLiderArea;
    }

    public Long getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(Long idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public Long getIdArea() {
        return idArea;
    }

    public void setIdArea(Long idArea) {
        this.idArea = idArea;
    }
}
