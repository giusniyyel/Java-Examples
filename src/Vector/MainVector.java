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

public class MainVector {

    public static void main(String[] args) {
        Scanner lec = new Scanner(System.in);
        int [] vec = new int[8];
        
        int s=0;
        int i;
        int su=0, c=0;
        
        for(i=0; i<5;i++){
            System.out.println("Ingrese el dato "+(i+1)+":");
            vec[i]=lec.nextInt();
            s=s+vec[i];
            if (vec[i]>36)
                su=su+vec[i];
            
            if (vec[i]>50)
                c=c+1;
    }
        System.out.println("Valor acumulado del vector: "+s);
        System.out.println("La suma de valores maypres a 36 es de: "+su);
        System.out.println("La cantidad de valores mayores a 50 son: "+c);
    
}
}
