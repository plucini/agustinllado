/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofis.Dominio;

/**
 *
 * @author agustinllado
 */
public class Usuario {
    
    private String nombre;
    private String cedula;
    private int contraseña;
    private int edad;
    private int cantidadDeHijos;
    private int saldo;

     public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public int getContraseña() {
        return contraseña;
    }

    public void setContraseña(int contraseña) {
        this.contraseña = contraseña;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getCantidadDeHijos() {
        return cantidadDeHijos;
    }

    public void setCantidadDeHijos(int cantidadDeHijos) {
        this.cantidadDeHijos = cantidadDeHijos;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }
    
    @Override
    public boolean equals(Object obj) {
        Usuario u = (Usuario) obj;
        return u.getCedula().equals(this.getCedula());
    }
    
}
