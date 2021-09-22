/*
 * Java Examples
 * Version 1.0
 * Copyright (C) GiusNiyyel, Inc - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by Daniel Campos <giusniyyel@gmail.com>, May 2018
 */

package Recursividad;

public class recursividadeje {

    void prin(int x) {
        if(x>0){
            if(x%2==0){ 
                System.out.printf("%2d\n",x);
            }
        prin(x-1);
        }
    }
    

    public static void main(String[] args) {
       recursividadeje re=new recursividadeje();
       System.out.println("Números Pares: ");
       re.prin(100);

    }
}
