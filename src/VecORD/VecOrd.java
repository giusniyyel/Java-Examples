/*
 * Java Examples
 * Version 1.0
 * Copyright (C) GiusNiyyel, Inc - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by Daniel Campos <giusniyyel@gmail.com>, May 2018
 */

package VecORD;

import Operarios.PruebaVector11;
import java.util.Scanner;

public class VecOrd {
    private Scanner entrada;
    private int[] vec;
    
    public void cargar() {
        entrada=new Scanner(System.in);
        vec=new int[5];
        for(int f=0;f<vec.length;f++) {
            System.out.print("Ingrese un elemento en la posición "+(f+1)+":");
            vec[f]=entrada.nextInt();
        }
    }

    public void menorElem() {
        int mayor;
        int pos;
        mayor=vec[0];
        pos=0;
        for(int f=1;f<vec.length;f++) {
            if (vec[f]<mayor) {
            mayor=vec[f];
            pos=f;
            }
            if (vec[f]==mayor) {
            System.out.println("Se repite el elemente en la posición "+(f+1));
            }
        }
        System.out.println("El elemento menor es: "+vec[pos]);
    }

    public static void main(String[] args) {
        VecOrd pv=new VecOrd();
        pv.cargar();
        pv.menorElem();
    }
    
}
