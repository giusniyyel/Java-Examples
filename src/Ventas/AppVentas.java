/*
 * Java Examples
 * Version 1.0
 * Copyright (C) GiusNiyyel, Inc - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by Daniel Campos <giusniyyel@gmail.com>, May 2018
 */

package Ventas;

import java.util.Scanner;

public class AppVentas {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String[] mes = new String [12];
        
        mes[0]= "Enero";
        mes[1]= "Febrero";
        mes[2]= "Marzo";
        mes[3]= "Abril";
        mes[4]= "Mayo";
        mes[5]= "Junio";
        mes[6]= "Julio";
        mes[7]= "Augusto";
        mes[8]= "Septiembre";
        mes[9]= "Octubre";
        mes[10]= "Noviembre";
        mes[11]= "Diciembre";
        
        float[] mesv = new float [12];
        int v,vt=0;
        float total=0;
        for(int i=0;i<12;i++){
               System.out.println("Introduzca la venta del "+(mes[i])+":");
               mesv[i]=entrada.nextFloat();
               total+=mesv[i];
        }
        System.out.println("PORCENTAJE DE LAS VENTAS");
        for(int x=0;x<12;x++){
          System.out.println("\nEl porcentaje de la venta del mes "+(mes[x])+" es: "+(mesv[x]*100/total)+"%");      
        }
        System.out.println("\nLa venta anual total es de: "+total);
        System.out.println("\nEl promedio de las ventas es de: "+ (total/12));
    }
    
}