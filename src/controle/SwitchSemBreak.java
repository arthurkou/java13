package controle;

public class SwitchSemBreak {

	public static void main(String[] args) {

		// if(bool)

		String faixa = "verde";

		switch (faixa.toLowerCase()) {
		case "preta":
			System.out.println("Sei o Bassai-Dai..");
		case "roxa":
			System.out.println("Sei o Tekki Shodan..");
		case "verde":
			System.out.println("Sei o Heian Godani...");
		case "laranja":
			System.out.println("Sei o Heian Sandan...");
		case "vermelha":
			System.out.println("Sei o Heian Nidan...");
		case "amarela":
			System.out.println("Sei o Heian SOan...");
			break;
		default:
			System.out.println("Não sei nada");

		}

		System.out.println("Fim!");

		int idade = 3;
		
		switch (idade) {
		case 3:
			System.out.println("Sabe falar");
		case 2:
			System.out.println("Sabe andar");
		case 1:
			System.out.println("Sabe respirar");
		}
	}

}
