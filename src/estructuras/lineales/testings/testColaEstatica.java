/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructuras.lineales.testings;
import estructuras.lineales.estaticas.Cola;

/**
 *
 * @author Dantesito
 */
public class testColaEstatica {
     static String sOk = "OK!", sErr = "ERROR";
    public static void main(String[] args) {
        Cola n1 = new Cola();
        Cola n2 = new Cola();
        Cola n3 = new Cola();
        Cola n4 = new Cola();
        System.out.println("Apilar elementos en la cola ");
        for (int i = 0; i < 5; i++) {
            System.out.println("Apilando "+i+" apilado "+n1.apilar(i));
        }
        System.out.println("Probando to String");
        System.out.println(n1.toString());
        System.out.println("probando el clone");
        n2=n1.clone();
        System.out.println("Cola n2 es "+n2.toString());
        System.out.println("Desapilo n1 "+n1.desapilar());
        System.out.println("El nuevo frente es "+n1.obtenerFrente().toString());
        System.out.println("Nueva cola n1 "+n1.toString());
        System.out.println("Desapilo cola n2 "+n2.desapilar());
        System.out.println("Probando n2 "+n2.toString());
        System.out.println("Prueba apilando hasta llenar la cola ");
        for (int i = 0; i < 15; i++) {
            System.out.println("LLenando n2 "+n2.apilar(i));
        }
      
    }
    
}
