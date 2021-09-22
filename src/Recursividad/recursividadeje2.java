/*
 * Java Examples
 * Version 1.0
 * Copyright (C) GiusNiyyel, Inc - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by Daniel Campos <giusniyyel@gmail.com>, May 2018
 */

package Recursividad;

public class recursividadeje2 {

    public static String invertPhrase(String phrase,int longitud){
        if(longitud==0){
            return phrase.charAt(longitud)+"";
        }else
        return phrase.charAt(longitud)+(invertPhrase(phrase,longitud-1));   
    }
    
    public static void main(String[] args) {
        String phrase="Hola";
        System.out.println(invertPhrase(phrase, phrase.length()-1));
    }    
}
