package com.mickey.web.app.crudspring.models.entity;

import jakarta.persistence.*;


@Entity
@Table(name = "empleados_rol_proyectos")
public class EmpleadosRolProyectos {
    @Id
    @Column(name = "id_empleado_rol_proyecto")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEmpleadoRolProyecto;

    @Column(name = "id_empleado_rol")
    private Long idEmpleadoRol;

    @Column(name = "id_proyecto")
    private Long idProyecto;

    @Column(name = "id_empleado_rol_proyecto")
    public void setIdEmpleadoRolProyecto(Long idEmpleadoRolProyecto) {
        this.idEmpleadoRolProyecto = idEmpleadoRolProyecto;
    }

    public Long getIdEmpleadoRolProyecto() {
        return idEmpleadoRolProyecto;
    }

    public Long getIdEmpleadoRol() {
        return idEmpleadoRol;
    }

    public void setIdEmpleadoRol(Long idEmpleadoRol) {
        this.idEmpleadoRol = idEmpleadoRol;
    }

    public Long getIdProyecto() {
        return idProyecto;
    }

    public void setIdProyecto(Long idProyecto) {
        this.idProyecto = idProyecto;
    }
}
