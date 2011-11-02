package arbol;


public class Declaracion extends Nodo{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public enum TIPODATO {INTEGER,FLOAT, STRING}
	
	public Declaracion(TIPODATO tipodato,Nodo listvar) {
		super(TIPO.sent_declaracion);
		this.add(listvar);
		// TODO Auto-generated constructor stub
	}


}
