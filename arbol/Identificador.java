package arbol;

public class Identificador extends Nodo{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	String namevar;
	int tam;
	int pos;
	Object valor;
	
	public Identificador(String namevar,int tam,int pos,Object valor) {
		super(TIPO.ID);
		this.namevar = namevar;
		this.tam = tam;
		this.pos = pos;
		this.valor = valor;
		// TODO Auto-generated constructor stub
	}
	
	public void setNamevar(String namevar){ this.namevar = namevar; }
	public void setTam(int tam){ this.tam = tam; }
	public void setPos(int pos){ this.pos = pos; }
	public void setValor(Object valor){ this.valor = valor; }

	public String getNamevar(){	return namevar; }
	public int getTam(){ return tam; }
	public int getPos(){ return pos; }
	public Object getValor(){ return valor; }
	
}
