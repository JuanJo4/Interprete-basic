package arbol;

public class Variable {
	
	public enum DATO { INTEGER, FLOAT, STRING }
	
	DATO tipodato;
	String namevar;
	Object valor_simple;
	
	Object[] valor_vector;
	int tam;
	
	/*	Si es variable simple	*/
	public Variable(DATO tipodato,String namevar) {
		this.tipodato = tipodato;
		this.namevar = namevar;
		this.tam = -1;
		// TODO Auto-generated constructor stub
	}
	
	/*	Si es vector	*/
	public Variable(DATO tipodato,String namevar,int tam) {
		this.tipodato = tipodato;
		this.namevar = namevar;
		this.tam = tam;
		valor_vector = new Object[tam];
		// TODO Auto-generated constructor stub
	}
	
	public void setValor(Object valor_simple){
		this.valor_simple = valor_simple;
	}
	
	public void setValor(Object valor_vector,int pos){
		if(pos<tam){
			this.valor_vector[pos] = valor_vector;			
		}
	}
	
	public boolean isVector(){	return tam>0; }
	public String getNamevar(){	return namevar; }
	public Object getValor(){	return valor_simple; }
	public Object getValor(int pos){	return valor_vector[pos]; }
}
