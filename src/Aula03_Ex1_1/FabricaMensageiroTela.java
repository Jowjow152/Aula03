package Aula03_Ex1_1;

public class FabricaMensageiroTela implements FabricaMensageiro {

	@Override
	public Mensageiro getInstance() {
		
		return new MensageiroJava();
	}

}
