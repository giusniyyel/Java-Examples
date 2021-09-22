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
 * @author Admin
 */

public class recursividad {
        void imprimir(int x) {
            if(x>0){
                System.out.println(x);
                imprimir(x-1);   
            }
        }
    
    public static void main(String[] ar) {
        recursividad re=new recursividad();
        re.imprimir(5);
    }    
}
