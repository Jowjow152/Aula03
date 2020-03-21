package Aula03_Ex1_2;

public class PizzaPresunto implements Preparar {

	@Override
	public String preparar() {
		String ingredientes = "Pizza com Queijo, Presunto e Tomate";
		return ingredientes;
	}

}
