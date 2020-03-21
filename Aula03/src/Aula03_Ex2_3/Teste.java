package Aula03_Ex2_3;

public class Teste {

	public static void main(String[] args) {
		
		Contador cont = FabricaDeContador.getContador("Arquivo");
		cont.contar();
	}
	
}
