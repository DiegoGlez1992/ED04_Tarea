/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuentas;

/**
 * Clase main del proyecto
 *
 * @author diego
 * @version 1.0
 */
public class Main {

    /**
     * Método main que inicializa el programa y crea el objeto cuenta1. A
     * continuación, llama al método que contiene las sentencias que operan con
     * el objeto cuenta1.
     *
     * También podríamos haber incluido la creacción del objeto dentro del
     * método operativa_cuenta y desde el método main unicamente inicializar el
     * programa y llamar al método.
     *
     * @param args
     */
    public static void main(String[] args) {
        CCuenta cuenta1;
        cuenta1 = new CCuenta("Antonio López", "1000-2365-85-1230456789", 2500, 0);
        operativa_cuenta(cuenta1);  //Llamamos al método que opera con el objeto cuenta1
    }

    /**
     * Método privado que engloba todas las sentencias de la clase Main que
     * operan con el objeto cuenta1.
     *
     * @param cuenta1 Objeto cuenta1
     */
    private static void operativa_cuenta(CCuenta cuenta1) {
        double saldoActual;
        float cantidad;

        saldoActual = cuenta1.estado();
        System.out.println("El saldo actual es" + saldoActual);
        try {
            cuenta1.retirar(2300);
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
        try {
            System.out.println("Ingreso en cuenta");
            cuenta1.ingresar(695);
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
    }
}
