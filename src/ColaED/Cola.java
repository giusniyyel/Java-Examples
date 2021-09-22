/*
 * Java Examples
 * Version 1.0
 * Copyright (C) GiusNiyyel, Inc - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by Daniel Campos <giusniyyel@gmail.com>, May 2018
 */

package ColaED;

//Nombre de la clase
public class Cola {
    private int tamanio;
    private int inicio;
    private int fin;
    private int[] cola;
    
    //Creamos un constructor
    public Cola(){
        tamanio=5;
        inicio=-1;
        fin=-1;
        cola = new int[tamanio];
    }//Fin del constructor
    
    //Insertar valores push
    public void Push(int dato){
        //Insertar valores en la cola
        cola[++fin]=dato;
    }
    
    //Expulsar valores
    public Integer Pop(){
        return cola[++inicio];
    }//Fin del pop
}//Fin de la cola
