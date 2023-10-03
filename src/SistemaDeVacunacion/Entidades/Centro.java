package SistemaDeVacunacion.Entidades;

import java.util.ArrayList;

public class Centro {
    private int stock;
    private String domicilio;
    private ArrayList <Vacuna> vacunas;

    public Centro() {
    }

    public Centro(int stock, String domicilio) {
        this.stock = stock;
        this.domicilio = domicilio;
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
}
