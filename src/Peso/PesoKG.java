/*
 * Java Examples
 * Version 1.0
 * Copyright (C) GiusNiyyel, Inc - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by Daniel Campos <giusniyyel@gmail.com>, May 2018
 */

package Peso;

import java.util.Scanner;

/**
 * @author Giusniyyel
 */
public class PesoKG {

    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        int cant1,cant2,cant3,suma;
        float peso;
        cant1=0; cant2=0; cant3=0;
        do {
            System.out.print("Ingrese el peso de la pieza (0 pera finalizar):");
            peso=teclado.nextFloat();
        if (peso>10.2) {
            cant1++;
        } else {
            if (peso>=9.8) {
            cant2++;
            } else {
                if (peso>0) {
                    cant3++;}
            }}
        } while(peso!=0);
        suma=cant1+cant2+cant3;
        System.out.print("Piezas aptas:");
        System.out.println(cant2);
        System.out.print("Piezas con un peso superior a 10.2:");
        System.out.println(cant1);
        System.out.print("Piezas con un peso inferior a 9.8:");
        System.out.println(cant3);
    }
}
