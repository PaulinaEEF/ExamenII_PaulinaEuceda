package examen2_paulinaeuceda;

import java.io.Serializable;
import java.util.Date;

public class Log implements Serializable{
    private Usuario usuario;
    private String accion;
    private Date fecha;

    public Log() {
    }

    public Log(Usuario usuario, String accion, Date fecha) {
        this.usuario = usuario;
        this.accion = accion;
        this.fecha = fecha;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public String getAccion() {
        return accion;
    }

    public void setAccion(String accion) {
        this.accion = accion;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Log{" + "usuario=" + usuario + ", accion=" + accion + ", fecha=" + fecha + '}';
    }
    
    
}
