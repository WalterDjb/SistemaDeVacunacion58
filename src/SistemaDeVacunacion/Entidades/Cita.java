package SistemaDeVacunacion.Entidades;

import java.time.LocalDateTime;

public class Cita {
    private Centro centro;
    private int dosis, codigo;
    private Ciudadano ciudadano;
    private LocalDateTime fechaHoraCita, fechaHoraColocacion;
    private Vacuna vacuna;

    public Cita() {
    }

    public Cita(LocalDateTime fechaHoraCita, int dosis, int codigo, Ciudadano ciudadano, LocalDateTime fechaHoraColocacion, Vacuna vacuna, Centro centro) {
        this.centro = centro;
        this.fechaHoraCita = fechaHoraCita;
        this.dosis = dosis;
        this.codigo = codigo;
        this.ciudadano = ciudadano;
        this.fechaHoraColocacion = fechaHoraColocacion;
        this.vacuna = vacuna;
    }

    public Centro getCentro() {
        return centro;
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

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
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
}
