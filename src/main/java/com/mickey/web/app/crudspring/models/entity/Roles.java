package com.mickey.web.app.crudspring.models.entity;

import jakarta.persistence.*;

import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name = "roles")
public class Roles {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_rol")
    private Long idRol;

    private String rol;

    @OneToMany(mappedBy = "idRol")
    private Set<EmpleadosRol> empleadosRols = new LinkedHashSet<>();

    public Set<EmpleadosRol> getEmpleadosRols() {
        return empleadosRols;
    }

    public void setEmpleadosRols(Set<EmpleadosRol> empleadosRols) {
        this.empleadosRols = empleadosRols;
    }

    public void setIdRol(Long idRol) {
        this.idRol = idRol;
    }

    public Long getIdRol() {
        return idRol;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }
}
