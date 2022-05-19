package comunicacion;

public class Periodico extends Escrito{

	public Periodico(String origen, String titulo, String autor, int paginas, String fecha, String primicia, String interpretacion) {
		super(origen, titulo, autor, paginas);
		this.fecha = fecha;
		this.interpretacion = interpretacion;
		this.primicia = primicia;
	}


	private String fecha;
	private String primicia;
	private String interpretacion;
	
	public void setFecha(String ca)
	{
		this.fecha = ca;
	}
	
	public void setPrimicia(String ca)
	{
		this.primicia = ca;
	}

	public void setInterpretacion(String ca)
	{
		this.interpretacion = ca;
	}
	
	public String getFecha()
	{
		return this.fecha;
	}
	
	public String getPrimicia()
	{
		return this.primicia;
	}
	
	public String interpretacion()
	{
		return this.interpretacion;
	}
	
	public String toString()
	{
		return super.getOrigen() + "\n" + super.getTitulo() + "\n" + super.getAutor() + "\n" + super.getPaginas() + "\n" + this.fecha + "\n" + this.interpretacion;
	}


	int palabrasTotales(int palabrasPagina) {
		return palabrasPagina*super.getPaginas()*10;
	}
	
}
