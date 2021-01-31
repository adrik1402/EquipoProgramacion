package Equipo;

import java.util.Random;

//ATRIBUTOS

public class Jugador {
	private String nombre;
	private String apellidos;
	private String [] posiciones = {"Portero","Defensa","Centrocampista","Delantero"};
	private String posicion;
	private int dorsal;

//METODOS
        
        //LLAMA AL JUGADOR
        public void mostrarJugador(){
            System.out.println(this.nombre+" "+this.apellidos+" "+this.posicion+" "+this.dorsal);
        }
        
        // GENERADOR DE JUGADOR
	public Jugador (String nombre, String apellidos, String posicion, int dorsal) {
		this.nombre=nombre;
		this.apellidos=apellidos;
		this.posicion=posicion;
		this.dorsal=dorsal;
		
	}
        // MODIFICA EL NOMBRE.
	public void setNombre (String nombre) {
		String[] nombresAleatorios = new String[1];
		String[] nombres = { "Besame", "David", "Baldomero", "Balduino", "Paco", "Baltasar", "Barry", "Bartolo",
				"Bartolomé", "Baruc", "Baruj", "Candelaria", "Cándida", "Canela", "Caridad", "Rosame", "Jony",
				"Caritina", "Carlota", "Baltazar"};
                nombre = nombres[new Random().nextInt(nombres.length)];
                this.nombre=nombre;
	}
        // GENERA EL NOMBRE.
        public  String getNombre(){
            return nombre;
        }

        // MODIFICA EL APELLIDO.
	public void setApellidos (String apellidos) {
                
		String[] apellidosAleatorios = new String[2];
                
		String[] apellido = { "Gomez", "Guerrero", "Elnavo", "Cardiel", "Cardona", "Cardoso", "Cariaga", "Melavo",
				"Carion", "Castiyo", "Castorena", "Castro", "Grande", "Grangenal", "Grano", "Grasia", "Elano",
				"Grigalva","Kalvani","Carrillo","Castillo" };
                
                apellidos = apellido[new Random().nextInt(apellido.length)] +" " + apellido[new Random().nextInt(apellido.length)];
                this.apellidos=apellidos;
	}
        
        // GENERA EL APELLIDO
        public  String getApellidos(){
            return apellidos;
        }
        
        // MODIFICA LA POSICION.
	public void setPosicion (String posicion) {
		if (validacion(posicion)) {
			this.posicion=posicion;
		}else {
			System.out.println("Error");
		}
	}

        // GENERA LA POSICION.
	public  String getPosicion(){
            return posicion;
        }
        

        //COMPRUEBA SI LA POSICION ENTRA EN LAS 4 POSIBLES.
	private boolean validacion(String posicion) {
		for(String entrada:this.posiciones) {
			if(posicion.equals(entrada)) {
				return true;
				
			}
		}return false;
                }

	// MODIFICA EL DORSAL.
	private void setDorsal (int dorsal) {
		dorsal = (int)(Math.random()*23);
		this.dorsal=dorsal;
	}
	
        // GENERA EL DORSAL.
        public  int getDorsal(){
            return dorsal;
        }

	
}
