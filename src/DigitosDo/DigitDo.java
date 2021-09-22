/*
 * Java Examples
 * Version 1.0
 * Copyright (C) GiusNiyyel, Inc - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by Daniel Campos <giusniyyel@gmail.com>, May 2018
 */

package DigitosDo;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class DigitDo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        int valor;
        do {
        System.out.print("Ingrese un valor entre 0 y 999 (0 finaliza):");
        valor=teclado.nextInt();
        if (valor>=1000){
           System.out.println("Tiene 4 dígitos.");  
        } else{
        if (valor>=100) {
            System.out.println("Tiene 3 dígitos.");
        } else {
            if (valor>=10) {
                System.out.println("Tiene 2 dígitos.");
            } else {
                System.out.println("Tiene 1 dígito.");}
        }
        }} while (valor!=0);
    }
}
