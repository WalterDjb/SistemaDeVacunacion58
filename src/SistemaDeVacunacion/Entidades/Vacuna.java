package SistemaDeVacunacion.Entidades;

import java.time.LocalDateTime;

public class Vacuna {
    private Laboratorio laboratorio;
    private int cantidad, serial;
    private LocalDateTime vencimiento;
    private boolean colocada = false;
    
    public Vacuna() {
    }

    public Vacuna(Laboratorio laboratorio, int cantidad, int serial, LocalDateTime vencimiento) {
        this.laboratorio = laboratorio;
        this.cantidad = cantidad;
        this.serial = serial;
        this.vencimiento = vencimiento;
    }

    public Laboratorio getLaboratorio() {
        return laboratorio;
    }

    public void setLaboratorio(Laboratorio laboratorio) {
        this.laboratorio = laboratorio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getSerial() {
        return serial;
    }

    public void setSerial(int serial) {
        this.serial = serial;
    }

    public LocalDateTime getVencimiento() {
        return vencimiento;
    }

    public void setVencimiento(LocalDateTime vencimiento) {
        this.vencimiento = vencimiento;
    }

    public boolean isColocada() {
        return colocada;
    }

    public void setColocada(boolean colocada) {
        this.colocada = colocada;
    }
    
    
}
