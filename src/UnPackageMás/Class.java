/*
 * Java Examples
 * Version 1.0
 * Copyright (C) GiusNiyyel, Inc - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by Daniel Campos <giusniyyel@gmail.com>, May 2018
 */

package UnPackageMás;

import java.util.Scanner;

public class Class {
    
        Scanner entrada = new Scanner(System.in);
        int[] v;
        int suma=0;
        
        
        public void Realizar(){
            
        entrada= new Scanner(System.in);
        System.out.print("Cuantos sueldos cargará:");
        int cant;
        cant=entrada.nextInt();
        v=new int[cant];
        System.out.println("VECTOR");
        for(int i=0; i<v.length; i++){
            System.out.println("Ingrese el elemento num "+(i+1)+":");
            v[i]=entrada.nextInt();
            suma+=v[i];
            
        }
        
            
   
    
}
 
    
}
