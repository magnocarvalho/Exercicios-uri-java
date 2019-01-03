/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uri1019;

import java.util.Scanner;

/**
 *
 * @author magno
 */
public class uri1019 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.printf("%d:%d:%d\n", a / 3600, (a % 3600) / 60, ((a % 3600) % 60));
    }
}
