/*
 * Java Examples
 * Version 1.0
 * Copyright (C) GiusNiyyel, Inc - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by Daniel Campos <giusniyyel@gmail.com>, May 2018
 */

package Recursividad;

public class Fact {

   int factorial(int fact) {
        if (fact>0) {
            int valor=fact * factorial(fact-1);
            return valor;
        } else
            return 1;
    }
    
    public static void main(String[] ar) {
        Fact re=new Fact();
        int f=re.factorial(4);
        System.out.println("El factorial de 4 es "+f);
    }    
}
