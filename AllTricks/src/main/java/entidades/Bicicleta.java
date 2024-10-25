package entidades;

public class Bicicleta {
	
	private int idBicicleta;
	private String foto;
	private int idMarca;
	private String descripcion;
	private double precio;
	private boolean favorita;
	
	public Bicicleta() {
		
	}

	public Bicicleta(int idBicicleta, String foto, int idMarca, String descripcion, double precio, boolean favorita) {
		this.idBicicleta = idBicicleta;
		this.foto = foto;
		this.idMarca = idMarca;
		this.descripcion = descripcion;
		this.precio = precio;
		this.favorita = favorita;
	}

	public int getIdBicicleta() {
		return idBicicleta;
	}

	public void setIdBicicleta(int idBicicleta) {
		this.idBicicleta = idBicicleta;
	}

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}

	public int getIdMarca() {
		return idMarca;
	}

	public void setIdMarca(int idMarca) {
		this.idMarca = idMarca;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public boolean isFavorita() {
		return favorita;
	}

	public void setFavorita(boolean favorita) {
		this.favorita = favorita;
	}

	@Override
	public String toString() {
		return "Bicicleta [idBicicleta=" + idBicicleta + ", foto=" + foto + ", idMarca=" + idMarca + ", descripcion="
				+ descripcion + ", precio=" + precio + ", favorita=" + favorita + "]";
	}
	
	
	
	

}
