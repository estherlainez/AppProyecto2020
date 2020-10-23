package com.example.pruebasqlserver;

public class Precio {
    private int idTarifa;
    private int idActividad;
    private float precio;

    public Precio() {
    }

    public Precio(int idTarifa, int idActividad, float precio) {
        this.idTarifa = idTarifa;
        this.idActividad = idActividad;
        this.precio = precio;
    }

    public int getIdTarifa() {
        return idTarifa;
    }

    public void setIdTarifa(int idTarifa) {
        this.idTarifa = idTarifa;
    }

    public int getIdActividad() {
        return idActividad;
    }

    public void setIdActividad(int idActividad) {
        this.idActividad = idActividad;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }
}
