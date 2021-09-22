package factorial;

/**
 * @author GiusNiyyel
 */
public class Recursividad {

    public static void main(String[] args) {
        
        Factorial F = new Factorial();
        
        System.out.println("Factorial utilizando un método recursivo: ");
        System.out.println("Factorial de 3 es: " + F.fact(3));
        System.out.println("Factorial de 6 es: " + F.fact(6));
    }    
}
