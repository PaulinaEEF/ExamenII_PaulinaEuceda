
package examen2_paulinaeuceda;


public class Usuario {
    private int id;
    private String pnombre, snombre, papellido, cotra, sapellido;
    private int anio;

    public Usuario() {
    }

    public Usuario(int id, String pnombre, String snombre, String papellido, String cotra, String sapellido, int anio) {
        this.id = id;
        this.pnombre = pnombre;
        this.snombre = snombre;
        this.papellido = papellido;
        this.cotra = cotra;
        this.sapellido = sapellido;
        this.anio = anio;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPnombre() {
        return pnombre;
    }

    public void setPnombre(String pnombre) {
        this.pnombre = pnombre;
    }

    public String getSnombre() {
        return snombre;
    }

    public void setSnombre(String snombre) {
        this.snombre = snombre;
    }

    public String getPapellido() {
        return papellido;
    }

    public void setPapellido(String papellido) {
        this.papellido = papellido;
    }

    public String getCotra() {
        return cotra;
    }

    public void setCotra(String cotra) {
        this.cotra = cotra;
    }

    public String getSapellido() {
        return sapellido;
    }

    public void setSapellido(String sapellido) {
        this.sapellido = sapellido;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    @Override
    public String toString() {
        return "Usuario{" + "id=" + id + ", pnombre=" + pnombre + ", snombre=" + snombre + ", papellido=" + papellido + ", cotra=" + cotra + ", sapellido=" + sapellido + ", anio=" + anio + '}';
    }
    
    
}
