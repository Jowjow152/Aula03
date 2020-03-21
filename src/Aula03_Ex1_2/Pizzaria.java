package Aula03_Ex1_2;

import java.util.Calendar;

public class Pizzaria {

	private Pizzaria() {

	}

	static Pizzaiolo getPizzaiolo(String data, String pedido) {
		
		int dia = Integer.parseInt(data.charAt(0) + "" + data.charAt(1));
		int mes = Integer.parseInt(data.charAt(3) + "" + data.charAt(4));
		int ano = Integer.parseInt(data.charAt(6) + "" + data.charAt(7) + data.charAt(8) + data.charAt(9));

		Calendar c = Calendar.getInstance();
		
		c.set(Calendar.DAY_OF_MONTH, dia);
		c.set(Calendar.MONTH, mes - 1);
		c.set(Calendar.YEAR, ano);
		
		int diaDaSemana = c.get(Calendar.DAY_OF_WEEK);

		if((diaDaSemana == Calendar.MONDAY || diaDaSemana == Calendar.WEDNESDAY || diaDaSemana == Calendar.FRIDAY) && pedido.equals("Pizza")) {

			return new PizzaioloPizzaCalabresa();
		}

		if((diaDaSemana == Calendar.TUESDAY || diaDaSemana == Calendar.THURSDAY || diaDaSemana == Calendar.SATURDAY) && pedido.equals("Pizza")) {

			return new PizzaioloPizzaPresunto();
		}
		
		if((diaDaSemana == Calendar.MONDAY || diaDaSemana == Calendar.WEDNESDAY || diaDaSemana == Calendar.FRIDAY) && pedido.equals("Calzone")) {

			return new PizzaioloCalzoneCalabresa();
		}

		if((diaDaSemana == Calendar.TUESDAY || diaDaSemana == Calendar.THURSDAY || diaDaSemana == Calendar.SATURDAY) && pedido.equals("Calzone")) {

			return new PizzaioloCalzonePresunto();
		}
		
		if(diaDaSemana == Calendar.SUNDAY)
			System.out.println("Pizzaria Fechada");
			
		return null;
	}
}
