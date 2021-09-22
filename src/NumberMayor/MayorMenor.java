/*
 * Java Examples
 * Version 1.0
 * Copyright (C) GiusNiyyel, Inc - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by Daniel Campos <giusniyyel@gmail.com>, May 2018
 */

package NumberMayor;

import java.util.Scanner;

public class MayorMenor {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float x,y;
        System.out.println("Introduzca el primer numero: ");
        x=entrada.nextFloat();
        System.out.println("Introduzca el segundo numero: ");
        y=entrada.nextFloat();
        if(x>y)
            System.out.println("La suma es: "+(x+y)+"La diferencia: "+(x-y));
        else
            System.out.println("El producto es: "+(x*y)+" La division es: "+(x/y));
    }
}
