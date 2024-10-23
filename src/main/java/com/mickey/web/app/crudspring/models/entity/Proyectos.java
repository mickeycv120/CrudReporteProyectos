package com.mickey.web.app.crudspring.models.entity;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "proyectos")
public class Proyectos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_proyecto")
    private Long idProyecto;

    @Column(name="id_interno")
    private String idInterno;
    @Column(name="nombre_proyecto")
    private String nombreProyecto;

    private Date inicio;
    private Date fin;
    private Long equipo;

    @Column(name = "fase_proyecto")
    private Long faseProyecto;

    public void setIdProyecto(Long idProyecto) {
        this.idProyecto = idProyecto;
    }

    public Long getIdProyecto() {
        return idProyecto;
    }

    public String getIdInterno() {
        return idInterno;
    }

    public void setIdInterno(String idInterno) {
        this.idInterno = idInterno;
    }

    public String getNombreProyecto() {
        return nombreProyecto;
    }

    public void setNombreProyecto(String nombreProyecto) {
        this.nombreProyecto = nombreProyecto;
    }

    public Date getInicio() {
        return inicio;
    }

    public void setInicio(Date inicio) {
        this.inicio = inicio;
    }

    public Date getFin() {
        return fin;
    }

    public void setFin(Date fin) {
        this.fin = fin;
    }

    public Long getEquipo() {
        return equipo;
    }

    public void setEquipo(Long equipo) {
        this.equipo = equipo;
    }

    public Long getFaseProyecto() {
        return faseProyecto;
    }

    public void setFaseProyecto(Long faseProyecto) {
        this.faseProyecto = faseProyecto;
    }
}
