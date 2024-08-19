package listaDeExercicios;

//import java.util.Scanner;

import javax.swing.JOptionPane;

public class Exercicios03 {

	public static void main(String[] args) {
		
		/* Scanner teclado = new Scanner (System.in);
		System.out.println("Digite seu nome:");
		String nome = teclado.next();
		System.out.println("Seja bem vindo " + nome ); */
		
		var nome = JOptionPane.showInputDialog("Digite seu nome");
		JOptionPane.showMessageDialog(null, "Seja bem vindo " + nome);
		
		
	}

}
