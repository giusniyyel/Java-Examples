/*
 * Java Examples
 * Version 1.0
 * Copyright (C) GiusNiyyel, Inc - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by Daniel Campos <giusniyyel@gmail.com>, May 2018
 */

package ColaED;

public class DatosCola {

    public static void main(String[] args) {
        Cola cola = new Cola(); //Creo la instancia
        cola.Push(1);
        cola.Push(2);
        cola.Push(3);
        cola.Push(4);
        
        System.out.println(cola.Pop());
        System.out.println(cola.Pop());
        System.out.println(cola.Pop());
    }
}