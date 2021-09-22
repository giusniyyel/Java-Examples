/*
 * Java Examples
 * Version 1.0
 * Copyright (C) GiusNiyyel, Inc - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by Daniel Campos <giusniyyel@gmail.com>, May 2018
 */

package Banco;

import java.util.Scanner;

/**
 * @author Admin
 */
public class BancoC {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int nc;
        double sa, tsa=0.0;
        do{
            System.out.println("Introduzca su número de cuenta");
            nc=entrada.nextInt();
            if(nc>0){
                System.out.println("Introduzca su saldo");
                sa=entrada.nextInt();
                System.out.println("\nCuenta: "+nc);
                if(sa>0){
                    System.out.println("Estado: Acreedor\n");
                    tsa+=sa;
                }
                else
                    if(sa<0)
                        System.out.println("Estado: Deudor\n");
                    else
                        System.out.println("Estado: Nulo\n");
            }
        }while(nc>0);
        System.out.println("Suma total de los saldos acreedores: "+tsa);
    }   
}
