package Equipo;

import java.util.Random;
import java.util.Scanner;

public class principal {

    public static void main(String[] args) {
        System.out.println("Cuantos jugadores quieres : ");
        Scanner sc = new Scanner(System.in);
        int cantidad = sc.nextInt();

        int opcion = 0;
        Jugador[] plantilla = null;
        while (opcion != 7) {
            System.out.println("Que desea hacer: 1. Generar equipo, 2.Desordenar equipo, 3.Buscar jugador, 4.Ordenar Equipo Bubble, 5.Ordenar equipo Quick, 6.Comparar algoritmos de orden,7.salir");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    if (cantidad < 101 && cantidad > 0) {
                        plantilla = generarEquipo(cantidad);

                        for (Jugador jugador : plantilla) {
                            jugador.imprimir();
                        }

                    } else {
                        System.out.println("La cantidad debe de ser mayor que 0 y menor que 100.");
                    }
                    break;

                case 2:

                    desordenarEquipo(plantilla);
                    for (Jugador jugador : plantilla) {
                        jugador.imprimir();
                    }
                    break;
                case 3:
                    System.out.println("Indique el dorsal del jugador a buscar: ");
                    int dorsal = sc.nextInt();
                    busquedaBinaria(plantilla, dorsal);
                    if (dorsal != plantilla.length) {
                        for (Jugador jugador : plantilla) {
                            if (jugador.dorsal == dorsal) {
                                jugador.imprimir();
                            }
                        }
                    } else {
                        System.out.println("El dorsal no existe");
                    }
                    break;
                case 4:
                    bubbleSort(plantilla);
                    for (Jugador jugador : plantilla) {
                        jugador.imprimir();
                    }
                    break;
                case 5:
                    quickSort(plantilla, 0, plantilla.length - 1);
                    for (Jugador jugador : plantilla) {
                        jugador.imprimir();
                    }
                    break;
                case 6:
                    comparador(plantilla);
                    break;
                case 7:
                    System.out.println("Salir");
                    break;
                default:
                    System.out.println("Error");
            }
        }
    }

    public static Jugador[] generarEquipo(int cantidad) {
        Jugador[] plantilla = new Jugador[cantidad];
        for (int i = 0; i < cantidad; i++) {
            String nombre = nombreAleatorio();
            String apellidos = apellidosAleatorio();
            String posicion = posicionAleatoria();
            plantilla[i] = new Jugador(nombre, apellidos, posicion, i);
        }
        return plantilla;
    }

    //Funcion Desordenar  Equipo
    public static Jugador[] desordenarEquipo(Jugador[] plantilla) {
        int random = (int) Math.floor(Math.random() * 100);

        for (int i = 10; i < random + 10; i++) {
            int valor1;
            int valor2;
            valor1 = (int) Math.floor(Math.random() * (plantilla.length - 1));
            valor2 = (int) Math.floor(Math.random() * (plantilla.length - 1));
            Jugador temporal = plantilla[valor1];
            plantilla[valor1] = plantilla[valor2];
            plantilla[valor2] = temporal;
        }
        return plantilla;

    }
    //Funcion BusquedaBinaria

    public static int busquedaBinaria(Jugador[] plantilla, int numero) {
        int izq = 0;
        int der = plantilla.length - 1;
        int centro = (izq + der) / 2;
        int contador = 1;
        while ((izq <= der) && (plantilla[centro].getDorsal() != numero)) {
            System.out.println("Numero de paso: " + contador);
            contador++;
            if (numero < plantilla[centro].getDorsal()) {
                der = centro - 1;
            } else {
                izq = centro + 1;
            }
            centro = (izq + der) / 2;
        }
        if (izq > der) {
            return -1;
        } else {
            return centro;
        }
    }

    //Funcion BubbleSort
    public static Jugador[] bubbleSort(Jugador[] player) {
        int n = player.length;
        Jugador temp;
        int contador = 0;
        boolean ordenado = false;

        for (int i = 0; i < n; i++) {
            contador++;
            if (ordenado) {
                return player;
            }
            ordenado = true;
            for (int j = 0; j < (n - i - 1); j++) {
                contador++;
                if (player[j].getDorsal() > player[j + 1].getDorsal()) {
                    temp = player[j];
                    player[j] = player[j + 1];
                    player[j + 1] = temp;
                    ordenado = false;

                }
            }

        }
        System.out.println("Numero de pasos: " + contador);
        return player;
    }

    //Funcion QuickSort
    public static void quickSort(Jugador[] player, int izq, int der) {
        Jugador pivote = player[izq];
        int i = izq;
        int j = der;

        Jugador temp;
        while (i < j) {
            while (player[i].getDorsal() <= pivote.getDorsal() && i < j) {
                i++;
            }
            while (player[j].getDorsal() > pivote.getDorsal()) {
                j--;
            }
            if (i < j) {
                temp = player[i];
                player[i] = player[j];
                player[j] = temp;
            }
        }
        player[izq] = player[j];
        player[j] = pivote;
        if (izq < j - 1) {
            quickSort(player, izq, j - 1);
        }
        if (der > j + 1) {
            quickSort(player, j + 1, der);
        }
    }

    public static void comparador(Jugador[] plantilla) {
        Jugador[] desorden = (Jugador[]) plantilla.clone();
        long startTime = System.nanoTime();
        bubbleSort(plantilla); // llamamos al método
        long endTime = System.nanoTime() - startTime; // tiempo en que se ejecuta su método
        System.out.println("Duración bubble: " + (endTime) / 1e9 + " ms");

        System.out.println("\t");
        System.out.println("\t");

        startTime = System.nanoTime();
        quickSort(desorden, 0, desorden.length - 1); // llamamos al método
        endTime = System.nanoTime() - startTime; // tiempo en que se ejecuta su método
        System.out.println("Duración quick: " + (endTime) / 1e9 + " ms");
    }

    public static String nombreAleatorio() {
        String[] nombresAleatorios = new String[1];
        String[] nombres = {"Besame", "David", "Baldomero", "Balduino", "Paco", "Baltasar", "Barry", "Bartolo",
            "Bartolomé", "Baruc", "Baruj", "Candelaria", "Cándida", "Canela", "Caridad", "Rosame", "Jony",
            "Caritina", "Carlota", "Baltazar"};
        return nombres[(int) (Math.floor(Math.random() * (nombres.length)))];
    }

    public static String apellidosAleatorio() {
        String[] apellidosAleatorios = new String[2];

        String[] apellido = {"Gomez", "Guerrero", "Elnavo", "Cardiel", "Cardona", "Cardoso", "Cariaga", "Melavo",
            "Carion", "Castiyo", "Castorena", "Castro", "Grande", "Grangenal", "Grano", "Grasia", "Elano",
            "Grigalva", "Kalvani", "Carrillo", "Castillo"};

        return apellido[(int) (Math.floor(Math.random() * (apellido.length)))] + " " + apellido[(int) (Math.floor(Math.random() * (apellido.length)))];
    }

    public static String posicionAleatoria() {
        String[] posicion = {"Portero", "Defensa", "Defensa", "Defensa", "Defensa", "Centrocampista", "Centrocampista", "Centrocampista", "Centrocampista", "Delantero", "Delantero", "Delantero"};
        return posicion[(int) (Math.floor(Math.random() * (posicion.length)))];
    }

}
