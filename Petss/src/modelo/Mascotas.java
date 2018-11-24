package modelo;

public class Mascotas {

	private Mascotas siguiente;
	private Mascotas anterior;

	private String nombre;
	private int edad;
	private char sexo;
	private String raza;
	private String tipo;

	public Mascotas(String nombre, int edad, char sexo, String raza, String tipo) {

		this.nombre = nombre;
		this.edad = edad;
		this.sexo = sexo;
		this.raza = raza;
		this.tipo = tipo;
	

		siguiente = null;
		anterior = null;

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

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public Mascotas getAnterior() {
		return anterior;
	}

	public void setAnterior(Mascotas anterior) {
		this.anterior = anterior;
	}

	public Mascotas getSiguiente() {
		return siguiente;
	}

	public void setSiguiente(Mascotas siguiente) {
		this.siguiente = siguiente;
	}

	public int compareTo(Mascotas a) {

		int resultado;
		if (this.nombre.compareTo(a.nombre) < 0) {

			resultado = -1;

		} else if (this.nombre.compareTo(a.nombre) == 0) {

			resultado = 0;

		} else {

			resultado = 1;

		}
		return resultado;
	}


	@Override
	public String toString() {
		return "Mascota [siguiente=" + siguiente + ", nombre=" + nombre + ", edad=" + edad + ", sexo=" + sexo + ", raza=" + raza + "]";
	}

}
