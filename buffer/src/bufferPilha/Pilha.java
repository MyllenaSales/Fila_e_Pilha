package bufferPilha;

import java.util.Stack;

public class Pilha {

	Stack<Processo> pilha = new Stack<Processo>();
	
	public void adicionar(Processo elemento) {
		pilha.push(elemento);
	}
	
	public Object pegarElemento() {
		return pilha.pop();
	}
	public boolean verificar() {
		 return pilha.isEmpty();
	}
	
	public void mostrar() {
		if(pilha.size()!=0) {
			System.out.println(pilha);
		}else {
			System.out.println("Pilha vazia!");
		}
	}
	
	public void desempilhar() {
		int t = pilha.size();
		for(int i=0;i<t;i++) {
			pegarElemento();
		}
		verificar();
		
	}
	
}
