/*
 * Java Examples
 * Version 1.0
 * Copyright (C) GiusNiyyel, Inc - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by Daniel Campos <giusniyyel@gmail.com>, May 2018
 */

package Alturas;

import java.util.Scanner;

/**
 *
 * @author GiusNIyyel
 */
public class Altura {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int i=0, n;
        float x, prom, y=0;
        
        System.out.println("¿Cuántas personas?");
        n=entrada.nextInt();
        
        while(i<n){
            System.out.println("Introduzca la altura: "+(i+1));
            x=entrada.nextFloat();
            y+=x;
            i+=1;
        }
        prom=y/(float)n;
        System.out.println("La altura promedio es de: "+prom);
    }
    
}
