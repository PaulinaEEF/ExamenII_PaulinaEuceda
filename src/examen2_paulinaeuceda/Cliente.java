
package examen2_paulinaeuceda;

import java.util.ArrayList;


public class Cliente extends Usuario{
    ArrayList<Cuenta> cuentas = new ArrayList();
    ArrayList<Transaccion> transacciones = new ArrayList();

    public Cliente() {
    }

    public Cliente(int id, String pnombre, String snombre, String papellido, String cotra, String sapellido, int anio) {
        super(id, pnombre, snombre, papellido, cotra, sapellido, anio);
    }

    public ArrayList<Cuenta> getCuentas() {
        return cuentas;
    }

    public void setCuentas(ArrayList<Cuenta> cuentas) {
        this.cuentas = cuentas;
    }

    public ArrayList<Transaccion> getTransacciones() {
        return transacciones;
    }

    public void setTransacciones(ArrayList<Transaccion> transacciones) {
        this.transacciones = transacciones;
    }

    @Override
    public String toString() {
        return "Cliente{" + "cuentas=" + cuentas + ", transacciones=" + transacciones + '}';
    }
    

    
    
    
}
