/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uri1021;

import java.util.Scanner;

/**
 *
 * @author magno
 */
public class uri1021 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double b = sc.nextDouble();
        sc.close();
        int a = (int) b;
        int c = (int) ((b - a) * 100);
        System.out.println("NOTAS:");
        System.out.printf("%d nota(s) de R$ 100.00\n", a / 100);
        a = a % 100;
        System.out.printf("%d nota(s) de R$ 50.00\n", a / 50);
        a = a % 50;
        System.out.printf("%d nota(s) de R$ 20.00\n", a / 20);
        a = a % 20;
        System.out.printf("%d nota(s) de R$ 10.00\n", a / 10);
        a = a % 10;
        System.out.printf("%d nota(s) de R$ 5.00\n", a / 5);
        a = a % 5;
        System.out.printf("%d nota(s) de R$ 2.00\n", a / 2);
        a = a % 2;
        System.out.println("MOEDAS:");
        System.out.printf("%d moeda(s) de R$ 1.00\n", a);
        System.out.printf("%d moeda(s) de R$ 0.50\n", c / 50);
        c = c % 50;
        System.out.printf("%d moeda(s) de R$ 0.25\n", c / 25);
        c = c % 25;
        System.out.printf("%d moeda(s) de R$ 0.10\n", c / 10);
        c = c % 10;
        System.out.printf("%d moeda(s) de R$ 0.05\n", c / 05);
        c = c % 5;
        System.out.printf("%d moeda(s) de R$ 0.01\n", c);
    }
}
