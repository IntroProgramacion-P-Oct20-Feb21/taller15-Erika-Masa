/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquetesiete;

/**
 *
 * @author reroes
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
          public static void main(String[] args) {
        // 
        double sueldosSucursal1 = LecturaArchivo.leerRegistros() ;
        double sueldosSucursal2 = LecturaArchivo.leerRegistros2();
        System.out.printf("La suma total de sueldos es %.2f$\n", 
                sueldosSucursal1 + sueldosSucursal2);
    }
    
}
