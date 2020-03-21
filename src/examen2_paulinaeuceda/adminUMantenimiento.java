
package examen2_paulinaeuceda;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;


public class adminUMantenimiento {
    private ArrayList<UMantenimiento> listaMante = new ArrayList();
    private File archivo = null;
    
    public adminUMantenimiento(String path) {
        archivo = new File(path);
    }

    public ArrayList<UMantenimiento> getListaMante() {
        return listaMante;
    }

    public void setListaMante(ArrayList<UMantenimiento> listaMante) {
        this.listaMante = listaMante;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }
    
    public void setUMantenimiento(UMantenimiento a){
        listaMante.add(a);
    }
    
    
    public void cargarArchivo() {
        try {            
            listaMante = new ArrayList();
            UMantenimiento temp;
            if (archivo.exists()) {
                FileInputStream entrada = new FileInputStream(archivo);
                ObjectInputStream objeto
                    = new ObjectInputStream(entrada);
                try {
                    while ((temp = (UMantenimiento) objeto.readObject()) != null) {
                        listaMante.add(temp);
                    }
                } catch (EOFException e) {
                    //encontro el final del archivo
                }
                objeto.close();
                entrada.close();
            }            
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void escribirArchivo() {
        FileOutputStream fw = null;
        ObjectOutputStream bw = null;
        try {
            fw = new FileOutputStream(archivo);
            bw = new ObjectOutputStream(fw);
            for (UMantenimiento t : listaMante) {
                bw.writeObject(t);
            }
            bw.flush();
        } catch (Exception ex) {
        } finally {
            try {
                bw.close();
                fw.close();
            } catch (Exception ex) {
            }
        }
    }
}
