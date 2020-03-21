package Aula03_Ex1_2;

public class PizzaioloCalzonePresunto implements Pizzaiolo {

	@Override
	public Preparar getInstance() {
		// TODO Auto-generated method stub
		return new CalzonePresunto();
	}

}
