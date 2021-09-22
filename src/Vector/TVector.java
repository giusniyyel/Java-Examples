/*
 * Java Examples
 * Version 1.0
 * Copyright (C) GiusNiyyel, Inc - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by Daniel Campos <giusniyyel@gmail.com>, May 2018
 */

package Vector;

import java.util.Scanner;

public class TVector {

    public static void main(String[] args) {
         Scanner lec = new Scanner(System.in);
         int [] vec1 = new int[4];
         int [] vec2= new int[4];
         int [] vec3= new int[4];
         
             int i;
             
         for(i=0;i<4; i++){
             System.out.println("\nVector 1");
             System.out.println("Ingrese el dato "+(i+1)+":");
             vec1[i]=lec.nextInt();
             System.out.println("\nVector 2");
             System.out.println("Ingrese el dato "+(i+1)+":");
             vec2[i]=lec.nextInt();
         }
         
            System.out.println("Vector 3");
           for(i=0;i<4; i++){
             vec3[i]=vec1[i]+vec2[i];
            System.out.println("La suma de la celda "+(i+1)+" es: "+ vec3[i]);
         }
        

    }
    
}
