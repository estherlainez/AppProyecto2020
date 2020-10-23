package com.example.pruebasqlserver;

public class Actividad {
    private int idActividad;
    private String grupoActividad;
    private String  descripcionActividad;
    private String horarioActividad;

    public Actividad() {
    }

    public Actividad(int idActividad, String grupoActividad, String descripcionActividad, String horarioActividad) {
        this.idActividad = idActividad;
        this.grupoActividad = grupoActividad;
        this.descripcionActividad = descripcionActividad;
        this.horarioActividad = horarioActividad;
    }

    public Actividad(String grupoActividad, String descripcionActividad, String horarioActividad) {
        this.grupoActividad = grupoActividad;
        this.descripcionActividad = descripcionActividad;
        this.horarioActividad = horarioActividad;
    }

    public int getIdActividad() {
        return idActividad;
    }

    public void setIdActividad(int idActividad) {
        this.idActividad = idActividad;
    }

    public String getGrupoActividad() {
        return grupoActividad;
    }

    public void setGrupoActividad(String grupoActividad) {
        this.grupoActividad = grupoActividad;
    }

    public String getDescripcionActividad() {
        return descripcionActividad;
    }

    public void setDescripcionActividad(String descripcionActividad) {
        this.descripcionActividad = descripcionActividad;
    }

    public String getHorarioActividad() {
        return horarioActividad;
    }

    public void setHorarioActividad(String horarioActividad) {
        this.horarioActividad = horarioActividad;
    }
}
