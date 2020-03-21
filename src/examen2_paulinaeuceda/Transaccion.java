
package examen2_paulinaeuceda;

import java.io.Serializable;
import java.util.Date;


public class Transaccion implements Serializable{
    private int numCuenta;
    private String descripcion;
    private Date fecha;

    public Transaccion() {
    }

    public Transaccion(int numCuenta, String descripcion, Date fecha) {
        this.numCuenta = numCuenta;
        this.descripcion = descripcion;
        this.fecha = fecha;
    }

    public int getNumCuenta() {
        return numCuenta;
    }

    public void setNumCuenta(int numCuenta) {
        this.numCuenta = numCuenta;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Transaccion{" + "numCuenta=" + numCuenta + ", descripcion=" + descripcion + ", fecha=" + fecha + '}';
    }
    
    
}
