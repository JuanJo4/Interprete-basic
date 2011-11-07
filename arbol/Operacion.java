package arbol;

public class Operacion extends Nodo{

	public enum OP { SUMA, RESTA, MULTIPLICACION, DIVISION, MODULO, POTENCIA}
	
	OP operando;
	float valor;
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Operacion(OP operando) {
		super(TIPO.operacion);
		this.operando = operando;
		// TODO Auto-generated constructor stub
	}
	
	public void calcular(){
		float f1,f2;
		
		if(((Nodo) this.getFirstChild()).getTipo()==TIPO.CONSTANTE)
			f1 = Float.parseFloat(((Constante) this.getFirstChild()).getValor().toString());
		else				
			f1 = Float.parseFloat(((Operacion) this.getFirstChild()).getValor().toString());
		
		if(((Nodo) this.getLastChild()).getTipo()==TIPO.CONSTANTE)				
			f2 = Float.parseFloat(((Constante) this.getLastChild()).getValor().toString());
		else
			f2 = Float.parseFloat(((Operacion) this.getLastChild()).getValor().toString());
		
		switch(operando){
			case SUMA:			
				valor = f1 + f2;								
			break;
			
			case RESTA:
				valor = f1 - f2;
			break;
			
			case MULTIPLICACION:
				valor = f1 * f2;
			break;
			
			case DIVISION:
				valor = f1 / f2;
			break;
			
			case MODULO:
				valor = f1 % f2;
			break;
			
			case POTENCIA:
				valor = (float) Math.pow(f1,f2);
			break;			
		}
	}
	
	public Object getValor(){ return valor; }
	
	public void imprimir(){	System.out.print(getValor()) ; }
}
