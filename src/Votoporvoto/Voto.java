/*
 * Java Examples
 * Version 1.0
 * Copyright (C) GiusNiyyel, Inc - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by Daniel Campos <giusniyyel@gmail.com>, May 2018
 */

/*
Los ciudadanos van a votar por alguno de los colores:
rojo,azul y verde. 
Pedir el numero de ciudadano, 
registrar el voto de cada uno de ellos y 
al final decir cuantos votos obtuvo cada color y el porcentaje que saco cada color.
 */
package Votoporvoto;

import java.util.Scanner;

public class Voto {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int vr=0,va=0,vv=0,n,cm,voto;
        float pr,pa,pv;
        System.out.println("¿Cuántos ciudadanos votarán?");
        n=entrada.nextInt();
        for(int i=0;i<n;i++){
            cm=1;
            while(cm==1){
            System.out.println("\nBienvenido! Seleccione por quien votará?\n1.-Rojo\n2.-Azul\n3.-Verde");
            voto=entrada.nextInt();
		switch(voto){
			case 1:
                                vr+=1;
				System.out.println("Usted ha votado por rojo, gracias!");
                                cm=0;
				break;
			case 2:
                                va+=1;
				System.out.println("Usted ha votado por azul, gracias!");
                                cm=0;
				break;
			case 3:
                                vv+=1;
				System.out.println("Usted ha votado por verde, gracias!");
                                cm=0;
				break;
			default:
                                System.out.println("Chale, esa opción no es valida carnal");		
                }
            }   
        }
        pr=vr/(float)n*100;
        pa=va/(float)n*100;
        pv=vv/(float)n*100;
        System.out.println("\nRojo obtuvo: "+vr+" votos");
        System.out.println("Rojo obtuvo un "+pr+"% de votos" );
        System.out.println("\nAzul obtuvo: "+va+" votos");
        System.out.println("Azul obtuvo un "+pa+"% de votos" );
        System.out.println("\nVerde obtuvo: "+vv+" votos");
        System.out.println("Verde obtuvo un "+pv+"% de votos" );
    }  
}
