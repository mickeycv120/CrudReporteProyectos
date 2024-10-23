package com.mickey.web.app.crudspring.models.entity;

import jakarta.persistence.*;

import java.util.LinkedHashSet;
import java.util.Set;


@Entity
@Table(name = "equipos")
public class Equipos {

    @Id
    @Column(name = "id_equipo")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEquipo;

    @Column(name = "id_lider_proyecto")
    private Long  idLiderProyecto;

    @Column(name = "id_miembro")
    private Long idMiembro;

    @OneToMany(mappedBy = "idEquipo")
    private Set<EquiposProyectos> equiposProyectos = new LinkedHashSet<>();

    public Set<EquiposProyectos> getEquiposProyectos() {
        return equiposProyectos;
    }

    public void setEquiposProyectos(Set<EquiposProyectos> equiposProyectos) {
        this.equiposProyectos = equiposProyectos;
    }

    public void setIdEquipo(Long idEquipo) {
        this.idEquipo = idEquipo;
    }

    public Long getIdEquipo() {
        return idEquipo;
    }

    public Long getIdLiderProyecto() {
        return idLiderProyecto;
    }

    public void setIdLiderProyecto(Long idLiderProyecto) {
        this.idLiderProyecto = idLiderProyecto;
    }

    public Long getIdMiembro() {
        return idMiembro;
    }

    public void setIdMiembro(Long idMiembro) {
        this.idMiembro = idMiembro;
    }
}
