/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uri1041;

import java.util.Scanner;

/**
 *
 * @author magno
 */
public class uri1041 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        if (x == 0 && y != 0) {
            System.out.printf("Eixo Y\n");
        } else if (x != 0 && y == 0) {
            System.out.printf("Eixo X\n");
        } else if (x == 0 && y == 0) {
            System.out.println("Origem");
        } else if (x > 0) {
            if (y > 0) {
                System.out.println("Q1");
            } else {
                System.out.println("Q4");
            }
        } else {
            if (y > 0) {
                System.out.println("Q2");
            } else {
                System.out.println("Q3");
            }
        }
    }
}
