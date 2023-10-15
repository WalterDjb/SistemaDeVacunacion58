package SistemaDeVacunacion.Entidades;

import java.time.LocalDateTime;

public class Ciudadano {
    private String nombre, email, domicilio, trabajo, patologia;
    private int dni, celular, dosis, numTramite;
    private LocalDateTime ultimaDosis;
    
    public Ciudadano(){}
    
    public Ciudadano(String nombre, String email, String domicilio, String trabajo, String patologia, int dni, int numTramite, int celular, int dosis, LocalDateTime ultimaDosis){
        this.nombre = nombre;
        this.email = email;
        this.domicilio = domicilio;
        this.trabajo = trabajo;
        this.patologia = patologia;
        this.dni = dni;
        this.numTramite =  numTramite;
        this.celular = celular;
        this.dosis = dosis;
        this.ultimaDosis = ultimaDosis;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getTrabajo() {
        return trabajo;
    }

    public void setTrabajo(String trabajo) {
        this.trabajo = trabajo;
    }

    public String getPatologia() {
        return patologia;
    }

    public void setPatologia(String patologia) {
        this.patologia = patologia;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public int getCelular() {
        return celular;
    }

    public void setCelular(int celular) {
        this.celular = celular;
    }

    public int getDosis() {
        return dosis;
    }

    public void setDosis(int dosis) {
        this.dosis = dosis;
    }

    public LocalDateTime getUltimaDosis() {
        return ultimaDosis;
    }

    public void setUltimaDosis(LocalDateTime ultimaDosis) {
        this.ultimaDosis = ultimaDosis;
    }

    public int getNumTramite() {
        return numTramite;
    }

    public void setNumTramite(int numTramite) {
        this.numTramite = numTramite;
    }
}
