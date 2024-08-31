package usandoQueue;
import java.util.Queue;
import java.util.LinkedList;
import bufferPilha.Pilha;
import bufferPilha.Processo;

public class Fila {
	
	Queue <Processo> fila = new LinkedList<Processo> ();
	
	
	public void adicionar (Processo elemento) {
		fila.add(elemento);
	}
	
	
	public boolean verificar() {
		return fila.isEmpty();
	}
	
	public void remover () {
		fila.poll();
	}
	public void mostrar() {
		System.out.println(fila);
	}
	
	public void inverterOrdem() {
		Pilha p = new Pilha();
		int t = fila.size();
		for(int i =0; i<t;i++) {
			
			Processo f = fila.peek();
			p.adicionar(f);
			remover();
		}
		for(int i =0;i<t;i++) {
			Processo pr = (Processo) p.pegarElemento();
			fila.add(pr);
			
		}
	}

}
