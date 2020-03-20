
package examen2_paulinaeuceda;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JLabel;


public class HoraHilo implements Runnable{
    private JLabel hora;

    public HoraHilo(JLabel hora) {
        this.hora = hora;
    }
    
    @Override
    public void run() {
        while(true){
            Date h = new Date();
            DateFormat f = new SimpleDateFormat("dd/M/yyyy hh:mm:ss");
            hora.setText(f.format(h));
            try{
                Thread.sleep(50);
            }catch(InterruptedException ex){
                
            }
        }
    }
}
