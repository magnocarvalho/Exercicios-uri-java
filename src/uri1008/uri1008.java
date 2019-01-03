/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uri1008;

import java.util.Scanner;

/**
 *
 * @author magno
 */
public class uri1008 {

    public static void main(String[] args) {
        int f, h;
        double d;
        Scanner sc = new Scanner(System.in);
        f = sc.nextInt();
        h = sc.nextInt();
        d = sc.nextDouble();
        sc.close();
        System.out.format("NUMBER = %d\nSALARY = U$ %.2f\n", f, (h * d));
    }
}
