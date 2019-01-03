/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uri1051;

import java.util.Scanner;

/**
 *
 * @author magno
 */
public class uri1051 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        if (a > 0 && a <= 2000) {
            System.out.printf("Isento\n");
        } else if (a <= 3000) {
            a = a - 2000;
            System.out.printf("R$ %.2f\n", (a / 100) * 8);
        } else if (a <= 4500) {
            a = a - 3000;
            System.out.printf("R$ %.2f\n", 80 + ((a / 100) * 18));
        } else {
            a = a - 4500;
            System.out.printf("R$ %.2f\n", 350 + ((a / 100) * 28));
        }
    }
}
