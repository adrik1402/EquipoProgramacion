
package Equipo;

import java.util.Random;
import java.util.Scanner;

public class principal {
    public static void main(String[] args){
        int opcion;
        int cantidadJ;
//      System.out.println("Que desea hacer: 1.Generar equipo, 2.Desordenar equipo, 3.Buscar jugador, 4.Ordenar Equipo Bubble, 5.Ordenar equipo Quick, 6.Comparar algoritmos de orden,7.salir");
      Scanner sc = new Scanner(System.in);
        
 
       
        }
    
         public static Jugador[] generarEquipo(int cantidad){
            Jugador[] plantilla= new Jugador[cantidad];
            for(int i=0;i<=cantidad;i++){
                String nombre= nombreAleatorio();
                String apellidos= apellidosAleatorio();
                String posicion= posicionAleatoria();
                plantilla[i] = new Jugador(nombre,apellidos,posicion,i);
            }return plantilla;
        }
         
         public static String nombreAleatorio(){
             String[] nombresAleatorios = new String[1];
		String[] nombres = { "Besame", "David", "Baldomero", "Balduino", "Paco", "Baltasar", "Barry", "Bartolo",
				"Bartolomé", "Baruc", "Baruj", "Candelaria", "Cándida", "Canela", "Caridad", "Rosame", "Jony",
				"Caritina", "Carlota", "Baltazar"};
                return nombres[(int) (Math.floor(Math.random() * (nombres.length)))];
         }
         public static String apellidosAleatorio(){
             String[] apellidosAleatorios = new String[2];
                
		String[] apellido = { "Gomez", "Guerrero", "Elnavo", "Cardiel", "Cardona", "Cardoso", "Cariaga", "Melavo",
				"Carion", "Castiyo", "Castorena", "Castro", "Grande", "Grangenal", "Grano", "Grasia", "Elano",
				"Grigalva","Kalvani","Carrillo","Castillo" };
                
                 return apellido[(int) (Math.floor(Math.random() * (apellido.length)))] + " "+  apellido [(int) (Math.floor(Math.random() * (apellido.length)))];
         }
         public static String posicionAleatoria(){
               String [] posicion = {"Portero","Defensa","Defensa","Defensa","Defensa","Centrocampista","Centrocampista","Centrocampista","Centrocampista","Delantero","Delantero","Delantero"};
               return posicion[(int) (Math.floor(Math.random() * (posicion.length)))];
         }
    }
    



////Esta opción preguntará al usuario el número de jugadores a incluir en el equipo (máximo 100) y generará un 
//array de Jugadores con nombres, apellidos y posiciones aleatorias, pero con dorsales únicos.
////
////Una vez generado el equipo lo mostrará por pantalla en formato de 3 columnas (tres registros por cada fila).
//
////Recomendación: Investiga cómo generar nombres y apellidos de forma aleatoria. Cada jugador 
//tendrá que tener un nombre y dos apellidos de un banco de (al menos) 10 nombres y 20 apellidos.