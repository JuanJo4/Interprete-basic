package arbol;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Symbols {
	List<Variable> listSymbols;
	Iterator it;
	
	public Symbols() {
		listSymbols = new ArrayList<Variable>();
		it = listSymbols.iterator();
		// TODO Auto-generated constructor stub
	}
	
	public void add(Variable var){
		listSymbols.add(var);
	}
	
	public void setValor(String namevar,Object valor){
		while(it.hasNext()){			
			if(((Variable) it.next()).getNamevar().equals(namevar)){
				((Variable) it.next()).setValor(valor);
			}
		}	
	}
	/*public Object getValorAt(String namevar){
	}*/
}
