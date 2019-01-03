/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uri1003;

import java.util.Scanner;

/**
 *PROBLEMA:
 * 1003 - Soma Simples
RESPOSTA:Accepted
LINGUAGEM: Java 7 (OpenJDK 1.7.0) [+2s]
TEMPO:0.068s
TAMANHO:555 Bytes
SUBMISSÃO: 29/12/15 04:18:09
 * @author magno
 */
public class uri1003 {

    public static void main(String[] args) {
        int a, b;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        System.out.format("SOMA = %d\n", (a + b));
        sc.close();
    }
}
