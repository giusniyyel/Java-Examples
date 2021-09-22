/*
 * Java Examples
 * Version 1.0
 * Copyright (C) GiusNiyyel, Inc - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by Daniel Campos <giusniyyel@gmail.com>, May 2018
 */

package Conversion;

class RaizNuevo {
     
    public static void main(String[ ] args) {
         int numero = 100;
         if (args. length > 0) {
             numero = Integer.parseInt(args[0] );
         }
         
         System. out.println("La raíz cuadrada de "
             + numero
             + " es "
             + Math.sqrt(numero) );
    }
}