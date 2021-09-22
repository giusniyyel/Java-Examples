/*
 * Java Examples
 * Version 1.0
 * Copyright (C) GiusNiyyel, Inc - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by Daniel Campos <giusniyyel@gmail.com>, May 2018
 */

package Pila;

public class Pila {
    
private int[] pila;
private int tamanio;
private int top;

//Costructor inicializamos
public Pila(){
    tamanio = 5;
    top=-1;
    pila=new int[tamanio];
}//Fin del costructor

//Metodo para insertar valores
public void push(int dato){
    if(top==(tamanio-1))
        redimensionar();
    pila[++top]=dato;
}//Fin del metodo push

//metodo para sacar datos
public Integer pop(){
    if(top<0)
        return null;
    return pila[top--];
}//Fin del metodo pop

//Metodo para aumentar el tamaño del array
private void redimensionar(){
    tamanio *=2;
    int[]temp=pila;
    pila=new int[tamanio];
    //Rellenar el arreglo pila
    for(int i=0;i<=top;i++)
        pila[i]=temp[i];}//Fin del metodo redimensionar 
}//Fin de la clase pila