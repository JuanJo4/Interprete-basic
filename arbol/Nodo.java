package arbol;

import javax.swing.tree.DefaultMutableTreeNode;

public class Nodo extends DefaultMutableTreeNode {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public enum TIPO { programa, sub_programa, secuencia_sent, sentencia, sent_declaracion, tipo_dato, list_var, sent_asignacion,
		sent_escribir, list_impresion, sent_leer, sent_if, sent_for, sent_do, sent_while, def_proc, call_proc, list_param,
		expresion_compuesta, op_logico, expresion_comparacion, op_comparacion, expresion_simple, op_suma, term, op_mult,
		ID}
	
	TIPO tiponodo;	
	
	public Nodo(TIPO tiponodo) {
		// TODO Auto-generated constructor stub
		this.tiponodo = tiponodo;
	}
	
	public TIPO getTipo(){ return tiponodo; }
	
	public void printTree(){
		System.out.println("Nodo " + tiponodo + " (" + this.getChildCount() + ")");
		
		for(int i=0;i<this.getChildCount();i++){
			((Nodo) this.getChildAt(i)).printTree();			
		}
	}
	

}
