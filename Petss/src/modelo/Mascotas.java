package modelo;

public class Mascotas {


	
	private Mascotas siguiente;

	public final char PERRO = 'P';
	public final char GATO = 'G';
	public final char PEZ = 'F';
	private char tipoMascota;
	private String nombre;
	private int edad;
	private char sexo;
	private String raza;
	
	
	public Mascotas (String nombre, int edad, char sexo, String raza, char tipoMascota) {
		
		this.nombre = nombre;
		this.edad = edad;
		this.sexo = sexo;
		this.raza = raza;
		this.tipoMascota = tipoMascota;
		siguiente = null;
		
	}


	public char getTipoMascota() {
		return tipoMascota;
	}


	public void setTipoMascota(char tipoMascota) {
		this.tipoMascota = tipoMascota;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public int getEdad() {
		return edad;
	}


	public void setEdad(int edad) {
		this.edad = edad;
	}


	public char getSexo() {
		return sexo;
	}


	public void setSexo(char sexo) {
		this.sexo = sexo;
	}


	public String getRaza() {
		return raza;
	}


	public void setRaza(String raza) {
		this.raza = raza;
	}
	

	public Mascotas getSiguiente() {
		return siguiente;
	}


	public void setSiguiente(Mascotas siguiente) {
		this.siguiente = siguiente;
	}

	
	public int compareTo (Mascotas a) {
	
		
		int resultado;
		if ( this.nombre.compareTo(a.nombre) < 0 ) {
			
			resultado = -1;
			
		} else if ( this.nombre.compareTo(a.nombre) == 0) {
			
			resultado = 0;
			
		} else { 
			
			resultado =1;
			
		}
	return resultado;	
	}


	@Override
	public String toString() {
		return "Mascotas [siguiente=" + siguiente + ", tipoMascota=" + tipoMascota + ", nombre=" + nombre + ", edad="
				+ edad + ", sexo=" + sexo + ", raza=" + raza + "]";
	}
	

	
}
