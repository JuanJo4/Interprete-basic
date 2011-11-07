package arbol;

public class Asignacion extends Nodo {
	String namevar;
	int pos;
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public Asignacion(String namevar,Nodo hijo) {
		super(TIPO.sent_asignacion);
		this.add(hijo);
		this.namevar = namevar;
		this.pos = -1;
		// TODO Auto-generated constructor stub
	}
	
	public Asignacion(String namevar,Nodo hijo,int pos) {
		super(TIPO.sent_asignacion);
		this.add(hijo);
		this.namevar = namevar;
		this.pos = pos;
		// TODO Auto-generated constructor stub
	}
	
	public boolean isVector(){ return pos>=0; }
	
	public Object getValor(){
		if(((Nodo) this.getChildAt(0)).getTipo()==TIPO.CONSTANTE)
			return ((Constante) this.getChildAt(0)).getValor();
		else
			return ((Operacion) this.getChildAt(0)).getValor();
		
	}

}
