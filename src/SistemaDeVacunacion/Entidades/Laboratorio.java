package SistemaDeVacunacion.Entidades;

public class Laboratorio {
    private String nombre, pais, domicilio;
    private int cuit, stock;

    public Laboratorio() {
    }

    public Laboratorio(String nombre, String pais, String domicilio, int cuit) {
        this.nombre = nombre;
        this.pais = pais;
        this.domicilio = domicilio;
        this.cuit = cuit;
        this.stock = stock;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public int getCuit() {
        return cuit;
    }

    public void setCuit(int cuit) {
        this.cuit = cuit;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
}
