/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofis;

import proyectofis.Dominio.Usuario;

/**
 *
 * @author agustinllado
 */
public class FuncionesUsuario {

    /*
    I. Cálculo de impuestos: el sistema deberá retornar la cantidad
    exacta de impuestos que tiene que pagar el usuario. 
    Para ello en base a la cantidad de hijos y a su edad 
    se calcularán los impuestos de la siguiente manera:
A.           Si el usuario es menor de edad pagará: 0
B.           Si el usuario tiene entre 18 y 30 años 
    pagará: 2000
C.           Si tiene entre 30 y 65 pagará: 7000
D.           Si tiene mas de 65 pagará: 2000
E.           Se restará de ese pago la cantidad 
    de hijos que posee el usuario x 3% (Nunca puede 
    superar un 50% del total)
     */
    public int calculoDeImpuestos(Usuario u) {
        int impuesto = 0;
        int dtoPorHijo = 0;
        int unoPorCiento = 0;
        int cantHijos = u.getCantidadDeHijos();
        int edad = u.getEdad();

        if (edad > 18) {
            //Calculo impuesto
            if ((edad <= 30) || (edad > 65)) {
                impuesto = 2000;
            } else {
                impuesto = 7000;
            }

            //Calculo descuentos por hijo
            unoPorCiento = impuesto / 100;
            dtoPorHijo = unoPorCiento * 3 * cantHijos;

            if (dtoPorHijo >= (impuesto / 2)) {
                dtoPorHijo = impuesto / 2;
            }
            impuesto = impuesto - dtoPorHijo;
        }

        return impuesto;
    }
    
        /*Cobro de sueldo
    Cobro de sueldo: a un usuario se le agrega a su saldo la 
    cantidad señalada por sus servicios laborales.

Al finalizar con la creación de los dos commits indicados, 
    se deberá hacer un merge de esta rama a la rama develop.
     */
    public void cobroDeSueldo(Usuario u, int cantidad) {
        int saldoActual = u.getSaldo();
        u.setCantidadDeHijos(saldoActual + cantidad);
    }

}
