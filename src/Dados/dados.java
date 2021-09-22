/*
 * Java Examples
 * Version 1.0
 * Copyright (C) GiusNiyyel, Inc - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by Daniel Campos <giusniyyel@gmail.com>, May 2018
 */

package Dados;

/**
 * @author GiusNiyyel
 */

import java.util.Random;

public class dados {

    public static void main(String[] args) {
       Random numerosAleatorios=new Random();
       int[] frecuencia = new int[11];
       for(int tiro=1;tiro<=6000000;tiro++)
           ++frecuencia[1+numerosAleatorios.nextInt(10)];
       System.out.printf( "%s%11s\n", "Cara", "Frecuencia");
       for(int cara=1;cara<frecuencia.length;cara++)
           System.out.printf("%4d %10d\n",cara,frecuencia[cara]);
    }
    
}
