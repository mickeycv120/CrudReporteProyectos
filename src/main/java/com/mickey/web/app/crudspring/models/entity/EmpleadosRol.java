package com.mickey.web.app.crudspring.models.entity;

import jakarta.persistence.*;

import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name = "Empleados_rol")
public class EmpleadosRol {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_empleado_rol")
    private Long idEmpleadoRol;

    @Column(name = "id_empleado")
    private Long idEmpleado;

    @Column(name = "id_rol")
    private Long idRol;

    @OneToMany(mappedBy = "idEmpleadoRol")
    private Set<EmpleadosRolProyectos> empleadosRolProyectos = new LinkedHashSet<>();

    @OneToMany(mappedBy = "idEmpleadoRol")
    private Set<FasesProyectos> fasesProyectos = new LinkedHashSet<>();

    public Set<FasesProyectos> getFasesProyectos() {
        return fasesProyectos;
    }

    public void setFasesProyectos(Set<FasesProyectos> fasesProyectos) {
        this.fasesProyectos = fasesProyectos;
    }

    public Set<EmpleadosRolProyectos> getEmpleadosRolProyectos() {
        return empleadosRolProyectos;
    }

    public void setEmpleadosRolProyectos(Set<EmpleadosRolProyectos> empleadosRolProyectos) {
        this.empleadosRolProyectos = empleadosRolProyectos;
    }

    public void setIdEmpleadoRol(Long idEmpleadoRol) {
        this.idEmpleadoRol = idEmpleadoRol;
    }

    public Long getId_empleado_rol() {
        return idEmpleadoRol;
    }

    public Long getIdEmpleadoRol() {
        return idEmpleadoRol;
    }

    public Long getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(Long idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public Long getIdRol() {
        return idRol;
    }

    public void setIdRol(Long idRol) {
        this.idRol = idRol;
    }
}
