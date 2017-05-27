package sensor;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class MeuThread extends Thread {

    Scanner sc = new Scanner(System.in);

    private JLabel jLabel1;
    private JTextField jTextField1;
    private JTextField jTextField2;
    private JTextField jTextField3;

    public MeuThread(JLabel jLabel1, JTextField jTextField1, JTextField jTextField2, JTextField jTextField3) {
        this.jLabel1 = jLabel1;
        this.jTextField1 = jTextField1;
        this.jTextField2 = jTextField2;
        this.jTextField3 = jTextField3;
    }

    @Override
    public void run() {
        String s = "s";
        while (s == "s") {
            int sensor = sc.nextInt();
            String texto = sc.next();
            for (int i = 0; i < sensor; i++) {
                
                jTextField1.setText(texto);
                jLabel1.updateUI();
            }

        }

        try {
            Thread.sleep(100);

//            JOptionPane.showInputDialog("Sensores controlando:\n------------------------\nSensor1 ="+valor);
        } catch (InterruptedException ex) {
            Logger.getLogger(MeuThread.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
