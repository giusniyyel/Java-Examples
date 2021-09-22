package Edades;

import java.util.Scanner;

/**
 * @author Giusniyyel
 */
public class Edad {

    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);
        int i=0, e1 = 0, e2 = 0, edad = 0, s= 0, s1=0, aux=0;
        float prom1=0, prom2=0;
        String[] turno = new String[3];
        
        System.out.println("Introduzca el numero de estudiantes");
        int n= entry.nextInt();
        while (i<n){
                 System.out.println("Introduzca la edad del estudiante "+(i+1));
                 edad= entry.nextInt();
                  if(edad>=18){
                  
                  if(edad>aux)
                      aux=edad;
                      
                  s=s+edad;
                  e1=e1+1;}
                  else
                  if(edad<18){
                   s1=s1+edad;
                  e2=e2+1;}
             i++;
        }
            
       
        System.out.println("Estudiantes mayores de edad: "+e1);
        System.out.println("La edad mayor entre los mayores de edad es: "+aux);
        System.out.println("Estudiantes menores de edad: "+e2);
        System.out.println("El promedio de edad de estudiantes mayores de edad es: "+(prom1=(float)s/e1));
        System.out.println("El promedio de edad de estudiantes menores de edad es: "+(prom2=(float)s1/e2));
        
    }
    }

