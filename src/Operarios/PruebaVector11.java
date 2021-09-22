/*
 * Java Examples
 * Version 1.0
 * Copyright (C) GiusNiyyel, Inc - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by Daniel Campos <giusniyyel@gmail.com>, May 2018
 */

package Operarios;
import java.util.Scanner;

public class PruebaVector11 {
    private Scanner teclado;
    private String[] nombres;
    private float[] sueldos;
    
    public void cargar() {
        teclado=new Scanner(System.in);
        nombres=new String[5];
        sueldos=new float[5];
        for(int f=0;f<nombres.length;f++) {
            System.out.print("Ingrese el nombre del empleado:");
            nombres[f]=teclado.next();
            System.out.print("Ingrese el sueldo:");
            sueldos[f]=teclado.nextFloat();
        }
    }

    public void mayorSueldo() {
        float mayor;
        int pos;
        mayor=sueldos[0];
        pos=0;
        for(int f=1;f<nombres.length;f++) {
            if (sueldos[f]>mayor) {
            mayor=sueldos[f];
            pos=f;
            }
        }
        System.out.println("El empleado con sueldo mayores "+nombres[pos]);
        System.out.println("Tiene un sueldo:"+mayor);
    }

    public static void main(String[] args) {
        PruebaVector11 pv=new PruebaVector11();
        pv.cargar();
        pv.mayorSueldo();
    }
}

