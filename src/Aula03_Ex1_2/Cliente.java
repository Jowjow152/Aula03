package Aula03_Ex1_2;

public class Cliente {

	public static void main(String[] args) {
		
		String data = "23/03/2020";
		String pedido = "Pizza";
		
		Pizzaiolo p = Pizzaria.getPizzaiolo(data, pedido);
		
		if(p != null)
			System.out.println(p.getInstance().preparar());

	}

}
