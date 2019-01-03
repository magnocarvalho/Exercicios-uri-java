/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uri1001;

import java.util.Scanner;

/**
 *
 * @author magno
 */
public class uri1001 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        int a, b, x;
        a = entrada.nextInt();
        b = entrada.nextInt();
        x = a + b;
        System.out.printf("X = " + x + "\n");
    }

}
