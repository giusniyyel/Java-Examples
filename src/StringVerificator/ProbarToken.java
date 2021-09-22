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

class ProbarToken {

    public static void main(String[ ] arguments) {
        StringTokenizer st1 , st2;
        String cita1 = " TEXTO 6 -3/4" ;
        st1 = new StringTokenizer(cita1 );
        
        System. out. println( "Token 1 : " +st1.nextToken() ) ;
        System. out. println( "Token 2: " + st1.nextToken() ) ;
        System. out. println( "Token 3: " + st1.nextToken() ) ;
        
        String cita2 = " DSGR@9 32/ 25@2/17";
        st2 = new StringTokenizer(cita2, "@");
        
        System. out. println( "\nToken 1: " + st2.nextToken() ) ;
        System. out. println( "Token 2: " + st2.nextToken() ) ;
        System. out. println( "Token 3: " + st2.nextToken() ) ;
    }
}