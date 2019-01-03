/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uri1004;

import java.util.Scanner;

/**
 *
 * @author magno
 */
public class uri1004 {
    public static void main(String[] args) {
        	Scanner sc = new Scanner(System.in);
		int a, b;
		a = sc.nextInt();
		b = sc.nextInt();
		sc.close();
		System.out.format("PROD = %d\n", (a * b));
    }
}
