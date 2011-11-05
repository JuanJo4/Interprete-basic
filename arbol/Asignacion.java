package arbol;

public class Asignacion extends Nodo {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	String namevar;
	int pos;
	Object valor;
	
	public Asignacion(String namevar,Nodo hijo) {
		super(TIPO.sent_asignacion);
		this.add(hijo);
		this.namevar = namevar;
		this.pos = -1;
		// TODO Auto-generated constructor stub
	}
	
	public Asignacion(String namevar,int pos,Nodo hijo) {
		super(TIPO.sent_asignacion);
		this.add(hijo);
		this.namevar = namevar;
		this.pos = pos;
		// TODO Auto-generated constructor stub
	}
	
	public boolean isVector(){ return pos>=0; }
	
	public Object getValor(){
		return ((Nodo)this.getFirstChild()).getValor();
	}

}
