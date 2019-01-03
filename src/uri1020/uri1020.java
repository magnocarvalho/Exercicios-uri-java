/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uri1020;

import java.util.Scanner;

/**
 *
 * @author magno
 */
public class uri1020 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.printf("%d ano(s)\n%d mes(es)\n%d dia(s)\n", (a / 365), ((a % 365) / 30), ((a % 365) % 30));
    }
}
