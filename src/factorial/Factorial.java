package factorial;

/**
 * @author Admin
 */

public class Factorial {
    
    //Metodo Recursivo
    public int fact(int n){
        int resultado;
        if (n==1) return 1;
            resultado=fact(n-1)*n;
        return resultado;
    }
    
}
