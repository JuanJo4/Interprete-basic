package arbol;

public class Constante extends Nodo {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	Object valor;
	
	public Constante(Object valor) {
		super(TIPO.CONSTANTE);
		this.valor = valor;
		// TODO Auto-generated constructor stub
	}

	public Object getValor(){ return valor; }
	public Object getTipodato(){ return valor.getClass(); }
}
