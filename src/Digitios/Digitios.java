/*
 * Java Examples
 * Version 1.0
 * Copyright (C) GiusNiyyel, Inc - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by Daniel Campos <giusniyyel@gmail.com>, May 2018
 */

package Digitios;

import java.util.Scanner;

/**
 * @author Giusniyyel
 */
public class Digitios {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int x;
        System.out.println("Introduzca un número: ");
        x=entrada.nextInt();
        if(x<10)
            System.out.println("Contiene una cifra");
        else
            if(x<100)
                System.out.println("Contiene dos cifras");
            else
                if(x<1000)
                    System.out.println("Contiene tres cifras");
                else
                    System.out.println("El número de cifras es mayor");
    } 
}
