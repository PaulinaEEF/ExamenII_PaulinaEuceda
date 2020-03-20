
package examen2_paulinaeuceda;


public class ATM {
    private int cant100, cant500;
    private Log log;
    private String ubicacion;
    private int id, anio;
    private String tiempo;

    public ATM() {
    }

    public ATM(int cant100, int cant500, Log log, String ubicacion, int id, int anio, String tiempo) {
        this.cant100 = cant100;
        this.cant500 = cant500;
        this.log = log;
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

    public Log getLog() {
        return log;
    }

    public void setLog(Log log) {
        this.log = log;
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

    @Override
    public String toString() {
        return "ATM{" + "cant100=" + cant100 + ", cant500=" + cant500 + ", log=" + log + ", ubicacion=" + ubicacion + ", id=" + id + ", anio=" + anio + ", tiempo=" + tiempo + '}';
    }
    
    
}
