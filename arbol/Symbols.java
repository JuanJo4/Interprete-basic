package arbol;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Symbols {
	List<Variable> listSymbols;
	Iterator<Variable> it;
	
	public Symbols() {
		listSymbols = new ArrayList<Variable>();
		// TODO Auto-generated constructor stub
	}
	
	public void add(Variable var){
		listSymbols.add(var);
		
	}
	
	public boolean setValor(String namevar,Object valor){
		it = listSymbols.iterator();
		
		while(it.hasNext()){
			Variable tmp = it.next();
			if(tmp.getNamevar().equals(namevar)){
				return tmp.setValor(valor);				
			}
		}		
		return false;
	}	
	
	public boolean setValor(String namevar,Object valor,int pos){
		it = listSymbols.iterator();
		
		while(it.hasNext()){
			Variable tmp = it.next();
			if(tmp.getNamevar().equals(namevar)){
				return tmp.setValor(valor,pos);				
			}
		}		
		return false;
	}
	
	public Object getValorAt(String namevar){
		it = listSymbols.iterator();
		
		while(it.hasNext()){
			Variable tmp = it.next();			
			if(tmp.getNamevar().equals(namevar)){
				return tmp.getValor();
			}
		}
		System.out.println("Error! - Variable con valor nulo");
		return null;
	}
	
	public Object getValorAt(String namevar,int pos){
		it = listSymbols.iterator();
		
		while(it.hasNext()){
			Variable tmp = it.next();
			if(tmp.getNamevar().equals(namevar)){				
				return tmp.getValor(pos);
			}
		}
		System.out.println("Error! - Variable con valor nulo");
		return null;
	}
}
