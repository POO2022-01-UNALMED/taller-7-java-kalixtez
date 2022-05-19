package comunicacion;

public class Alfabeto extends Pictograma
{
	public Alfabeto(String origen, String letras[], String interpretacion) {
		super(origen);
		this.letras = letras;
		this.interpretacion = interpretacion;

	}
	private String letras[];
	private String interpretacion;
	
	public int cantidadLetras()
	{
		return this.letras.length;
	}
	
	public String interpretacion()
	{
		return this.interpretacion;
	}
	
	public String toString()
	{
		String r = "";
		for(int i = 0; i < letras.length; i++)
		{
			if(i != letras.length - 1)
				r += letras[i]+ ", ";
			else
				r += letras[i];
		}
		
		return r;
	}
	
	public String[] getLetras()
	{
		return this.letras;
	}
	
	public void setLetras(String[] l)
	{
		this.letras = l;
	}
	
	public void setInterpretacion(String i)
	{
		this.interpretacion = i;
	}
}
