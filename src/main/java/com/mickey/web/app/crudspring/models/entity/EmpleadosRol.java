package com.mickey.web.app.crudspring.models.entity;

import jakarta.persistence.*;

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
