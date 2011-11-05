package arbol;

public class Operacion extends Nodo{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public enum OP { SUMA, RESTA, MULTIPLICACION, DIVISION, MODULO, POTENCIA}
	
	OP operando;
	float valor;

	public Operacion(OP operando) {
		super(TIPO.operacion);
		this.operando = operando;
		// TODO Auto-generated constructor stub
	}
	
	public void calcular(){
		float f1,f2;
		switch(operando){
			case SUMA:
				if(((Nodo) this.getFirstChild()).getTipo()==TIPO.CONSTANTE){
					f1 = Float.parseFloat(((Constante) this.getFirstChild()).getValor().toString());
					f2 = Float.parseFloat(((Constante) this.getLastChild()).getValor().toString());
					valor = f1 + f2;
				}
				else{
					f1 = Float.parseFloat(((Operacion) this.getFirstChild()).getValor().toString());
					f2 = Float.parseFloat(((Constante) this.getLastChild()).getValor().toString());
					valor = f1 + f2;
				}
			break;
			case RESTA:
				if(((Nodo) this.getFirstChild()).getTipo()==TIPO.CONSTANTE){
					f1 = Float.parseFloat(((Constante) this.getFirstChild()).getValor().toString());
					f2 = Float.parseFloat(((Constante) this.getLastChild()).getValor().toString());
					valor = f1 - f2;
				}
				else{
					f1 = Float.parseFloat(((Operacion) this.getFirstChild()).getValor().toString());
					f2 = Float.parseFloat(((Constante) this.getLastChild()).getValor().toString());
					valor = f1 - f2;
				}
			break;
			case MULTIPLICACION:
				if(((Nodo) this.getFirstChild()).getTipo()==TIPO.CONSTANTE){
					f1 = Float.parseFloat(((Constante) this.getFirstChild()).getValor().toString());
					f2 = Float.parseFloat(((Constante) this.getLastChild()).getValor().toString());
					valor = f1 * f2;
				}
				else{
					f1 = Float.parseFloat(((Operacion) this.getFirstChild()).getValor().toString());
					f2 = Float.parseFloat(((Constante) this.getLastChild()).getValor().toString());
					valor = f1 * f2;
				}
			break;
			case DIVISION:
				if(((Nodo) this.getFirstChild()).getTipo()==TIPO.CONSTANTE){
					f1 = Float.parseFloat(((Constante) this.getFirstChild()).getValor().toString());
					f2 = Float.parseFloat(((Constante) this.getLastChild()).getValor().toString());
					valor = f1 / f2;
				}
				else{
					f1 = Float.parseFloat(((Operacion) this.getFirstChild()).getValor().toString());
					f2 = Float.parseFloat(((Constante) this.getLastChild()).getValor().toString());
					valor = f1 / f2;
				}
			break;
			case MODULO:
				if(((Nodo) this.getFirstChild()).getTipo()==TIPO.CONSTANTE){
					f1 = Float.parseFloat(((Constante) this.getFirstChild()).getValor().toString());
					f2 = Float.parseFloat(((Constante) this.getLastChild()).getValor().toString());
					valor = f1 % f2;
				}
				else{
					f1 = Float.parseFloat(((Operacion) this.getFirstChild()).getValor().toString());
					f2 = Float.parseFloat(((Constante) this.getLastChild()).getValor().toString());
					valor = f1 % f2;
				}
			break;
			case POTENCIA:
				if(((Nodo) this.getFirstChild()).getTipo()==TIPO.CONSTANTE){
					f1 = Float.parseFloat(((Constante) this.getFirstChild()).getValor().toString());
					f2 = Float.parseFloat(((Constante) this.getLastChild()).getValor().toString());
					valor = (float) Math.pow(f1,f2);
				}
				else{
					f1 = Float.parseFloat(((Operacion) this.getFirstChild()).getValor().toString());
					f2 = Float.parseFloat(((Constante) this.getLastChild()).getValor().toString());
					valor = (float) Math.pow(f1,f2);
				}
			break;
		}
	}
	
	public Object getValor(){ return valor; }

}
