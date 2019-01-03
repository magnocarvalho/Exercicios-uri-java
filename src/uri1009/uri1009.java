/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uri1009;

import java.util.Scanner;

/**
 *
 * @author magno
 */
public class uri1009 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nome;
        double s, v, c;
        nome = sc.nextLine();
        s = sc.nextDouble();
        v = sc.nextDouble();
        sc.close();
        c = (v / 100) * 15;
        System.out.format("TOTAL = R$ %.2f\n", (s + c));
    }
}
