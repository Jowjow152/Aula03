package Aula03_Ex2_2;

public class InformacaoConfidencial implements Informacao {

	@Override
	public void escreverInformacao() {
		System.out.println("Estas informações são confidenciais, o que significa que provavelmente só você sabe a senha.");

	}

}
