package Aula03_Ex2_3;

public class ContadorConsole implements Contador {

	@Override
	public void contar() {
		
		for(int i = 0; i <= 10; i++) {
			System.out.println(i);
		}

	}

}
