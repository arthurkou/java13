package classe;

public class Data {

	int dia;
	String mes;
	int ano;
	
	//padrão
	Data () {
//		dia = 1;
//		mes = "Abril";
//		ano = 1970;
		
		this(1, "Abril", 1970); 
		//this como método deve estar dentro do construtor
		//esse this chama um construtor a partir de outro construtor
		
//		int a;
//		a = 0; variável local deve ser inicializada
//		System.out.println(a);
	}
	
	Data (int dia, String mes, int ano) {
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
	
	//valores padrão
	//byte, short, int, long -> 0 (primitivo)
	//float, double -> 0.0
	//char -> '\u0000'
	//boolean -> false ou true
	//object -> null
	
	int a;
	int b;
	
	String obterDataFormatada() {
		String formato = "%d/%s/%d"; //variável local
		return String.format(formato, this.dia, this.mes, this.ano);
	}
	
	void imprimirDataFormatada() {
		System.out.println(this.obterDataFormatada());
	}
	
	String obterDataComHorario (String horario) {
		String dataFormatada = dia + "/" + mes + "/" + ano + "  " + horario;
		return dataFormatada;
	}	
	
	int somar (int desconto){
		int result = a + b + desconto;
		return result;
	}	
	
	static void teste() {
	}
}
