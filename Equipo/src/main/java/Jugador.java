public class Jugador {
	private String nombre;
	private String apellidos;
	private String [] posiciones = {"Portero","Defensa","Centrocampista","Delantero"};
	private String posicion;
	private int dorsal;
	
	public Jugador (String nombre, String apellidos, String posicion, int dorsal) {
		this.nombre=nombre;
		this.apellidos=apellidos;
		this.posicion=posicion;
		this.dorsal=dorsal;
		
	}
	public void setNombre (String nombre) {
		String[] nombresAleatorios = new String[1];
		String[] nombres = { "Besame", "David", "Baldomero", "Balduino", "Paco", "Baltasar", "Barry", "Bartolo",
				"Bartolomé", "Baruc", "Baruj", "Candelaria", "Cándida", "Canela", "Caridad", "Rosame", "Jony",
				"Caritina", "Carlota", "Baltazar"};
		
		
	}
	public void setApellidos (String apellidos) {
		String[] apellidosAleatorios = new String[2];
		
		String[] apellido = { "Gomez", "Guerrero", "Elnavo  ", "Cardiel", "Cardona", "Cardoso", "Cariaga", "Melavo",
				"Carion", "Castiyo", "Castorena", "Castro", "Grande", "Grangenal", "Grano", "Grasia", "Elano",
				"Grigalva" };
		
	}
	public void setPosicion (String posicion) {
		if (validacion(posicion)) {
			this.posicion=posicion;
		}else {
			System.out.println("Error");
		}
	}
	
	private boolean validacion(String posicion) {
		for(String entrada:this.posiciones) {
			if(posicion.equals(entrada)) {
				return true;
				
			}
		}return false;
                }

	
	private void setDorsal (int dorsal) {
		dorsal = (int)(Math.random()*23);
		this.dorsal=dorsal;
	}
	
//	String getNombre(): devuelve el nombre de un jugador
//
//	String getApellidos(): devuelve los apellidos de un jugador
//
//	String getPosicion(): devuelve la posición de un jugador
//
//	String getDorsal: devuelve el dorsal de un jugador.
//	
//	
	
}
