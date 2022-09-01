
package manejo_exceptions3;

public class NumeroNegativoExcepcion {
    int int2;
    public static void mostrar(){
        System.out.println("ERROR: Ingrese número positivo.");
    }
    public static void raiz (int int2) {
        if (int2 > 0) {
            System.out.println("---> La raíz del número ingresado es igual a: " + Math.sqrt(int2));
        }
    }
}
