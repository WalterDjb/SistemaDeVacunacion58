package SistemaDeVacunacion.Entidades;

public class Laboratorio {
    private String nombre, pais, domicilio;
    private long cuit, stock;

    public Laboratorio() {
    }

    public Laboratorio(String nombre, String pais, String domicilio, String cuit, long stock) {
        this.nombre = nombre;
        this.pais = pais;
        this.domicilio = domicilio;
        this.cuit = Long.parseLong(cuit);
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

    public long getCuit() {
        return cuit;
    }

    public void setCuit(long cuit) {
        this.cuit = cuit;
    }

    public long getStock() {
        return stock;
    }

    public void setStock(long stock) {
        this.stock = stock;
    }
}
