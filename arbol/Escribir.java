package arbol;

public class Escribir extends Nodo{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	Nodo list;
	
	public Escribir(Nodo list) {
		super(TIPO.sent_escribir);
		this.list = list;
		// TODO Auto-generated constructor stub
	}

}
