/*
 * Java Examples
 * Version 1.0
 * Copyright (C) GiusNiyyel, Inc - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by Daniel Campos <giusniyyel@gmail.com>, May 2018
 */

package Mul35;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Mul {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        int mul3,mul5,valor,f;
        mul3=0;
        mul5=0;
        for(f=1;f<=5;f++) {
            System.out.println("Ingrese un valor:");
            valor=teclado.nextInt();
            if (valor%3==0)
                mul3=mul3+1;
            if (valor%5==0)
                mul5=mul5+1;
        }
        System.out.println("Cantidad de valores ingresados múltiplos de 3:");
        System.out.println(mul3);
        System.out.println("Cantidad de valores ingresados múltiplos de 5:");
        System.out.println(mul5);
    }
}
