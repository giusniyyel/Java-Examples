/*
 * Java Examples
 * Version 1.0
 * Copyright (C) GiusNiyyel, Inc - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by Daniel Campos <giusniyyel@gmail.com>, May 2018
 */

package SOLOEJEMPLO1;

import java.util.Scanner;
import javax.swing.JOptionPane;
public class MainTheFilm {
 
    public static void main(String[] args) {
        
        
        Scanner lec = new Scanner(System.in);
        System.out.println("Ingrese su nombre, tipo de usuario, forma de pago, día, mes, año, numero de peliculas,¿Cuenta con membresia? 1.- SÍ 2.- NO");
        FacturaP fp= new FacturaP (lec.nextLine(),lec.nextLine(),lec.nextLine(),lec.nextInt(),lec.nextInt(),lec.nextInt(),lec.nextInt(),lec.nextInt(), lec.nextInt());
        
             JOptionPane.showMessageDialog/*Con esto llamo para enviar un mensaje a la pantalla*/(null,
        "Nombre: "+(fp.getNombre())+
        "\nPrimer importe(importe total sin descuentos): "+(fp.Importe1())+
        "\nPrimera Comision: "+(fp.Comision())+
        "\nSegundo importe(con descuento de comision1): "+(fp.Importe2())+
        "\nSegunda Comision: "+(fp.Comision2())+
        "\nTercer importe( con descuento de comision2):"+(fp.Importe3())+
        "\nComision de membresia por más de 3 peliculas: "+(fp.Comision3())+
        "\nCuarto importe(IMPORTE FINAL)"+(fp.Membresia())+
        "\nFECHA DE ENTREGA: "+(fp.getDía())+" / "+(fp.getMes())+" / "+(fp.getAño()),
        "~ Ventana facturas ~", JOptionPane.INFORMATION_MESSAGE);
        
}
}

