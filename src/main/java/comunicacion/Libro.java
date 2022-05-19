package comunicacion;

public class Libro extends Escrito {

	public Libro(String origen, String titulo, String autor, int paginas, String co_autor,  String editorial,  String edicion, String interpretacion) {
		super(origen, titulo, autor, paginas);
		this.co_autor = co_autor;
		this.editorial = editorial;
		this.edicion = edicion;
		this.interpretacion = interpretacion;
	}
	private String co_autor;
	private String editorial;
	private String edicion;
	private String interpretacion;
	
	
	public void setCo_autor(String ca)
	{
		this.co_autor = ca;
	}
	
	public void setEditorial(String ca)
	{
		this.editorial = ca;
	}

	public void setEdicion(String ca)
	{
		this.edicion = ca;
	}
	
	public void setInterpretacion(String ca)
	{
		this.interpretacion = ca;
	}
	
	public String getCo_autor()
	{
		return this.co_autor;
	}
	
	public String getEditorial()
	{
		return this.editorial;
	}

	public String getEdicion()
	{
		return this.edicion;
	}
	
	public String interpretacion()
	{
		return this.interpretacion;
	}
	
	public String toString()
	{
		return super.getOrigen() + "\n" + super.getTitulo() + "\n" + super.getAutor() + "\n" + super.getPaginas() + "\n" + this.co_autor + "\n" + this.editorial + "\n" + this.edicion;
	}


	int palabrasTotales(int palabrasPagina) {
		return palabrasPagina*super.getPaginas()*2;
	}
	
}
