package buffer;

public class Principal {
 
	public static void main(String[] args) {
		Processo p1 = new Processo(1,"Maria");
		Processo p2 = new Processo(2,"Isaac");
		Processo p3 = new Processo(3,"Moisés");
		Processo p4 = new Processo(4,"Elias");
		Processo p5 = new Processo(5,"José");
		
		Fila f = new Fila();
		f.adicionar(p1);	
		f.adicionar(p2);
		f.adicionar(p3);
		f.adicionar(p4);
		f.adicionar(p5);
		
		f.verificar();
		
		f.mostrar();
		
		f.remover();
		System.out.println("\nApós a remoção: ");
		f.mostrar();
		f.inverterOrdem2();
		
		System.out.println("\nApós inverter a ordem:");
		f.mostrar();
		
	}
	
}
