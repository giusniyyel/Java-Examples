/*
 * Java Examples
 * Version 1.0
 * Copyright (C) GiusNiyyel, Inc - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by Daniel Campos <giusniyyel@gmail.com>, May 2018
 */

package TareaAl;

import java.util.Scanner;

public class Tarea {
    private Scanner entrada;
    private int[] vec;
    private int ne;
    public void cargar() {
        entrada=new Scanner(System.in);
        System.out.println("¿Cuantos datos desea leer?");
        ne=entrada.nextInt();
        vec=new int[ne];
        
        for(int j=0;j<vec.length;j++) {
            System.out.print("\nIngrese el dato "+(j+1)+":");
            vec[j]=entrada.nextInt();
        }
    }
    
    public void ordenar(){
        for(int k=0;k<ne;k++) {
            for(int j=0;j<ne-1;j++) {
                if (vec[j]>vec[j+1]) {
                    int aux;
                    aux=vec[j];
                    vec[j]=vec[j+1];
                    vec[j+1]=aux;
                }
            }
        }
    }
    
    public void imprimir() {
        System.out.println("\nEnteros ordenados de menor a mayor.");
        for(int m=0;m<vec.length;m++) {
            System.out.println(vec[m]);
        }
    }
    
    public static void main(String[] args) {
        Tarea pv=new Tarea();
        pv.cargar();
        pv.ordenar();
        pv.imprimir();
    }
}