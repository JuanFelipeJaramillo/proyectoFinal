package modelo;

public class Gato extends Mascotas{
	
	private String tienePedigree;

	public Gato(String nombre, int edad, char sexo, String raza, String tienePedigree) {
		super(nombre, edad, sexo, raza);
		// TODO Auto-generated constructor stub}
		this.tienePedigree= tienePedigree;
	}

	public String getTienePedigree() {
		return tienePedigree;
	}

	public void setTienePedigree(String tienePedigree) {
		this.tienePedigree = tienePedigree;
	}
}
