package Equipo;
        
import java.util.Scanner;
        
public class generarEquipo extends Jugador{
    
    private String equipo;

    public generarEquipo(String nombre, String apellidos, String posicion, int dorsal,int cantidad) {
        super(nombre, apellidos, posicion, dorsal);
        for(int i=0;i<=cantidad;i++){
        
        this.mostrarJugador();
    }
    
          
        

    }
}    
    

