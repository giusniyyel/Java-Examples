/*
 * Java Examples
 * Version 1.0
 * Copyright (C) GiusNiyyel, Inc - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by Daniel Campos <giusniyyel@gmail.com>, May 2018
 */

package MmElements;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class MmE {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] vec = new int[10];
        int cm=1;
        System.out.println("Vector");
        for(int i=0; i<10; i++){
            System.out.println("Introduzca un valor en la posición "+(i+1));
            vec[i]=entrada.nextInt();
        }
        int j;
        int i;
        
        for(i=0,j=1;i<9;i++,j++){
                if(vec[i]<=vec[j]){
                    System.out.println("i="+vec[i]+" j="+vec[j]);
                    cm=1;
                   }
                   else
                       cm=0; 
        }
        
        if (cm==1)
            System.out.println("Está ordenado de menor a mayor");
        else
            System.out.println("No está ordenado de menor a mayor");
    }
    
}
