/*
 * Java Examples
 * Version 1.0
 * Copyright (C) GiusNiyyel, Inc - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by Daniel Campos <giusniyyel@gmail.com>, May 2018
 */

package Conversion;

class CastingVariables {
    
    public static void main(String[ ] arguments){
        double x = 56.01;
        float y = (float)(2 * x);
        System.out.println(y);

        double temp1 = 3.4 * y;
        int temp2 = (int)(temp1);
        System.out.println(temp2);
    }
}