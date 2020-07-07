package Modularidad;
// Autor: Flor Cerdán
public class Prog010 {
    // Métodos que reciben parámetros y devuelven valores
    public static int factorial (int numero){
        int fac = 1;
        for (int i = 1; i <= numero; i++) {
            fac*=i;
        }
        return fac;
    }
    public static void main(String[] args) {
        System.out.println(factorial(5));
    }
}
