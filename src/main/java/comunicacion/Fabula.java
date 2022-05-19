package comunicacion;

public class Fabula extends Escrito
{
	public Fabula(String origen, String titulo, String autor, int paginas, String ensenanza, String interpretacion) {
		super(origen, titulo, autor, paginas);
		this.ensenanza = ensenanza;
		this.interpretacion = interpretacion;
		// TODO Auto-generated constructor stub
	}


	private String ensenanza;
	private String interpretacion;
	
	
	public void setEnsenanza(String ca)
	{
		this.ensenanza = ca;
	}
	
	public void setInterpretacion(String ca)
	{
		this.interpretacion = ca;
	}
	
	public String getEnsenanza()
	{
		return this.ensenanza;
	}
	
	public String interpretacion()
	{
		return this.interpretacion;
	}
	
	public String toString()
	{
		return super.getOrigen() + "\n" + super.getTitulo() + "\n" + super.getAutor() + "\n" + super.getPaginas() + "\n" + this.ensenanza;
	}


	int palabrasTotales(int palabrasPagina) {
		return palabrasPagina*super.getPaginas()*1;
	}
	
}
