/*
 * Java Examples
 * Version 1.0
 * Copyright (C) GiusNiyyel, Inc - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by Daniel Campos <giusniyyel@gmail.com>, May 2018
 */

package Estrella;

/**
 * @author Giusniyyel
 */
public class stars {

    public static void main(String[] args) {
        int[] arreglo = {0,0,0,0,0,0,1,2,4,2,1};
        System.out.println("Distribucion de calificaciones:");
        for (int contador = 0; contador<arreglo.length;contador++){
            if(contador==10)
                System.out.printf("%5d:",100);
            else
                System.out.printf("%02d-%02d: ",contador*10,contador*10+9);
            for (int estrellas=0;estrellas<arreglo[contador];estrellas++)
                System.out.print("*");
            System.out.println();
        }
    }
    
}
