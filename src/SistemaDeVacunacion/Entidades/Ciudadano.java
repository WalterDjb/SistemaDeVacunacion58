package SistemaDeVacunacion.Entidades;

import java.time.LocalDateTime;

public class Ciudadano {
    private String nombre, email, domicilio, trabajo, patologia, provincia, localidad;
    private int dni, celular, dosis;
    private long numTramite;
    private LocalDateTime ultimaDosis;
    
    public Ciudadano(){}
    
    public Ciudadano(String nombre, int dni, String provincia, String localidad, String email, String domicilio, String trabajo, String patologia, long numTramite, int celular, int dosis, LocalDateTime ultimaDosis){
        this.nombre = nombre;
        this.dni = dni;
        this.provincia = provincia;
        this.localidad = localidad;
        this.email = email;
        this.domicilio = domicilio;
        this.trabajo = trabajo;
        this.patologia = patologia;
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

    public long getNumTramite() {
        return numTramite;
    }

    public void setNumTramite(long numTramite) {
        this.numTramite = numTramite;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }
    
    
}
