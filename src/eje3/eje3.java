/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NumeroNegativoExcepcion;

/**
 *
 * @author 52662
 */
public class eje3 {
  int int2;
    public static void mostrar(){
        System.out.println("ERROR: Número negativo");
    }
    public static void raiz (int int2) {
        if (int2 > 0) {
            System.out.println("La raíz del número ingresado es igual a: " + Math.sqrt(int2));
        }
    }
}   

