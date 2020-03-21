package Aula03_Ex1_1;

public class ProdutorFabricaMensageiro {
	
	private ProdutorFabricaMensageiro() {
		
	}
	
	public static FabricaMensageiro getFabrica() {
		int numero = (int)(10000*Math.random());
		numero = numero % 2;
		if(numero == 0)
			return getFabrica("Tela");
		else
			return getFabrica("Arquivo");
	}
	
	public static FabricaMensageiro getFabrica(String tipo) {
		if(tipo.equals("Tela"))
			return new FabricaMensageiroTela();
		else if(tipo.equals("Arquivo"))
			return new FabricaMensageiroArquivo();
		else 
			return null;
	}
}
