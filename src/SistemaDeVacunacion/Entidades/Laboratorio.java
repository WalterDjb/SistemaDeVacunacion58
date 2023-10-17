package SistemaDeVacunacion.Entidades;

public class Laboratorio {
    private String nombre, pais, direccion;
    private long cuit, stock;

    public Laboratorio() {
    }

    public Laboratorio(String nombre, String pais, String direccion, String cuit, long stock) {
        this.nombre = nombre;
        this.pais = pais;
        this.direccion = direccion;
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

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
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
