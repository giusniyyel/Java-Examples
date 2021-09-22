/*
 * Java Examples
 * Version 1.0
 * Copyright (C) GiusNiyyel, Inc - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by Daniel Campos <giusniyyel@gmail.com>, May 2018
 */

package SOLOEJEMPLO1;

public class RPELIS {

    private String nombre, tu, tdp;
    private int día=0, mes=0, año=0, np=0;
    double comision=0.0, comision2=0.0, t1=0.0, t2=0.0, t3=0.0;
    
public RPELIS(String nombre, String tu, String tdp, int día,int mes,int año,int np){
        
        this.nombre=nombre; 
        this.tu=tu;
        this.tdp=tdp;
        this.día=día;
        this.mes=mes;
        this.año=año;
        this.np=np;
       
        //this.tdp=tdp;
       // TotalxPeliculas(np);
        //TDC(tu);
}

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDía() {
        día=día+3;
        return día;
    }

    public void setDía(int día) {
        this.día = día;
    }
 
    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAño() {
        return año;
    }
    
    public void setAño(int año) {
        this.año = año;
    }


    //Este metodo aplica para todos: tanto trabajadores como empleados.
    public double Importe1(){/*Aqui se evalua el primeto importe(el numero de peliculas 
        por el costo de c/u y se guarda en la variable t1(total1)*/   
    t1=(float)np*30.0;  
        return t1;
    }
    
    //Este metodo aplica para todos: tanto trabajadores como empleados.
    public double Importe2(){ /*Aquí se evalua el descuento dependiendo del tipo de usuario(tu) y se guarda en la variable comision.*/
      
        if("trabajador".equalsIgnoreCase(tu)){
         //comision=t1*.05;
         t2= t1-Comision();}//PENDIENTE
        else
          if("cliente".equalsIgnoreCase(tu)){
         comision=t1*0;
         t2=t1;}
        return t2;
    }
    //ESTE SI FUNCIONA
    public double Importe3 (){/*Aqui se evalua si el pago es con tarjeta o efectivo y el nuevo total se guarda en comision2*/
        if("efectivo".equalsIgnoreCase(tdp)){/*si el pago es en efectivo apliaca otro .05% de descuento sobre la comision actual.*/
           // comision2=t2*.05;
            t3=t2-Comision2();}
          
    else
        if("tarjeta".equalsIgnoreCase(tdp))/*Si el pago es con tarjeta no aplica descuento sobre la comision actual*/
             t3=t2;
        
       return t3;
    }
    
     public double Comision(){
        comision=t1*.05;
        return comision;
    }
    
     public double Comision2(){
        comision2=t2*.05;
        return comision2;
    }
    
    }

