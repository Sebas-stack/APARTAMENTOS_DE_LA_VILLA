package org.example.MODELOS;

import java.time.LocalDate;

public class Apartamento {
    private Arrendatario arrendatario;
    private Propietario propietario;
    private Long id;
    private String nombre;
    private String tipoDePropiedad;
    private String  ubicacion;
    private String superficie;
    private Integer precio;

    public Apartamento() {
    }

    public Apartamento(Arrendatario arrendatario, Propietario propietario, Long id, String nombre, String tipoDePropiedad, String ubicacion, String superficie, Integer precio, String direccion) {
        this.arrendatario = arrendatario;
        this.propietario = propietario;
        this.id = id;
        this.nombre = nombre;
        this.tipoDePropiedad = tipoDePropiedad;
        this.ubicacion = ubicacion;
        this.superficie = superficie;
        this.precio = precio;
        
    }

    public Arrendatario getArrendatario() {
        return arrendatario;
    }

    public void setArrendatario(Arrendatario arrendatario) {
        this.arrendatario = arrendatario;
    }

    public Propietario getPropietario() {
        return propietario;
    }

    public void setPropietario(Propietario propietario) {
        this.propietario = propietario;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipoDePropiedad() {
        return tipoDePropiedad;
    }

    public void setTipoDePropiedad(String tipoDePropiedad) {
        this.tipoDePropiedad = tipoDePropiedad;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getSuperficie() {
        return superficie;
    }

    public void setSuperficie(String superficie) {
        this.superficie = superficie;
    }

    public Integer getPrecio() {
        return precio;
    }

    public void setPrecio(Integer precio) {
        this.precio = precio;
    }

  

    @Override
    public String toString() {
        return "Apartamento{" +
                "arrendatario=" + arrendatario +
                ", propietario=" + propietario +
                ", id=" + id +
                ", nombre='" + nombre + '\'' +
                ", tipoDePropiedad='" + tipoDePropiedad + '\'' +
                ", ubicacion='" + ubicacion + '\'' +
                ", superficie='" + superficie + '\'' +
                ", precio=" + precio +
                '}';
    }

    public void println(Apartamento apartamento) {
    }

    public void setArrendatario(long l) {
    }
}