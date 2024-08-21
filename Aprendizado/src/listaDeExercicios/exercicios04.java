package listaDeExercicios;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class exercicios04 {

	public static void main(String[] args) {
		/*
		Scanner teclado = new Scanner(System.in);
		System.out.println("digite o numero");
		double numero = teclado.nextDouble();
		double dobro = numero *2;
		System.out.println("O DOBRO DO NUMERO É: " + dobro);
		*/
		
		var numero = JOptionPane.showInputDialog("Digite o numero");
		var dobro = Double.parseDouble(numero)*2;
		JOptionPane.showMessageDialog(null, "o dobro do numero é:" + dobro);
		
		
		

	}

}
