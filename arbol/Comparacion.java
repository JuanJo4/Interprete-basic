package arbol;

public class Comparacion extends Nodo{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public enum OP_COMPARACION { IGUAL_A,DIFERENTE_A,MAYOR_A,MAYOR_IGUAL_A,MENOR_A,MENOR_IGUAL_A}
	public enum OP_LOGICO { Y, O }
	
	boolean valor;
	OP_COMPARACION operador;
	OP_LOGICO operadorl;
	
	public Comparacion(OP_COMPARACION operador) {
		super(TIPO.expresion_comparacion);
		this.operador = operador;
		// TODO Auto-generated constructor stub
	}
	public Comparacion(OP_LOGICO operadorl) {
		super(TIPO.expresion_compuesta);
		this.operadorl = operadorl;
		// TODO Auto-generated constructor stub
	}
	
	public void calcular(OP_COMPARACION operador){
		Object ob1 = null,ob2 = null;
		
		if(((Nodo) this.getFirstChild()).getTipo()==TIPO.CONSTANTE)
			ob1 = ((Constante) this.getFirstChild()).getValor();
		else				
			ob2 = ((Operacion) this.getFirstChild()).getValor();
		
		if(((Nodo) this.getLastChild()).getTipo()==TIPO.CONSTANTE)
			ob1 = ((Constante) this.getLastChild()).getValor();
		else				
			ob2 = ((Operacion) this.getLastChild()).getValor();
		
		switch(operador){
			case IGUAL_A:
				valor = (ob1 == ob2);
			break;
			
			case DIFERENTE_A:
				valor = (ob1 != ob2);
			break;
			
			case MAYOR_A:
				valor = (Float.parseFloat(ob1.toString()) > Float.parseFloat(ob2.toString()));
			break;
			
			case MAYOR_IGUAL_A:
				valor = (Float.parseFloat(ob1.toString()) >= Float.parseFloat(ob2.toString()));
			break;
			
			case MENOR_A:
				valor = (Float.parseFloat(ob1.toString()) < Float.parseFloat(ob2.toString()));
			break;
			
			case MENOR_IGUAL_A:
				valor = (Float.parseFloat(ob1.toString()) <= Float.parseFloat(ob2.toString()));
			break;		
		}
	}
	
	public void calcular(OP_LOGICO operador){
		boolean b1,b2;
		
		 b1= ((Comparacion)this.getFirstChild()).getValor();
		 b2= ((Comparacion)this.getLastChild()).getValor();
		 
		switch(operador){
			case Y:
				valor = (b1 && b2); 
			break;
			
			case O:
				valor = (b1 || b2);
			break;		
		}
	}
	
	public void setNot(){ valor = !valor;}
	public boolean getValor(){ return valor; }
	
}
