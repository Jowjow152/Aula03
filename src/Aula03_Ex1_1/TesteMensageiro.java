package Aula03_Ex1_1;

public class TesteMensageiro {

	public static void main(String[] args) {
		
		FabricaMensageiro fabrica = ProdutorFabricaMensageiro.getFabrica();
		fabrica.getInstance().escrever();
	}

}
