/*
 * Java Examples
 * Version 1.0
 * Copyright (C) GiusNiyyel, Inc - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by Daniel Campos <giusniyyel@gmail.com>, May 2018
 */

package ABParcial;

import java.util.Scanner;

/**
 * @author GiusNiyyel
 */
public class AB {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] a = new int[5];
        int[] b = new int[5];
        int suma=0,sumb=0;
        
        System.out.println("Parcial Grupo A");
        for(int i=0; i<5; i++){
            System.out.println("Calificación Alumno "+(i+1));
            a[i]=entrada.nextInt();
            suma+=a[i];
        }
        suma=suma/5;
        
        System.out.println("\nParcial Grupo B");
        for(int i=0; i<5; i++){
            System.out.println("Calificación Alumno "+(i+1));
            b[i]=entrada.nextInt();
            sumb+=b[i];
        }
        sumb=sumb/5;
        
        if(suma>sumb)
            System.out.println("\nEl grupo A tiene mayor promedio general");
        else
            System.out.println("\nEl grupo B tiene mayor promedio general");
    }
    
}
