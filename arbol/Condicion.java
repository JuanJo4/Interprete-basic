package arbol;

public class Condicion extends Nodo{

	boolean condicion;
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public Condicion(boolean condicion,Nodo verdadero) {
		super(TIPO.sent_if);
		this.add(verdadero);
		this.condicion = condicion;
		// TODO Auto-generated constructor stub
	}
	
	public Condicion(boolean condicion,Nodo verdadero,Nodo falso) {
		super(TIPO.sent_if);
		this.add(verdadero);
		this.add(falso);
		this.condicion = condicion;
		// TODO Auto-generated constructor stub
	}
	
	public void getAccion(){
		if(condicion){
			/*	Se ejecuta el nodo verdadero	*/
		}else{
			if(this.getChildCount()==2){
				/*	Se ejecuta el nodo falso	*/
			}
		}
	}
}
