package arbol;

public class Asignacion extends Nodo {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	String namevar;
	
	Nodo id;
	
	public Asignacion(Nodo id,Nodo valor) {
		super(TIPO.sent_asignacion);
		this.add(valor);
		this.id = id;
		// TODO Auto-generated constructor stub
	}

}
