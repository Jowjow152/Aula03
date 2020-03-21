package Aula03_Ex1_1;

public class FabricaMensageiroArquivo implements FabricaMensageiro {

	@Override
	public Mensageiro getInstance() {
		
		return new MensageiroArquivo();
	}

}
