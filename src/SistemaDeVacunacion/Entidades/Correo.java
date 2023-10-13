package SistemaDeVacunacion.Entidades;

import SistemaDeVacunacion.Conexiones.Conexion;
import SistemaDeVacunacion.Vistas.Recovery;
import java.sql.*;
import java.util.Properties;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.*;
import javax.mail.internet.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Walter Benítez
 */
public class Correo {

    private static String remitente = "soportevacunacion@gmail.com";
    private static String contraseña = "egycedywrtgkyyzr";
    public static String destinatario = Recovery.correoRecuperacion;
    private static String usuario;
    private static String contraTemp;
    private static String contenido;

    private static Session s;
    private static MimeMessage m;

    public static void enviarPassword() {
        contraTemp = generarContraTemp();

        try {
            Connection cn = Conexion.getConexion();
            PreparedStatement pst = cn.prepareStatement("update acceso set contra = ?, tipoContra = ? where email = '" + destinatario + "'");
            pst.setString(1, contraTemp);
            pst.setString(2, "B");

            pst.executeUpdate();
        } catch (SQLException e) {
        }

        try {
            Connection cn = Conexion.getConexion();
            PreparedStatement pst = cn.prepareStatement("select usuario from acceso where email = '" + destinatario + "'");

            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                usuario = rs.getString("usuario");
                contenido = "<p>&iexcl;Hola <strong>" + usuario + "</strong>!</p><p>Se ha solicitado una recuperaci&oacute;n de contrase&ntilde;a para tu cuenta de SISTEMA DE VACUNACI&Oacute;N. Este dato es exclusivo para que puedas ingresar a tu cuenta, no lo compartas con nadie.</p><p>&nbsp;</p><p><strong>Usuario: " + usuario + "</strong></p><p><strong>Contrase&ntilde;a temporal: " + contraTemp + "</strong></p><p><br />Ingresa al sistema con estas credenciales. Recuerda que tendr&aacute;s que generar una contrase&ntilde;a nueva una vez que ingreses con la contrase&ntilde;a temporal.</p><p>&nbsp;</p><p>Saludos.</p>";
            } else {
                System.out.println("Error al cargar datos de usuario");
            }
        } catch (SQLException e) {
        }

        s = Session.getDefaultInstance(protocolo());
        m = new MimeMessage(s);

        try {
            m.setFrom(new InternetAddress(remitente));
            m.setRecipient(Message.RecipientType.TO, new InternetAddress(destinatario));
            m.setSubject("DATOS DE ACCESO");
            m.setText(contenido, "ISO-8859-1", "html");
        } catch (AddressException ex) {
            Logger.getLogger(Correo.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MessagingException ex) {
            Logger.getLogger(Correo.class.getName()).log(Level.SEVERE, null, ex);
        }

        enviar();
    }

    private static String generarContraTemp() {
        Random r = new Random();
        String contraTemp = "";
        int n;
        char c;

        for (int i = 0; i < 8; i++) {
            n = r.nextInt(62);

            if (n >= 0 && n <= 9) {
                char digito = (char) (n + '0');
                contraTemp += digito;
            } else if (n >= 10 && n <= 35) {
                char letra = (char) (n - 10 + 'A');
                contraTemp += letra;
            } else {
                char letra = (char) (n - 36 + 'a');
                contraTemp += letra;
            }
        }
        return contraTemp;
    }

    private static Properties protocolo() {
        Properties p = new Properties();

        p.put("mail.smtp.host", "smtp.gmail.com");
        p.put("mail.smtp.ssl.trust", "smtp.gmail.com");
        p.setProperty("mail.smtp.starttls.enable", "true");
        p.setProperty("mail.smtp.port", "587");
        p.setProperty("mail.smtp.user", remitente);
        p.setProperty("mail.smtp.ssl.protocols", "TLSv1.2");
        p.setProperty("mail.smtp.auth", "true");

        return p;
    }

    private static void enviar() {
        try {
            Transport t = s.getTransport("smtp");
            t.connect(remitente, contraseña);
            t.sendMessage(m, m.getRecipients(Message.RecipientType.TO));
            t.close();

            JOptionPane.showMessageDialog(null, "Correo enviado");
        } catch (NoSuchProviderException ex) {
            Logger.getLogger(Correo.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MessagingException ex) {
            Logger.getLogger(Correo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
