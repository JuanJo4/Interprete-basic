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
	public void imprimir(){	
		/*	Si es una cadena	*/
		if(getValor().getClass()==String.class){
			String cad = (String) getValor();
			cad = cad.replace(' ','-');
			cad = cad.replace('"',' ');
			cad = cad.trim();
			cad = cad.replace('-',' ');
			
			System.out.print(cad);
		}else{
				System.out.print(getValor());
		}
		
	}
}
