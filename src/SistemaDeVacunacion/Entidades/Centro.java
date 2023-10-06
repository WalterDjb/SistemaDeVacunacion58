package SistemaDeVacunacion.Entidades;

import java.util.ArrayList;

public class Centro {
    private int id, stock, capacidad, registrados;
    private String domicilio, provincia, localidad;
    private ArrayList <Vacuna> vacunas;

    public Centro() {
    }

    public Centro(int id, int stock, String domicilio, String provincia, String localidad, int capacidad, int registrados) {
        this.id = id;
        this.stock = stock;
        this.domicilio = domicilio;
        this.provincia = provincia;
        this.localidad = localidad;
        this.capacidad = capacidad;
        this.registrados = registrados;
        this.vacunas = new ArrayList();
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public ArrayList<Vacuna> getVacunas() {
        return vacunas;
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

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public int getRegistrados() {
        return registrados;
    }

    public void setRegistrados(int registrados) {
        this.registrados = registrados;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    
}
