package org.example.MODELOS;

import java.time.LocalDate;

public class Propietario {
    private Long id;
    private String nombre;
    private LocalDate fechaDeNacimiento;
    private Integer  identificacion;
    private String ocupacion;
    private Integer ingreso;
    private  String direccion;

    public Propietario() {
    }

    public Propietario(String nombre, LocalDate fechaDeNacimiento, Integer identificacion, String ocupacion, Integer ingreso, String direccion) {
        this.nombre = nombre;
        this.fechaDeNacimiento = fechaDeNacimiento;
        this.identificacion = identificacion;
        this.ocupacion = ocupacion;
        this.ingreso = ingreso;
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    public void setFechaDeNacimiento(LocalDate fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    public Integer getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(Integer identificacion) {
        this.identificacion = identificacion;
    }

    public String getOcupacion() {
        return ocupacion;
    }

    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }

    public Integer getIngreso() {
        return ingreso;
    }

    public void setIngreso(Integer ingreso) {
        this.ingreso = ingreso;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}
