package org.example.MODELOS;

import java.time.LocalDate;

public class Arrendatario {
    private Long id;
    private String nombre;
    private LocalDate fechaDeNacimiento;
    private Integer  identificacion;
    private String referencias;
    private String razonPorLaQueSeMudo;
    private  String direccion;

    public Arrendatario() {
    }

    public Arrendatario(String nombre, LocalDate fechaDeNacimiento, Integer identificacion, String referencias, String razonPorLaQueSeMudo, String direccion) {
        this.nombre = nombre;
        this.fechaDeNacimiento = fechaDeNacimiento;
        this.identificacion = identificacion;
        this.referencias = referencias;
        this.razonPorLaQueSeMudo = razonPorLaQueSeMudo;
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

    public String getReferencias() {
        return referencias;
    }

    public void setReferencias(String referencias) {
        this.referencias = referencias;
    }

    public String getRazonPorLaQueSeMudo() {
        return razonPorLaQueSeMudo;
    }

    public void setRazonPorLaQueSeMudo(String razonPorLaQueSeMudo) {
        this.razonPorLaQueSeMudo = razonPorLaQueSeMudo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}
