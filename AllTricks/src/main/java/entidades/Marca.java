package entidades;

public class Marca {
	
	private int idMarca;
	private String nombre;
	
	public Marca() {
		
	}
	
	public Marca(int v_idMarca,String v_nombre) {
		this.idMarca = v_idMarca;
		this.nombre = v_nombre;
	}

	public int getIdMarca() {
		return idMarca;
	}

	public void setIdMarca(int idMarca) {
		this.idMarca = idMarca;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Marca [idMarca=" + idMarca + ", nombre=" + nombre + "]";
	}
	
	

}
