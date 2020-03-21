package Aula03_Ex1_2;

public class PizzaioloCalzoneCalabresa implements Pizzaiolo {

	@Override
	public Preparar getInstance() {
		// TODO Auto-generated method stub
		return new CalzoneCalabresa();
	}

}
