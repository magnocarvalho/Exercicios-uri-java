/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uri1014;

import java.util.Scanner;

/**
 *
 * @author magno
 */
public class uri1014 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        float b = sc.nextFloat();
        sc.close();
        System.out.printf("%.3f km/l\n", a / b);

    }
}
