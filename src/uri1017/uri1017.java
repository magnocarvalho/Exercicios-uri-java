/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uri1017;

import java.util.Scanner;

/**
 *
 * @author magno
 */
public class uri1017 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int m = sc.nextInt();
        float aux = t * m;
        sc.close();
        System.out.printf("%.3f\n", aux / 12);
    }
}
