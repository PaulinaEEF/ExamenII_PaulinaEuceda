
package examen2_paulinaeuceda;

import java.io.Serializable;
import java.util.ArrayList;


public class ATM implements Serializable{
    private int cant100, cant500;
    private ArrayList<Log> logs = new ArrayList();
    private String ubicacion;
    private int id, anio;
    private String tiempo;

    public ATM() {
    }

    public ATM(int cant100, int cant500, String ubicacion, int id, int anio, String tiempo) {
        this.cant100 = cant100;
        this.cant500 = cant500;
        this.ubicacion = ubicacion;
        this.id = id;
        this.anio = anio;
        this.tiempo = tiempo;
    }

    public int getCant100() {
        return cant100;
    }

    public void setCant100(int cant100) {
        this.cant100 = cant100;
    }

    public int getCant500() {
        return cant500;
    }

    public void setCant500(int cant500) {
        this.cant500 = cant500;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public String getTiempo() {
        return tiempo;
    }

    public void setTiempo(String tiempo) {
        this.tiempo = tiempo;
    }

    public ArrayList<Log> getLogs() {
        return logs;
    }

    public void setLogs(ArrayList<Log> logs) {
        this.logs = logs;
    }
    
    

    @Override
    public String toString() {
        return ubicacion;
    }
    
    
}
