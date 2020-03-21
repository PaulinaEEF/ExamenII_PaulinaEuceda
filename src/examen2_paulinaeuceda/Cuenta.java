package examen2_paulinaeuceda;

import java.io.Serializable;

public class Cuenta implements Serializable{
    private int NumCuenta;
    private double saldo;
    private int idprop;

    public Cuenta() {
    }

    public Cuenta(int NumCuenta, double saldo, int idprop) {
        this.NumCuenta = NumCuenta;
        this.saldo = saldo;
        this.idprop = idprop;
    }

    public int getNumCuenta() {
        return NumCuenta;
    }

    public void setNumCuenta(int NumCuenta) {
        this.NumCuenta = NumCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getIdprop() {
        return idprop;
    }

    public void setIdprop(int idprop) {
        this.idprop = idprop;
    }

    @Override
    public String toString() {
        return "Cuenta{" + "NumCuenta=" + NumCuenta + ", saldo=" + saldo + ", idprop=" + idprop + '}';
    }
    
    
}
