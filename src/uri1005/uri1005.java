/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uri1005;

import java.util.Scanner;

/**
 *
 * @author magno
 */
public class uri1005 {

    public static void main(String[] args) {
        double a, b, c, d;
        Scanner sc = new Scanner(System.in);
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = a * 3.5;
        d = b * 7.5;
        System.out.format("MEDIA = %.5f\n", (c + d) / 11);
        sc.close();
    }
}
