/*
 * Java Examples
 * Version 1.0
 * Copyright (C) GiusNiyyel, Inc - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by Daniel Campos <giusniyyel@gmail.com>, May 2018
 */

package PNN;

import java.util.Scanner;

/**
 *
 * @author Giusniyyel
 */
public class PoNuNe {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int x,y;
        System.out.println("Introduzca un número: ");
        x=entrada.nextInt();
        
        if(x>0)
            System.out.println("Número Positivo");
        else
            if(x<0)
                System.out.println("Número Negativo");
            else
                System.out.println("Nulo");
    }
    
}
