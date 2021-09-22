/*
 * Java Examples
 * Version 1.0
 * Copyright (C) GiusNiyyel, Inc - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by Daniel Campos <giusniyyel@gmail.com>, May 2018
 */

package Robot;

class DanteRobot {
    String status;
    int speed;
    float temperature;

    void checkTemperature() {
    if (temperature > 660) {
    status = "Volviendo a Casa";
    speed = 5;
     }
    }

    void showAtributes() {
    System.out.println("Estatus: " + status);
    System.out.println("Velocidad: " + speed);
    System.out.println("Temperatura: " + temperature);
    }
 }