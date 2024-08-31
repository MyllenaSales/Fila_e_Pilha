package usandoQueue;
import bufferPilha.Processo;

public class Principal {
	public static void main(String[] args) {
		Processo p1 = new Processo(1,"Moranguinho");
		Processo p2 = new Processo(2,"Laranjinha");
		Processo p3 = new Processo(3,"Biscoitinho");
		Processo p4 = new Processo(4,"Pudim");
		Processo p5 = new Processo(5,"Mirtilo");
		
		Fila f = new Fila();
		f.adicionar(p1);
		f.adicionar(p2);
		f.adicionar(p3);
		f.adicionar(p4);
		f.adicionar(p5);
		
		f.verificar();
		f.mostrar();
		
		f.remover();
		System.out.println("\nApós remover: ");
		f.mostrar();
		
		f.inverterOrdem();
		System.out.println("\nApós inverter:");
		f.mostrar();
	}
	
}
