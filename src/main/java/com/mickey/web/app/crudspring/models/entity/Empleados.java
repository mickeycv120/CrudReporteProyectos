package com.mickey.web.app.crudspring.models.entity;

import jakarta.persistence.*;

import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name = "empleados")
public class Empleados {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_empleado")
    private Long idEmpleado;

    private String nombre;

    @Column(name = "apellido_paterno")
    private String apellidoPaterno;

    @Column(name = "apellido_materno")
    private String apellidoMaterno;

    @Column(name = "numero_empleado")
    private int numEmpleado;

    @OneToMany(mappedBy = "idEmpleado")
    private Set<EmpleadosRol> empleadosRols = new LinkedHashSet<>();

    @OneToMany(mappedBy = "idLiderProyecto")
    private Set<Equipos> equipos = new LinkedHashSet<>();

    @OneToMany(mappedBy = "idEmpleado")
    private Set<LideresAreas> lideresAreas = new LinkedHashSet<>();

    public Set<LideresAreas> getLideresAreas() {
        return lideresAreas;
    }

    public void setLideresAreas(Set<LideresAreas> lideresAreas) {
        this.lideresAreas = lideresAreas;
    }

    public Set<Equipos> getEquipos() {
        return equipos;
    }

    public void setEquipos(Set<Equipos> equipos) {
        this.equipos = equipos;
    }

    public Set<EmpleadosRol> getEmpleadosRols() {
        return empleadosRols;
    }

    public void setEmpleadosRols(Set<EmpleadosRol> empleadosRols) {
        this.empleadosRols = empleadosRols;
    }

    public void setIdEmpleado(Long idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public Long getIdEmpleado() {
        return idEmpleado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    public int getNumEmpleado() {
        return numEmpleado;
    }

    public void setNumEmpleado(int numEmpleado) {
        this.numEmpleado = numEmpleado;
    }
}
