package Aula03_Ex2_3;

public class FabricaDeContador {
	
	static Contador getContador(String tipo) {
		
		if(tipo.equals("Arquivo")) {
			return new ContadorArquivo();
		}
		
		if(tipo.equals("Console")) {
			return new ContadorConsole();
		}
		
		return null;
	}
}
