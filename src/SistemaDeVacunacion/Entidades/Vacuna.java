package SistemaDeVacunacion.Entidades;

import java.time.LocalDate;

public class Vacuna {
    
    public Laboratorio laboratorio;
    public int serie;
    public String marca, antigeno;
    public boolean estado;
    public LocalDate caducidad;
    public double capacidadDosis;

    public Vacuna() {
    }

    public Vacuna(Laboratorio laboratorio, int serie, String marca, String antigeno, boolean estado, LocalDate caducidad, double capacidadDosis) {
        this.laboratorio = laboratorio;
        this.serie = serie;
        this.marca = marca;
        this.antigeno = antigeno;
        this.estado = estado;
        this.caducidad = caducidad;
        this.capacidadDosis = capacidadDosis;
    }

    public Laboratorio getLaboratorio() {
        return laboratorio;
    }

    public void setLaboratorio(Laboratorio laboratorio) {
        this.laboratorio = laboratorio;
    }

    public int getSerie() {
        return serie;
    }

    public void setSerie(int serie) {
        this.serie = serie;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getAntigeno() {
        return antigeno;
    }

    public void setAntigeno(String antigeno) {
        this.antigeno = antigeno;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public LocalDate getCaducidad() {
        return caducidad;
    }

    public void setCaducidad(LocalDate caducidad) {
        this.caducidad = caducidad;
    }

    public double getCapacidadDosis() {
        return capacidadDosis;
    }

    public void setCapacidadDosis(double capacidadDosis) {
        this.capacidadDosis = capacidadDosis;
    }
}
