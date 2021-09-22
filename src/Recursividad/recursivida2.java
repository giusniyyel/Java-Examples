/*
 * Java Examples
 * Version 1.0
 * Copyright (C) GiusNiyyel, Inc - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by Daniel Campos <giusniyyel@gmail.com>, May 2018
 */

package Recursividad;

/**
 *
 * @author Admin
 */
public class recursivida2 {

    void imprimir(int x) {
        if (x>0) {
            imprimir(x-1);
            System.out.println(x); 
        }
    }
    
    public static void main(String[] ar) {
        recursivida2 re=new recursivida2();
        re.imprimir(5);
    }
}