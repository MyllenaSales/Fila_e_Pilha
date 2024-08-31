package bufferPilha;

public class Principal {
	
	public static void main(String[] args) {
	
		Processo p1 = new Processo(1,"Andorinha");
		Processo p2 = new Processo(1,"Bem-te-vi");
		Processo p3 = new Processo(1,"Beija-flor");
		Processo p4 = new Processo(1,"Arara-azul");
		Processo p5 = new Processo(1,"Garça");
		
		Pilha p = new Pilha();
		
		p.adicionar(p1);
		p.adicionar(p2);
		p.adicionar(p3);
		p.adicionar(p4);
		p.adicionar(p5);
		
		p.verificar();
		p.mostrar();
		
		p.pegarElemento();
		
		System.out.println("Após remover o último elemento:");
		p.mostrar();
		
		p.desempilhar();
		
		p.mostrar();
}
}
