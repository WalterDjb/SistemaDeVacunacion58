package SistemaDeVacunacion.Entidades;

import java.time.LocalDateTime;

public class Cita {
    public Centro centro;
    public int dosis, id, dni;
    public Ciudadano ciudadano;
    public LocalDateTime fechaHoraCita, fechaHoraColocacion;
    public Vacuna vacuna;
    public String estadoCita, nSerie, localidad;

    public Cita() {
    }

    public Cita(LocalDateTime fechaHoraCita, int dosis, int dni, String nSerie, Ciudadano ciudadano, LocalDateTime fechaHoraColocacion, Vacuna vacuna, Centro centro, String estadoCita, int id, String localidad) {
        this.centro = centro;
        this.fechaHoraCita = fechaHoraCita;
        this.dosis = dosis;
        this.nSerie = nSerie;
        this.ciudadano = ciudadano;
        this.fechaHoraColocacion = fechaHoraColocacion;
        this.vacuna = vacuna;
        this.estadoCita = estadoCita;
        this.id = id;
        this.localidad = localidad;
        this.dni = dni;
    }

    public Centro getCentro() {
        return centro;
    }

    public Vacuna getVacuna() {
        return vacuna;
    }

    public void setVacuna(Vacuna vacuna) {
        this.vacuna = vacuna;
    }

    public String getEstadoCita() {
        return estadoCita;
    }

    public void setEstadoCita(String estadoCita) {
        this.estadoCita = estadoCita;
    }

    public void setCentro(Centro centro) {
        this.centro = centro;
    }

    public LocalDateTime getFechaHoraCita() {
        return fechaHoraCita;
    }

    public void setFechaHoraCita(LocalDateTime fechaHoraCita) {
        this.fechaHoraCita = fechaHoraCita;
    }

    public int getDosis() {
        return dosis;
    }

    public void setDosis(int dosis) {
        this.dosis = dosis;
    }

    public String getNSerie() {
        return nSerie;
    }

    public void setNSerie(String nSerie) {
        this.nSerie = nSerie;
    }

    public Ciudadano getCiudadano() {
        return ciudadano;
    }

    public void setCiudadano(Ciudadano ciudadano) {
        this.ciudadano = ciudadano;
    }

    public LocalDateTime getFechaHoraColocacion() {
        return fechaHoraColocacion;
    }

    public void setFechaHoraColocacion(LocalDateTime fechaHoraColocacion) {
        this.fechaHoraColocacion = fechaHoraColocacion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getnSerie() {
        return nSerie;
    }

    public void setnSerie(String nSerie) {
        this.nSerie = nSerie;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }
    
}
