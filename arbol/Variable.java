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
	
	public boolean setValor(Object valor_simple){		
		if(tipodato==DATO.INTEGER && valor_simple.getClass()== Integer.class
			|| tipodato==DATO.INTEGER && valor_simple.getClass()== Float.class
			|| tipodato==DATO.FLOAT && valor_simple.getClass()== Float.class
			|| tipodato==DATO.STRING && valor_simple.getClass()== String.class){
			this.valor_simple = valor_simple;
			return true;
		}else
			return false;
	}
	
	public boolean setValor(Object valor_vector,int pos){
		if(pos<tam){
			if(tipodato==DATO.INTEGER && valor_vector.getClass()== Integer.class
					|| tipodato==DATO.INTEGER && valor_vector.getClass()== Float.class
					|| tipodato==DATO.FLOAT && valor_vector.getClass()== Float.class
					|| tipodato==DATO.STRING && valor_vector.getClass()== String.class){
					this.valor_vector[pos] = valor_vector;
					return true;
				}else
					return false;					
		}
		return false;
	}
	
	public boolean isVector(){	return tam>0; }
	public DATO getTipodato(){	return tipodato; }
	public String getNamevar(){	return namevar; }
	public Object getValor(){	
		if(valor_simple==null)
			System.out.println("Error! - Variable con valor nulo");
		
		return valor_simple;
	}
	public Object getValor(int pos){	
		if(valor_vector[pos]==null)
			System.out.println("Error! - Variable con valor nulo");
		
		return valor_vector[pos];
	}
}
