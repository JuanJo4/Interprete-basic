package arbol;

import javax.swing.tree.DefaultMutableTreeNode;

public class Nodo extends DefaultMutableTreeNode {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public enum TIPO { programa, sub_programa, secuencia_sent, sentencia, sent_declaracion, tipo_dato, list_var, sent_asignacion,
		sent_escribir, list_impresion, sent_leer, sent_if, sent_for, sent_do, sent_while, def_proc, call_proc, list_param,
		expresion_compuesta, op_logico, expresion_comparacion, op_comparacion, expresion_simple, op_suma, term, op_mult }
	
	TIPO name;	
	
	public Nodo(TIPO name) {
		// TODO Auto-generated constructor stub
		this.name = name;
	}
	

}
