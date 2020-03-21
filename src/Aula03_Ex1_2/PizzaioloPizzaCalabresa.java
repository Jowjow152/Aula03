package Aula03_Ex1_2;

public class PizzaioloPizzaCalabresa implements Pizzaiolo {

	@Override
	public Preparar getInstance() {
		
		return new PizzaCalabresa();
	}

}
