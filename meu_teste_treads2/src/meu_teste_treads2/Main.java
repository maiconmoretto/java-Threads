package meu_teste_treads2;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {

    public static void main(String[] args) {
        for (int i = 0; i <= 100; i++) {

            if (i %2 !=  0) {
                new MeuThread("numeros  imapres " + i, i, i ).start();
            }

        }
    }
}
