package arbol;

public class Bucle extends Nodo {

	boolean condicion;
	int inicio,limite,salto;
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Bucle(TIPO tiponodo) {
		super(tiponodo);
		inicio = limite = salto = -1;
		// TODO Auto-generated constructor stub
	}
	
	public void setBucle(int inicio, int limite, int salto){
		this.inicio = inicio;
		this.limite = limite;
		this.salto = salto;
	}
	
}
