/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uri1007;

import java.util.Scanner;

/**
 *PROBLEMA:1007 - Diferença
 * @author magno
 */
public class uri1007 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c, d, diferenca;
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        d = sc.nextInt();
        sc.close();
        diferenca = ((a * b) - (c * d));
        System.out.format("DIFERENCA = %d\n", diferenca);
    }
}
