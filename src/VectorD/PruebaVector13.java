/*
 * Java Examples
 * Version 1.0
 * Copyright (C) GiusNiyyel, Inc - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by Daniel Campos <giusniyyel@gmail.com>, May 2018
 */

package VectorD;

import java.util.Scanner;

public class PruebaVector13 {
    private Scanner teclado;
    private int[] sueldos;
    public void cargar() {
        teclado=new Scanner(System.in);
        sueldos=new int[5];
        for(int f=0;f<sueldos.length;f++) {
            System.out.print("Ingrese el sueldo:");
            sueldos[f]=teclado.nextInt();
        }
    }
    
    public void ordenar(){
        for(int k=0;k<4;k++) {
            for(int f=0;f<4-k;f++) {
                if (sueldos[f]>sueldos[f+1]) {
                    int aux;
                    aux=sueldos[f];
                    sueldos[f]=sueldos[f+1];
                    sueldos[f+1]=aux;
                }
            }
        }
    }
    
    public void imprimir() {
        System.out.println("Sueldos ordenados de menor a mayor.");
        for(int f=0;f<sueldos.length;f++) {
            System.out.println(sueldos[f]);
        }
    }
    
    public static void main(String[] args) {
        PruebaVector13 pv=new PruebaVector13();
        pv.cargar();
        pv.ordenar();
        pv.imprimir();
    }
}
