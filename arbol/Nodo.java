package arbol;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;

import javax.swing.tree.DefaultMutableTreeNode;

public class Nodo extends DefaultMutableTreeNode {
	public enum TIPO {
		_PROGRAMA_, sub_programa, secuencia_sent, sentencia, sent_declaracion, tipo_dato, 
		list_var, sent_asignacion, sent_escribir, list_impresion, sent_leer, sent_if, 
		sent_for, sent_do, sent_while, def_proc, call_proc, list_param, expresion_compuesta, 
		op_logico, expresion_comparacion, op_comparacion, expresion_simple, op_suma, term, op_mult,
		IDENTIFICADOR, CONSTANTE, operacion	}

	File file;
	FileWriter filew;
	BufferedWriter buf;
	
	TIPO tiponodo;

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Nodo(TIPO tiponodo) {
		// TODO Auto-generated constructor stub
		this.tiponodo = tiponodo;
	}

	public TIPO getTipo() {
		return tiponodo;
	}
	
	
	public void printTree() throws IOException {
		Date fecha = new Date();
		
		file = new File("arbol/arbol.txt");
		filew = new FileWriter(file,true);
		buf = new BufferedWriter(filew);
		buf.append("["+ fecha +"] Nodo " + tiponodo + " (" + this.getChildCount()	+ ")");
		buf.newLine();
		buf.close();
		
		for (int i = 0; i < this.getChildCount(); i++) {
			((Nodo) this.getChildAt(i)).printTree();
		}
		
	}

}
