package fundamentos.desafios;

import javax.swing.JOptionPane;

public class DesafioCalculadora {
	
	public static void main(String[] args) {
		
		//ler num1
		//ler num2
		// + - * / % qual operação?		
		
		String valor1 = JOptionPane.showInputDialog("Diga o primeiro número:");
		String valor2 = JOptionPane.showInputDialog("Diga o segundo número:");
		String operacao = JOptionPane.showInputDialog("Qual é a operação que deseja fazer?");	
		
		double numero1 = Double.parseDouble(valor1);
		double numero2 = Double.parseDouble(valor2);
		
		//lógica
		double resultado = "+".equals(operacao) ? numero1 + numero2 : 0;
		resultado = "-".equals(operacao) ? numero1 - numero2 : resultado;
		resultado = "/".equals(operacao) ? numero1 / numero2 : resultado;
		resultado = "*".equals(operacao) ? numero1 * numero2 : resultado;		
		resultado = "%".equals(operacao) ? numero1 % numero2 : resultado;		
				
		System.out.printf("%.2f %s %.2f = %.2f", numero1, operacao, numero2, resultado);
		
	}

}
