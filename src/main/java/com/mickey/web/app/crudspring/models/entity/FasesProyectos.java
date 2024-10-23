package com.mickey.web.app.crudspring.models.entity;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "fases_proyectos")
public class FasesProyectos {
    @Id
    private Long idFaseProyecto;

    @Column(name = "id_empleado_rol")
    private Long idEmpleadoRol;

    @Column(name = "id_fase")
    private Long idFase;

    private double porcentaje;

    @Temporal(TemporalType.DATE)
    private Date inicio;

    @Temporal(TemporalType.DATE)
    private Date fin;

    private String estatus;


    public void setIdFaseProyecto(Long idFaseProyecto) {
        this.idFaseProyecto = idFaseProyecto;
    }

    public Long getIdFaseProyecto() {
        return idFaseProyecto;
    }

    public Long getIdEmpleadoRol() {
        return idEmpleadoRol;
    }

    public void setIdEmpleadoRol(Long idEmpleadoRol) {
        this.idEmpleadoRol = idEmpleadoRol;
    }

    public Long getIdFase() {
        return idFase;
    }

    public void setIdFase(Long idFase) {
        this.idFase = idFase;
    }

    public double getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(double porcentaje) {
        this.porcentaje = porcentaje;
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

    public String getEstatus() {
        return estatus;
    }

    public void setEstatus(String estatus) {
        this.estatus = estatus;
    }
}
