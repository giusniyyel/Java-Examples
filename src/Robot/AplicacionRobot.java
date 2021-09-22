/*
 * Java Examples
 * Version 1.0
 * Copyright (C) GiusNiyyel, Inc - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by Daniel Campos <giusniyyel@gmail.com>, May 2018
 */

package Robot;

class AplicacionRobot {
    
    public static void main(String[] arguments) {
        
        DanteRobot dante = new DanteRobot();
        
        dante.status = "explorando";
        dante.speed = 2;
        dante.temperature = 510;
        dante.showAtributes();
        
        System.out.println("Incrementando velocidad a 3.");
        dante.speed = 3;
        dante.showAtributes();
        
        System.out.println("Cambiando temperatura a 670.");
        dante.temperature = 670;
        dante.showAtributes();
       
        System.out.println("Comprobando la temperatura.");
        dante.checkTemperature();
        dante.showAtributes();
    }
}