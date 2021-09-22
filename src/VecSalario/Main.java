/*
 * Java Examples
 * Version 1.0
 * Copyright (C) GiusNiyyel, Inc - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by Daniel Campos <giusniyyel@gmail.com>, May 2018
 */

package VecSalario;

import java.util.Scanner;

/**
 * @author K8
 */

public class Main {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int n,aux;
        System.out.println("¿Cuántos alumnos ingresaran datos?");
        n=entrada.nextInt();
        int[] salary = new int[n];
        int[] rank = new int[11];
        for(int i=0;i<n;i++){
            System.out.println("Introduzca la calificación");
            salary[i]=entrada.nextInt();
            if(salary[i]<10&&salary[i]>=0)
                rank[0]+=1;
            if(salary[i]<20&&salary[i]>=10)
                rank[1]+=1;
            if(salary[i]<30&&salary[i]>=20)
                rank[2]+=1;
            if(salary[i]<40&&salary[i]>=30)
                rank[3]+=1;
            if(salary[i]<50&&salary[i]>=40)
                rank[4]+=1;
            if(salary[i]<60&&salary[i]>=50)
                rank[5]+=1;
            if(salary[i]<70&&salary[i]>=60)
                rank[6]+=1;
            if(salary[i]<80&&salary[i]>=70)
                rank[7]+=1;
            if(salary[i]<90&&salary[i]>=80)
                rank[8]+=1;
            if(salary[i]<100&&salary[i]>=90)
                rank[9]+=1;
            if(salary[i]==100)
                rank[10]+=1;
        }           
        for (int contador = 0; contador<=(rank.length-1);contador++){
            if(contador==10)
                System.out.printf("%d: ",100);
            else
                System.out.printf("%02d-%02d: ",contador*10,contador*10+9);
            for (int estrellas=0;estrellas<rank[contador];estrellas++)
                System.out.print("*");
            System.out.println();
        }
    }  
}
