package listaDeExercicios;

import javax.swing.JOptionPane;

public class Exercicios02 {

	public static void main(String[] args) {
		//String fruta = "Banana";
		var valor = 3.50; 
		// COM a atualização do java 10 n precia especificar o tipo, podemos usar o "var" que e um tipo generico e ele 
		//automaticamente determina qual o tipo de variavel vc esta apresentando
		String fruta = JOptionPane.showInputDialog("digite a fruta");
		//System.out.println("o valor da fruta" +fruta +"é de "+ valor);
		JOptionPane.showMessageDialog(null, "o valor da " + fruta +" é de " + valor );
	

	}

}
