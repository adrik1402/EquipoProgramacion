
package Equipo;

import java.util.Random;
import java.util.Scanner;

public class principal {
    public static void main(String[] args){
        int opcion;
        int cantidad=23;
        int dorsal=8;
        
//      System.out.println("Que desea hacer: 1.Generar equipo, 2.Desordenar equipo, 3.Buscar jugador, 4.Ordenar Equipo Bubble, 5.Ordenar equipo Quick, 6.Comparar algoritmos de orden,7.salir");
      Scanner sc = new Scanner(System.in);
      
      System.out.println("Generar Equipo: ");
      Jugador[] plantilla= generarEquipo(cantidad);
      for(Jugador jugador:plantilla){
          jugador.imprimir();
      }
      
      System.out.println("\t");
      System.out.println("\t");
      
      
      System.out.println("Busqueda Binaria: ");
      System.out.println("El dorsal esta en: "+busquedaBinaria(plantilla,dorsal));
      
      
      System.out.println("\t");
      System.out.println("\t");
      
      
      System.out.println("Desordenar equipo: ");
      desordenarEquipo(plantilla);
      for(Jugador jugador:plantilla){
        jugador.imprimir();
      }
      
      System.out.println("\t");
      System.out.println("\t");
      
        System.out.println("Bubblesort: ");
        bubbleSort(plantilla);
        for(Jugador jugador:plantilla){
        jugador.imprimir();
      }

               
    }
         //Funcion Generar Equipo.
         public static Jugador[] generarEquipo(int cantidad){
            Jugador[] plantilla= new Jugador[cantidad];
            for(int i=0;i<cantidad;i++){
                String nombre= nombreAleatorio();
                String apellidos= apellidosAleatorio();
                String posicion= posicionAleatoria();
                plantilla[i] = new Jugador(nombre,apellidos,posicion,i);
            }return plantilla;
        }
         
         //Funcion Desordenar  Equipo
         public static Jugador[] desordenarEquipo(Jugador[] plantilla){
             int random=(int)Math.floor(Math.random()*100);
 
             for (int i=10;i<random+10;i++){
                 int valor1;
                 int valor2;
                 valor1=(int)Math.floor(Math.random()*(plantilla.length-1));
                 valor2=(int)Math.floor(Math.random()*(plantilla.length-1));
                 Jugador temporal=plantilla[valor1];
                 plantilla[valor1]=plantilla[valor2];
                 plantilla[valor2]=temporal;
             }return plantilla;
             
         } 
         //Funcion BusquedaBinaria
         public static int busquedaBinaria(Jugador[]plantilla,int numero){
             int izq=0;
             int der=plantilla.length-1;
             int centro=(izq+der)/2;
             int contador=1;
             while ((izq<=der) && (plantilla[centro].getDorsal()!=numero)) {
                 System.out.println("Numero de paso: "+contador);
                 contador++;
                 if(numero<plantilla[centro].getDorsal()){
                     der=centro-1;
                 }else{
                     izq=centro+1;
                 }
                 centro=(izq+der)/2;
             }
             if(izq>der){
                 return-1;
             }else{
                 return centro;
             }
         }
         
         //Funcion BubbleSort
         public static Jugador[] bubbleSort(Jugador[] player){
             int n=player.length;
             Jugador temp;
             int contador=1;
             boolean ordenado=false;
             for(int i=0;i<n;i++){
                 if(ordenado){
                     return player;
                 }
                 ordenado=true;
                 for(int j=0;j<(n-i-1);j++){
                     if(player[j].getDorsal()>player[j+1].getDorsal()){
                         temp=player[j];
                         player[j]=player[j+1];
                         player[j+1]=temp;
                         ordenado=false;
                         System.out.println("Numero de pasos: "+contador);
                         contador++;
                     }
                 }
             }return player;
         }
         
         //Funcion QuickSort
         public static void quickSort(Jugador[]player, int izq,int der){
         
             int pivote=player[izq].getDorsal();
             int i=izq;
             int j=der;
            Jugador temp;
             
             while(i<j){
                 while(player[i].getDorsal()<=pivote && i<j){
                     i++;
                 }
                 while(player[j].getDorsal()>pivote){
                     j--;
                 }
                    if(i<j){
                        temp=player[i];
                        player[i]=player[j];
                        player[j]=temp;
                    }
             }
             
             
             
             if(izq<j-1) quickSort(player,izq,j-1);
             if(der>j+1) quickSort(player,j+1,der);
         
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