/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uri1018;

import java.util.Scanner;

/**
 * Exercicio 1018 - Cedulas
 *
 * @author magno
 *
 * Leia um valor inteiro. A seguir, calcule o menor número de notas possíveis
 * (cédulas) no qual o valor pode ser decomposto. As notas consideradas são de
 * 100, 50, 20, 10, 5, 2 e 1. A seguir mostre o valor lido e a relação de notas
 * necessárias.
 *
 * Entrada O arquivo de entrada contém um valor inteiro N (0 < N < 1000000).
 *
 * Saída Imprima o valor lido e, em seguida, a quantidade mínima de notas de
 * cada tipo necessárias, conforme o exemplo fornecido. Não esqueça de imprimir
 * o fim de linha após cada linha, caso contrário seu programa apresentará a
 * mensagem: “Presentation Error”.
 */
public class uri1018 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        sc.close();
        if (a > 0 && a < 1000000) {
            System.out.println(a);
            System.out.printf("%d nota(s) de R$ 100,00\n", a / 100);
            a = a % 100;
            System.out.printf("%d nota(s) de R$ 50,00\n", a / 50);
            a = a % 50;
            System.out.printf("%d nota(s) de R$ 20,00\n", a / 20);
            a = a % 20;
            System.out.printf("%d nota(s) de R$ 10,00\n", a / 10);
            a = a % 10;
            System.out.printf("%d nota(s) de R$ 5,00\n", a / 5);
            a = a % 5;
            System.out.printf("%d nota(s) de R$ 2,00\n", a / 2);
            a = a % 2;
            System.out.printf("%d nota(s) de R$ 1,00\n", a);
        }
    }
}
