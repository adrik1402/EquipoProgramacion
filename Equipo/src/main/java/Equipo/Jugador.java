package Equipo;

import java.util.Random;

//ATRIBUTOS
public class Jugador {

    private String nombre;
    private String apellidos;
    private String[] posiciones = {"Portero", "Defensa", "Centrocampista", "Delantero"};
    private String posicion;
    int dorsal;

//METODOS
    // GENERADOR DE JUGADOR
    public Jugador(String nombre, String apellidos, String posicion, int dorsal) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.posicion = posicion;
        this.dorsal = dorsal;

    }

    public void imprimir() {
        System.out.println(this.nombre + " " + this.apellidos + " " + this.posicion + " " + this.dorsal);
    }

    // MODIFICA EL NOMBRE.
    public void setNombre(String nombre) {

        this.nombre = nombre;
    }
    // GENERA EL NOMBRE.

    public String getNombre() {
        return nombre;
    }

    // MODIFICA EL APELLIDO.
    public void setApellidos(String apellidos) {

        this.apellidos = apellidos;
    }

    // GENERA EL APELLIDO
    public String getApellidos() {
        return apellidos;
    }

    // MODIFICA LA POSICION.
    public void setPosicion(String posicion) {
        if (validacion(posicion)) {
            this.posicion = posicion;
        } else {
            System.out.println("Error");
        }
    }

    // GENERA LA POSICION.
    public String getPosicion() {
        return posicion;
    }

    //COMPRUEBA SI LA POSICION ENTRA EN LAS 4 POSIBLES.
    private boolean validacion(String posicion) {
        for (String entrada : this.posiciones) {
            if (posicion.equals(entrada)) {
                return true;

            }
        }
        return false;
    }

    // MODIFICA EL DORSAL.
    private void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    // GENERA EL DORSAL.
    public int getDorsal() {
        return dorsal;
    }

}
