package entidades;

public class Bicicleta {
	
	private int idBicicleta;
	private String foto;
	private int idMarca;
	private String nombreMarca;
	private String descripcion;
	private double precio;
	private int favorita;
	
	public Bicicleta() {
		
	}

	public Bicicleta(int idBicicleta, String foto, int idMarca,String nombreMarca, String descripcion, double precio, int favorita) {
		this.idBicicleta = idBicicleta;
		this.foto = foto;
		this.idMarca = idMarca;
		this.nombreMarca = nombreMarca;
		this.descripcion = descripcion;
		this.precio = precio;
		this.favorita = favorita;
	}
	

	public String getNombreMarca() {
		return nombreMarca;
	}

	public void setNombreMarca(String nombreMarca) {
		this.nombreMarca = nombreMarca;
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

	public int getFavorita() {
		return favorita;
	}

	public void setFavorita(int favorita) {
		this.favorita = favorita;
	}

	@Override
	public String toString() {
		return "Bicicleta [idBicicleta=" + idBicicleta + ", foto=" + foto + ", idMarca=" + idMarca + ", nombreMarca="
				+ nombreMarca + ", descripcion=" + descripcion + ", precio=" + precio + ", favorita=" + favorita + "]";
	}

	
	
	
	
	

}
