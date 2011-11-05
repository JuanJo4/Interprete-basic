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
	
	public void setValor(String namevar,Object valor){
		it = listSymbols.iterator();
		while(it.hasNext()){			
			if(((Variable) it.next()).getNamevar().equals(namevar)){
				((Variable) it.next()).setValor(valor);
			}
		}	
	}
	
	public void setValor(String namevar,Object valor,int pos){
		it = listSymbols.iterator();
		while(it.hasNext()){			
			if(((Variable) it.next()).getNamevar().equals(namevar)){
				((Variable) it.next()).setValor(valor,pos);
			}
		}	
	}
	
	public Object getValorAt(String namevar){
		it = listSymbols.iterator();
		while(it.hasNext()){			
			if(((Variable) it.next()).getNamevar().equals(namevar)){
				return ((Variable) it.next()).getValor();
			}
		}
		return null;
	}
	
	public Object getValorAt(String namevar,int pos){
		it = listSymbols.iterator();
		while(it.hasNext()){			
			if(((Variable) it.next()).getNamevar().equals(namevar)){
				return ((Variable) it.next()).getValor(pos);
			}
		}
		return null;
	}
}
