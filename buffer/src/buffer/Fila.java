package buffer;
import java.util.LinkedList;
//import bufferPilha.Pilha;
//import bufferPilha.Processo;
import java.util.Stack;
public class Fila {
	
	LinkedList <Processo> fila = new LinkedList<Processo> ();
	
	public void adicionar(Processo p) {
		fila.add(p);
	}
	
	public Object remover() {
		return fila.removeFirst();
	}
	
	public boolean verificar() {
		return fila.isEmpty();
	}
	public void mostrar() {
		System.out.println(fila);
	}
	/*
	public void inverterOrdem() {
		int tamanho = fila.size();
		Pilha p = new Pilha();
		for(int i =0; i<tamanho;i++) {
			
			Processo f = fila.getFirst();
			p.adicionar(f);
			remover();
		
		}
		for(int i =0;i<tamanho; i++) {
			Processo pr = (Processo)p.pegarElemento();
			fila.addLast(pr);
		}
	}
	*/
	public void inverterOrdem2() {
		
		Stack <Processo> pilha = new Stack<Processo>();
		
		int tamanho = fila.size();
		for(int i=0;i<tamanho;i++) {
			Processo p = fila.getFirst();
			pilha.push(p);
			remover();
		}
		for(int i=0;i<tamanho;i++) {
			Processo p2 = pilha.pop();
			adicionar(p2);;
		}	
	}

}
