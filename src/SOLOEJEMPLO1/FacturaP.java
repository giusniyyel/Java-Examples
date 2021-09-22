/*
 * Java Examples
 * Version 1.0
 * Copyright (C) GiusNiyyel, Inc - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by Daniel Campos <giusniyyel@gmail.com>, May 2018
 */

package SOLOEJEMPLO1;
import javax.swing.JOptionPane;
public class FacturaP extends RPELIS {
    
  
    private double nI=0.0, comision3=0.0;
    private int np=0, membresia=0, categoria=0;

    public FacturaP(String nombre, String tu, String tdp, int día, int mes, int año, int np,int membresia, int categoria) {//dependiendo de la categoria aplica un descuento en la reta total.
        super(nombre, tu, tdp, día, mes, año, np);
        
          this.np=np;
          this.membresia=membresia;
          this.categoria=categoria;
    }

    public int getMembresia() {
        return membresia;
    }

    public void setMembresia(int membresia) {
        this.membresia = membresia;
    }

    public double Membresia(){
    do{
    switch(membresia){
        case 1:/*Si cuenta con la membresia.. Se evalua si el numero de peliculas es mayor a 3 y se aplica un descuento del 10%*/
            if(np>3){
            //comision3=t3*.10;
            nI=t3-Comision3();} /*El total menos la comision se guarda en un nuevo importe(nI)*/
            break;
        case 2:/*Si no cuenta con la membresia.. Se hace una invitación*/
            comision3=t3*0;
            nI=t3;
        JOptionPane.showMessageDialog(null,"INVITACIÓN PARA UNA MEMBRESIA", "~ Ventana membresia ~", JOptionPane.INFORMATION_MESSAGE);
            break;
            
        default:
            break;
    }
    }while(membresia!=1&&membresia!=2);
        return nI;
    
    }
    
     public double Comision3(){
        comision3=t3*.10;
        return comision3;
    
    }
    }
 
   
