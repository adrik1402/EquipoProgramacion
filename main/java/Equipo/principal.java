
package Equipo;

import java.util.Scanner;

public class principal {
    public static void main(String[] args){
        System.out.println("Que desea hacer: 1.Generar equipo, 2.Desordenar equipo, 3.Buscar jugador, 4.Ordenar Equipo Bubble, 5.Ordenar equipo Quick, 6.Comparar algoritmos de orden,7.salir");
        Scanner sc = new Scanner(System.in);
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




////Esta opción preguntará al usuario el número de jugadores a incluir en el equipo (máximo 100) y generará un 
//array de Jugadores con nombres, apellidos y posiciones aleatorias, pero con dorsales únicos.
////
////Una vez generado el equipo lo mostrará por pantalla en formato de 3 columnas (tres registros por cada fila).
//
////Recomendación: Investiga cómo generar nombres y apellidos de forma aleatoria. Cada jugador 
//tendrá que tener un nombre y dos apellidos de un banco de (al menos) 10 nombres y 20 apellidos.