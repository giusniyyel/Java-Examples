/*
 * Java Examples
 * Version 1.0
 * Copyright (C) GiusNiyyel, Inc - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by Daniel Campos <giusniyyel@gmail.com>, May 2018
 */

package AlumnoNotas;

import java.util.Scanner;

public class Notas {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float x, prom, y=0;
        int i = 1;
        
        while(i<4){
            System.out.println("Introduzca la calificacion: "+i);
            x=entrada.nextInt();
            y=y+x;
            i=i+1;
        }
        prom=y/3;
        
        if(prom>=7)
            System.out.println("Promocionado");
        else
            System.out.println("Ya valió");
    }   
}