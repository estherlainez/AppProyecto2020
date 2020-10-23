package com.example.pruebasqlserver;

import java.util.Date;

public class Suscripcion {
    private int idCliente;
    private int idActividad;
    private Date fechaSuscripcion;

    public Suscripcion() {
    }

    public Suscripcion(int idCliente, int idActividad, Date fechaSuscripcion) {
        this.idCliente = idCliente;
        this.idActividad = idActividad;
        this.fechaSuscripcion = fechaSuscripcion;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public int getIdActividad() {
        return idActividad;
    }

    public void setIdActividad(int idActividad) {
        this.idActividad = idActividad;
    }

    public Date getFechaSuscripcion() {
        return fechaSuscripcion;
    }

    public void setFechaSuscripcion(Date fechaSuscripcion) {
        this.fechaSuscripcion = fechaSuscripcion;
    }
}
