package com.example.pruebasqlserver;

public class Tarifa {
    private int idTarifa;
    private String nombreTarifa;

    public Tarifa() {
    }

    public Tarifa(int idTarifa, String nombreTarifa) {
        this.idTarifa = idTarifa;
        this.nombreTarifa = nombreTarifa;
    }

    public Tarifa(String nombreTarifa) {
        this.nombreTarifa = nombreTarifa;
    }

    public int getIdTarifa() {
        return idTarifa;
    }

    public void setIdTarifa(int idTarifa) {
        this.idTarifa = idTarifa;
    }

    public String getNombreTarifa() {
        return nombreTarifa;
    }

    public void setNombreTarifa(String nombreTarifa) {
        this.nombreTarifa = nombreTarifa;
    }
}
