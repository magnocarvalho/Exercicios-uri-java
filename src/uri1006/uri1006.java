/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uri1006;

import java.util.Scanner;

/**
 *
 * @author magno
 */
public class uri1006 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a, b, c, m;
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();
        sc.close();
        m = (((a * 2) + (b * 3) + (c * 5)) / 10);
        System.out.format("MEDIA = %.1f\n", m);
    }
}
