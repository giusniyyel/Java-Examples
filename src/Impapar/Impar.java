/*
 * Java Examples
 * Version 1.0
 * Copyright (C) GiusNiyyel, Inc - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by Daniel Campos <giusniyyel@gmail.com>, May 2018
 */

package Impapar;

import java.util.Scanner;

/**
 *
 * @author Giusniyyel
 */
public class Impar {

    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
        int i=0, n, y, x, p=0, im=0;
        
        System.out.println("¿Cuántos números desea leer?");
        n=entrada.nextInt();
        
        while(i<n){
            System.out.println("Introduzca el numero no."+(i+1)+":");
            x=entrada.nextInt();
            if(x%2==0)
                p+=1;
            else
                im+=1;
            i+=1;
        }
        System.out.println("Números pares: "+p);
        System.out.println("Números impares: "+im);
    }   
}
