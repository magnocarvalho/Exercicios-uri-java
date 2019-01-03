/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uri1011;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author magno
 */
public class uri1011 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger i = new BigInteger("0");
        i = sc.nextBigInteger();
        sc.close();
        i = i.pow(3);
        BigDecimal temp = new BigDecimal(i);
        BigDecimal a = new BigDecimal(4 / 3.0);
        BigDecimal b = a.multiply(temp);
        BigDecimal c = b.multiply(new BigDecimal("3.14159"));
        System.out.printf("VOLUME = %.3f\n", c);
    }
}
