/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uri1002;

import java.util.Scanner;

/**
 *
 * @author magno
 */
public class uri1002 {

    public static void main(String[] args) {
        double raio, area, pi = 3.14159;
        Scanner a = new Scanner(System.in);
        raio = a.nextDouble();
        area = (raio * raio) * pi;
        a.close();
        System.out.print("A=");
        System.out.format("%.4f\n", area);
    }
}
