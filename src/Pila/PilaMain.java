/*
 * Java Examples
 * Version 1.0
 * Copyright (C) GiusNiyyel, Inc - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by Daniel Campos <giusniyyel@gmail.com>, May 2018
 */

package Pila;

public class PilaMain {

    public static void main(String[] args) {
        Pila pila=new Pila();
        pila.push(10);
        pila.push(20);
        pila.push(30);
        
        //sacar valores de la pila
        
        System.out.println(pila.pop());
        System.out.println(pila.pop());
    }
    
}
