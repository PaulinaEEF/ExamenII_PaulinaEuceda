
package examen2_paulinaeuceda;

import java.util.ArrayList;


public class UMantenimiento extends Usuario{
    private ArrayList<ATM> atms = new ArrayList();

    public UMantenimiento() {
    }

    public UMantenimiento(int id, String pnombre, String snombre, String papellido, String cotra, String sapellido, int anio) {
        super(id, pnombre, snombre, papellido, cotra, sapellido, anio);
    }

    public ArrayList<ATM> getAtms() {
        return atms;
    }

    public void setAtms(ArrayList<ATM> atms) {
        this.atms = atms;
    }

    @Override
    public String toString() {
        return "UMantenimiento{" + "atms=" + atms + '}';
    }
    
    
    
}
