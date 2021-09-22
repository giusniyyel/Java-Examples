/*
 * Java Examples
 * Version 1.0
 * Copyright (C) GiusNiyyel, Inc - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by Daniel Campos <giusniyyel@gmail.com>, May 2018
 */

package StringVerificator;

import java.util.StringTokenizer;

class ProbarToken2 {
    
    public static void main(String[ ] arguments) {
        StringTokenizer st1 , st2;
        String cita = " DSGR@9 32/ 25@2/17";
        
        st1 = new StringTokenizer(cita );
        System. out. println( "Token 1 : " +st1.nextToken() ) ;
        System. out. println( "Token 2: " + st1.nextToken() ) ;
        System. out. println( "Token 3: " + st1.nextToken() ) ;
        
        
        st2 = new StringTokenizer(cita, "@");
        System. out. println( "\nToken 1: " + st2.nextToken() ) ;
        System. out. println( "Token 2: " + st2.nextToken() ) ;
        System. out. println( "Token 3: " + st2.nextToken() ) ;
    }
}