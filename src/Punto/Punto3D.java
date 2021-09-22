/*
 * Java Examples
 * Version 1.0
 * Copyright (C) GiusNiyyel, Inc - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by Daniel Campos <giusniyyel@gmail.com>, May 2018
 */

package Punto;

import java.awt.*;

public class Punto3D extends Point {
     
    public int z;
    
    public Punto3D(int x, int y, int z) {
         super(x, y);
         this.z = z;
    }

    
    public void move(int x, int y, int z) {
         this.z = z;
         super.move(x, y);
    }

    
    public void translate(int x, int y, int z) {
         this.z += z;
         super.translate(x, y) ;
    }

}