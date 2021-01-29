
package Equipo;

import java.util.Scanner;

public class principal {
    public static void main(String[] args){
        System.out.println("Que desea hacer: 1.Generar equipo, 2.Desordenar equipo, 3.Buscar jugador, 4.Ordenar Equipo Bubble, 5.Ordenar equipo Quick, 6.Comparar algoritmos de orden,7.salir");
    }
    
public static int opcion( int numero){
    switch(numero){
        case 1:generarEquipo();
        case 2:desordenarEquipo();
        case 3:buscarJugador();
        case 4:ordenarEquipoBubble();
        case 5:ordenarEquipoQuick();
        case 6:compararAlgoritmos();
        default return salir;
    }
}
    
}




//Generar Equipo
//Desordenar Equipo
//Buscar Jugador (Busqueda binaria)
//Ordenar Equipo (Bubble)
//Ordenar Equipo (Quick)
//Comparar Algoritmos de Orden
//Salir