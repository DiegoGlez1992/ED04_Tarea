/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cuentas;

/**
 * Clase CCuenta que gestiona los métodos del objeto
 *
 * @author diego
 * @version 1.0
 */
public class CCuenta {

    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;

    /**
     * Método getter para nombre
     *
     * @return nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Método setter para nombre
     *
     * @param nombre nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Método getter para cuenta
     *
     * @return cuenta
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * Método setter para cuenta
     *
     * @param cuenta cuenta
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * Método getter para saldo
     *
     * @return saldo
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * Método setter para saldo
     *
     * @param saldo saldo
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * Método getter para Tipo de Interés
     *
     * @return tipo de interés
     */
    public double getTipoInterés() {
        return tipoInterés;
    }

    /**
     * Método setter para tipo de interés
     *
     * @param tipoInterés Tipo de interés
     */
    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }

    /**
     * Constructor por defecto para CCuenta
     */
    public CCuenta() {
    }

    /**
     * Constructor parametrizado para CCuenta
     *
     * @param nom nombre
     * @param cue cuenta
     * @param sal saldo
     * @param tipo tipo
     */
    public CCuenta(String nom, String cue, double sal, double tipo) {
        nombre = nom;
        cuenta = cue;
        saldo = sal;
    }

    /**
     * Método para asignar un nombre
     *
     * @param nom nombre
     */
    public void asignarNombre(String nom) {
        setNombre(nom);
    }

    /**
     * Método para obtener un nombre
     *
     * @return nombre
     */
    public String obtenerNombre() {
        return getNombre();
    }

    /**
     * Método para obtener un saldo
     *
     * @return Saldo
     */
    public double estado() {
        return getSaldo();
    }

    /**
     * Método para ingresar una cantidad
     *
     * @param cantidad Cantidad a ingresar
     * @throws Exception Excepción controlada para cantidades negativas
     */
    public void ingresar(double cantidad) throws Exception {
        if (cantidad < 0) {
            throw new Exception("No se puede ingresar una cantidad negativa");
        }
        setSaldo(getSaldo() + cantidad);
    }

    /**
     * Método para retirar una cantidad
     *
     * @param cantidad Cantidad a retirar
     * @throws Exception Excepciones controladas para retirar cantidades
     * negativas o si no hay suficiente saldo
     */
    public void retirar(double cantidad) throws Exception {
        if (cantidad <= 0) {
            throw new Exception("No se puede retirar una cantidad negativa");
        }
        if (estado() < cantidad) {
            throw new Exception("No se hay suficiente saldo");
        }
        setSaldo(getSaldo() - cantidad);
    }

    /**
     * Método para obtener cuenta
     *
     * @return Cuenta
     */
    public String obtenerCuenta() {
        return getCuenta();
    }

}
