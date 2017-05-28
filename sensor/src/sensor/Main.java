/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sensor;

import java.util.Scanner;

/**
 *
 * @author 631410161
 */
public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s = "s";
        while (s == "s") {
            int sensor = sc.nextInt();
            String texto = sc.next();

            System.out.println("aqui = " + texto);


        }
    }
}
