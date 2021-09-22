/*
 * Java Examples
 * Version 1.0
 * Copyright (C) GiusNiyyel, Inc - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by Daniel Campos <giusniyyel@gmail.com>, May 2018
 */

package Conversion;

import java.io.*;

class RaizNuevo2 {
     
    public static void main(String args[]) throws IOException{
       BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
       
       System.out.println("Escribe un número:");
       String str = buff.readLine();
       int conversion = Integer.parseInt(str );
       
       System. out.println("La raíz cuadrada de "
             + conversion
             + " es "
             + Math.sqrt(conversion) );
    }
}

