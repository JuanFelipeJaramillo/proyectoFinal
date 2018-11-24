package modelo;

public class Perro extends Mascotas {

private String tienePedigree;
	
	public Perro(String nombre, int edad, char sexo, String raza, String tienePedigree) {
		super(nombre, edad, sexo, raza);
		this.tienePedigree = tienePedigree;
	}

		
	
	public String getTienePedigree() {
		return tienePedigree;
	}

	public void setTienePedigree(String tienePedigree) {
		this.tienePedigree = tienePedigree;
	}
	
}
