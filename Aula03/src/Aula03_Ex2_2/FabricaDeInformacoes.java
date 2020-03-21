package Aula03_Ex2_2;

public class FabricaDeInformacoes {

	public static Informacao getInformacao(String senha) {
		
		if(senha.equals("DesignPatterns")) {
			return new InformacaoConfidencial();
		}
		
		return new InformacaoPublica();
	}
}
