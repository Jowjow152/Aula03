package Aula03_Ex1_1;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class MensageiroArquivo implements Mensageiro {

	@Override
	public void escrever() {
		try {
			PrintWriter writer = new PrintWriter("mensagem.txt");
			writer.write("Hello, world!");
			writer.close();
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		}

	}

}
