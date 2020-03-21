
package examen2_paulinaeuceda;

import java.util.ArrayList;


public class UMantenimiento extends Usuario{
    private ArrayList<ATM> atms = new ArrayList();

    public UMantenimiento() {
    }

    public UMantenimiento(int id, String pnombre, String snombre, String papellido, String cotra, String sapellido, int naci, int afi) {
        super(id, pnombre, snombre, papellido, cotra, sapellido, naci, afi);
    }

    public ArrayList<ATM> getAtms() {
        return atms;
    }

    public void setAtms(ArrayList<ATM> atms) {
        this.atms = atms;
    }

    @Override
    public String toString() {
        return super.toString()+"UMantenimiento{" + "atms=" + atms + '}';
    }
    
    
    
}
