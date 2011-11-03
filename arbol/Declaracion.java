package arbol;

import arbol.Variable.DATO;

public class Declaracion extends Nodo {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	DATO tipodato;
	
	public Declaracion(DATO tipodato, Nodo listvar) {
		super(TIPO.sent_declaracion);
		this.tipodato = tipodato;
		this.add(listvar);
		// TODO Auto-generated constructor stub
	}
	
	public DATO getTipodato(){ return tipodato;}

}
