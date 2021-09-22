/*
 * Java Examples
 * Version 1.0
 * Copyright (C) GiusNiyyel, Inc - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by Daniel Campos <giusniyyel@gmail.com>, May 2018
 */

package Sueldos;

import java.util.Scanner;

/**
 *
 * @author Giusniyyel
 */
public class Sueldo {

    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
        int i=0, n, c=0, t=0;
        float x, prom, y=0;
        
        System.out.println("¿Cuántas empleados tiene?");
        n=entrada.nextInt();
        
        while(i<n){
            
            do{
            System.out.println("¿Cuánto es el sueldo del empleado no."+(i+1)+"?");
            x=entrada.nextFloat();    
            }while(x<100||x>500);
            
            if(x<=300&&x>=100)
                c+=1;
            else
                t+=1;
            
            y+=x;
            i+=1;
        }
        System.out.println("Empleados que cobran entre 100 y 300: "+c);
        System.out.println("Empleados que cobran mas de 300: "+t);
        System.out.println("Importe que gasta la empresa en sueldos al personal: "+y);
    }
    
}
