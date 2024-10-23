package com.mickey.web.app.crudspring.models.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "equipos_proyectos")
public class EquiposProyectos {

    @Id
    @Column(name = "id_equipos_proyectos")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEquiposProyectos;

    @Column(name = "id_equipo")
    private Long idEquipo;

    @Column(name = "id_proyecto")
    private Long idProyecto;

    public void setIdEquiposProyectos(Long idEquiposProyectos) {
        this.idEquiposProyectos = idEquiposProyectos;
    }

    public Long getIdEquiposProyectos() {
        return idEquiposProyectos;
    }

    public Long getIdEquipo() {
        return idEquipo;
    }

    public void setIdEquipo(Long idEquipo) {
        this.idEquipo = idEquipo;
    }

    public Long getIdProyecto() {
        return idProyecto;
    }

    public void setIdProyecto(Long idProyecto) {
        this.idProyecto = idProyecto;
    }
}
