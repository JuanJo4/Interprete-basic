package arbol;

public class Variable {
	
	public enum DATO { INTEGER, FLOAT, STRING }
	
	DATO tipodato;
	String namevar;
	Object valor;
	int tam;
	int pos;
	
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
		// TODO Auto-generated constructor stub
	}
	
	public void setValor(Object valor){
		this.valor = valor;
	}
	
	public void setValor(Object valor,int pos){
		if(pos<tam){
			this.valor = valor;
			this.pos = pos;
		}
	}
	
	public boolean isVector(){	return tam>0; }
	public String getNamevar(){	return namevar; }
	public Object getValor(){	return valor; }
	public int getPos(){	return pos;	}
}
