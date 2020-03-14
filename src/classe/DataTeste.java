package classe;

public class DataTeste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Data d1 = new Data();		
		d1.imprimirDataFormatada();
		
		Data d2 = new Data(22, "Fevereiro", 2020);
//		d2.mes = "Março";
//		d2.ano = 2020;
		
		Data teste = new Data();
		teste.a = 3;
		teste.b = 5;
		
		int resultado = teste.somar(-2);
		
		System.out.printf("%d/%s/%d\n", d1.dia, d1.mes, d1.ano);
		System.out.printf("%d/%s/%d\n", d2.dia, d2.mes, d2.ano);	
		System.out.printf("%d", resultado);
		System.out.printf("\nData com horário: %s", d1.obterDataComHorario("18h34"));
		System.out.printf("\nData Formatada : %s", d1.obterDataFormatada());
	}

}
