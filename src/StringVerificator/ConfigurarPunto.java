/*
 * Java Examples
 * Version 1.0
 * Copyright (C) GiusNiyyel, Inc - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by Daniel Campos <giusniyyel@gmail.com>, May 2018
 */

package StringVerificator;

import java.awt.Point;

class ConfigurarPunto  {

    public static void main(String[] arguments) {
        Point localizacion = new Point(4, 13);
        System.out.println("Empezar localización:");
        System.out.println("X igual a " + localizacion.x);
        System.out.println("Y igual a " + localizacion.y);

        System.out.println("\nMoviéndolo a (7, 6)");
        localizacion.x = 7;
        localizacion.y = 6;

        System.out.println("\nLocalización final:");
        System.out.println("X igual a " + localizacion.x);
        System.out.println("Y igual a " + localizacion.y);
    }
 }