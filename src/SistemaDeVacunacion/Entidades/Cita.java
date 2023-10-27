package SistemaDeVacunacion.Entidades;

import java.time.LocalDateTime;

public class Cita {
    private Centro centro;
    private int dosis, id;
    private Ciudadano ciudadano;
    private LocalDateTime fechaHoraCita, fechaHoraColocacion;
    private Vacuna vacuna;
    private String estadoCita, nSerie;

    public Cita() {
    }

    public Cita(LocalDateTime fechaHoraCita, int dosis, String nSerie, Ciudadano ciudadano, LocalDateTime fechaHoraColocacion, Vacuna vacuna, Centro centro, String estadoCita, int id) {
        this.centro = centro;
        this.fechaHoraCita = fechaHoraCita;
        this.dosis = dosis;
        this.nSerie = nSerie;
        this.ciudadano = ciudadano;
        this.fechaHoraColocacion = fechaHoraColocacion;
        this.vacuna = vacuna;
        this.estadoCita = estadoCita;
        this.id = id;
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
    
}
