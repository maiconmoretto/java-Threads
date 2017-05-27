package despertador;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class ThreadDespertador extends Thread {

    private JLabel labelDespertador;

    public ThreadDespertador(JLabel labelDespertador) {
        this.labelDespertador = labelDespertador;
    }

    @Override
    public void run() {
        int tempo = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o tempo em segundos"));
        int hora = 0, minuto = 0, segundo = 0;
        for (int valor = 0; valor < 1000000; valor++) {
            segundo++;
            if (segundo == 60) {
                segundo = 0;
                minuto++;
                if (minuto == 60) {
                    hora++;
                    minuto = 0;
                    if (hora == 24) {
                        hora = 0;
                    }

                }

            }
            String horaS = String.valueOf(hora);
            String minutoS = String.valueOf(minuto);
            String segundoS = String.valueOf(segundo);
            System.out.println("segundos " + segundoS);
            if (segundo == tempo) {
                JOptionPane.showMessageDialog(null, "DESPERTADOR");
             
            }

//            labelDespertador.setText(horaS + ":" + minutoS + ":" + segundoS);
//            labelDespertador.updateUI();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(ThreadDespertador.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
