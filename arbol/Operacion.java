package arbol;

public class Operacion extends Nodo{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public enum OP { SUMA, RESTA, MULTIPLICACION, DIVISION, MODULO, POTENCIA}
	
	OP operando;
	int valor;

	public Operacion(OP operando) {
		super(TIPO.operacion);
		this.operando = operando;
		// TODO Auto-generated constructor stub
	}

}
