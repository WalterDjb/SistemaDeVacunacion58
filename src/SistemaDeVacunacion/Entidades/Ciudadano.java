package SistemaDeVacunacion.Entidades;

import java.time.LocalDateTime;

public class Ciudadano {
    private String nombre, apellido, email, domicilio, trabajo, patologia, provincia, localidad, ambito;
    private int dni, dosis;
    private long numTramite, celular;
    private LocalDateTime ultimaDosis;
    
    public Ciudadano(){}
    
    public Ciudadano(String nombre, String apellido, String ambito, int dni, String provincia, String localidad, String email, String domicilio, String trabajo, String patologia, long numTramite, long celular, int dosis, LocalDateTime ultimaDosis){
        this.nombre = nombre;
        this.apellido = apellido;
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
        this.ambito = ambito;
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

    public long getCelular() {
        return celular;
    }

    public void setCelular(long celular) {
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

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getAmbito() {
        return ambito;
    }

    public void setAmbito(String ambito) {
        this.ambito = ambito;
    }
    
    
}
