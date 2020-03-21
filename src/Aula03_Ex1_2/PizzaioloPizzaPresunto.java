package Aula03_Ex1_2;

public class PizzaioloPizzaPresunto implements Pizzaiolo {

	@Override
	public Preparar getInstance() {
		
		return new PizzaPresunto();
	}

}
