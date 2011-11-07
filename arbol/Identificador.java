package arbol;

public class Identificador extends Nodo {

	String namevar;
	int tam;
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Identificador(String namevar) {
		super(TIPO.IDENTIFICADOR);
		this.namevar = namevar;
		this.tam = -1;
		// TODO Auto-generated constructor stub
	}
	
	public Identificador(String namevar, int tam) {
		super(TIPO.IDENTIFICADOR);
		this.namevar = namevar;
		this.tam = tam;	
		// TODO Auto-generated constructor stub
	}

	public boolean isVector(){	return tam>0; }
	
	public String getNamevar() { return namevar; }

	public int getTam() { return tam; }

}
