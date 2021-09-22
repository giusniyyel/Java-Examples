/*
 * Java Examples
 * Version 1.0
 * Copyright (C) GiusNiyyel, Inc - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by Daniel Campos <giusniyyel@gmail.com>, May 2018
 */

package VectorD1;

import java.util.Scanner;

public class PruebaVectorFull {
    private Scanner entrada;
    private int[] vec;
    private int n;
    public void cargar() {
        entrada=new Scanner(System.in);
        System.out.println("Introduzca cuantos datos leerá:");
        n=entrada.nextInt();
        vec=new int[n];
        
        for(int f=0;f<vec.length;f++) {
            System.out.print("\nIngrese un dato:");
            vec[f]=entrada.nextInt();
        }
    }
    
    public void ordenar(){
        for(int k=0;k<n;k++) {
            for(int f=0;f<n-1;f++) {
                if (vec[f]>vec[f+1]) {
                    int aux;
                    aux=vec[f];
                    vec[f]=vec[f+1];
                    vec[f+1]=aux;
                }
            }
        }
    }
    
    public void imprimir() {
        System.out.println("\nEnteros ordenados de menor a mayor.");
        for(int f=0;f<vec.length;f++) {
            System.out.println(vec[f]);
        }
    }
    
    public static void main(String[] args) {
        PruebaVectorFull pv=new PruebaVectorFull();
        pv.cargar();
        pv.ordenar();
        pv.imprimir();
    }
}