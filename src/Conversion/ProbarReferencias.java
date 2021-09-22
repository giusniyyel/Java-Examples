/*
 * Java Examples
 * Version 1.0
 * Copyright (C) GiusNiyyel, Inc - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by Daniel Campos <giusniyyel@gmail.com>, May 2018
 */

package Conversion;

import java.awt.Point;

 class ProbarReferencias {
 public static void main(String[] arguments) {
     Point pt1, pt2;
     pt1 = new Point(100, 100);
     pt2 = pt1;
     pt1.x = 200;
     pt1.y = 200;
     
    System.out.println("Point1: " + pt1.x + ", " + pt1.y);
    System.out.println("Point2: " + pt2.x + ", " + pt2.y);
 }
}