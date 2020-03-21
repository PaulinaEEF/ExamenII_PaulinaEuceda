
package examen2_paulinaeuceda;

import java.io.Serializable;


public class Usuario implements Serializable{
    private int id;
    private String pnombre, snombre, papellido, cotra, sapellido;
    private int naci, afi;

    public Usuario() {
    }

    public Usuario(int id, String pnombre, String snombre, String papellido, String cotra, String sapellido, int naci, int afi) {
        this.id = id;
        this.pnombre = pnombre;
        this.snombre = snombre;
        this.papellido = papellido;
        this.cotra = cotra;
        this.sapellido = sapellido;
        this.naci = naci;
        this.afi = afi;
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

    public int getNaci() {
        return naci;
    }

    public void setNaci(int naci) {
        this.naci = naci;
    }

    public int getAfi() {
        return afi;
    }

    public void setAfi(int afi) {
        this.afi = afi;
    }

    @Override
    public String toString() {
        return "Usuario{" + "id=" + id + ", pnombre=" + pnombre + ", snombre=" + snombre + ", papellido=" + papellido + ", cotra=" + cotra + ", sapellido=" + sapellido + ", naci=" + naci + ", afi=" + afi + '}';
    }

}
