/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uri1037;

import java.util.Scanner;

/**
 *
 * @author magno
 */
public class uri1037 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        if (b > c && d > a && (c + d) > (a + b) && c > 0 && d > 0 && a % 2 == 0) {
            System.out.println("Valores aceitos");
        } else {
            System.out.println("Valores nao aceitos");
        }
    }
}
