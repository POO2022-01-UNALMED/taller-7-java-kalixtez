package comunicacion;

public class Tesis extends Escrito 
{
	public Tesis(String origen, String titulo, String autor, int paginas, String idea, String argumentos[], String conclusion, String referencia, String interpretacion) {
		super(origen, titulo, autor, paginas);
		this.setIdea(idea);
		this.setArgumentos(argumentos);
		this.setConclusion(conclusion);
		this.setReferencia(referencia);
	}


	private String idea;
	private String argumentos[];
	private String conclusion;
	private String referencia;
	private String interpretacion;
	
	public void setInterpretacion(String ca)
	{
		this.interpretacion = ca;
	}
		
	public String interpretacion()
	{
		return this.interpretacion;
	}
	
	public String toString()
	{
		return super.getOrigen() + "\n" + super.getTitulo() + "\n" + super.getAutor() + "\n" + super.getPaginas() + "\n" + this.idea + "\n" + this.argumentos + "\n" + this.conclusion + "\n" + this.referencia;
	}

	public int palabrasTotales(int palabrasPagina) {
		return palabrasPagina*super.getPaginas()*5;
	}

	public String getReferencias() {
		return referencia;
	}

	public void setReferencias(String referencia) {
		this.referencia = referencia;
	}

	public String getConclusion() {
		return conclusion;
	}

	public void setConclusion(String conclusion) {
		this.conclusion = conclusion;
	}

	public String[] getArgumentos() {
		return argumentos;
	}

	public void setArgumentos(String argumentos[]) {
		this.argumentos = argumentos;
	}

	public String getIdea() {
		return idea;
	}

	public void setIdea(String idea) {
		this.idea = idea;
	}
	
	
	
}
