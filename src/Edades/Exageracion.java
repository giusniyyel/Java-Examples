package Edades;

/*Se cuenta con la siguiente información: Las edades de 50 estudiantes 
del turno mañana. Las edades de 60 estudiantes del turno tarde. 
Las edades de 110 estudiantes del turno noche. Las edades de cada 
estudiante deben ingresarse por teclado. a) Obtener el promedio de 
las edades de cada turno (tres promedios) b) Imprimir dichos promedios 
(promedio de cada turno) c) Mostrar por pantalla un mensaje que indique 
cual de los tres turnos tiene un promedio de edades mayor.
Estructura*/
import java.util.Scanner;

public class Exageracion {

   public static void main(String[] args) {
      //Exageracion llamar=new Exageracion();
        float prom1, prom2, prom3;
      
    System.out.println("Edades de mañana:");
    prom1 = promedio();
    
    System.out.println("el promedio es:"+prom1);
        
    System.out.println("Edades de la tarde:");
    prom2=promedio();
    System.out.println("el promedio es:"+prom2);
    
    System.out.println("Edades de la noche:");
    
     prom3=promedio();
    System.out.println("el promedio es:"+prom3);
    
    if (prom1>prom2 && prom1>prom3){
        System.out.println("el promedio de los alumnos de la mañana es mayor");
    }else
        if (prom2>prom1 && prom2>prom3){
        System.out.println("el promedio de los alumnos de la tarde es mayor");
    }else
            if (prom3>prom1 && prom3>prom2){
        System.out.println("el promedio de los alumnos de la noche es mayor");
    }
    
    
}
    
public static float promedio(){
     Scanner tec = new Scanner(System.in);
     int suma=0;
     int i;
    float prom=0;
     for(i=1;i<6;i++){
         
        System.out.println("Dame la edad"+(i)+":");
        int edad = tec.nextInt();
        suma=suma+edad;}
    
       
    prom= suma/5;
    return prom;
}


 
}


