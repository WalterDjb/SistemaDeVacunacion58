package SistemaDeVacunacion.Entidades;

/**
 *
 * @author Walter Benítez
 */
public class Acceso {
    private int nivel;
    private String nombre;
    private String email;
    private String usuario;
    private String contra;
    private String tipoContra;

    public Acceso() {
    }

    public Acceso(int nivel, String nombre, String email, String usuario, String contra, String tipoContra) {
        this.nivel = nivel;
        this.nombre = nombre;
        this.email = email;
        this.usuario = usuario;
        this.contra = contra;
        this.tipoContra = tipoContra;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
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

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContra() {
        return contra;
    }

    public void setContra(String contra) {
        this.contra = contra;
    }

    public String getTipoContra() {
        return tipoContra;
    }

    public void setTipoContra(String tipoContra) {
        this.tipoContra = tipoContra;
    }
}
