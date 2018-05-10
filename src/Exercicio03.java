import javax.swing.JOptionPane;

public class Exercicio03 {

	public static void main(String[] args) {
		String vazio = "";
		double total = 0;
		int quantidade = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe a quantidade de regitros"));
		double precos[] = new double[quantidade];
		for (int i = 0; i < precos.length; i++) {
			precos[i] = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o " + (i + 1) + "º" + " preco"));
		}
		for (int i = 0; i < quantidade; quantidade++) {
			quantidade += precos[i];
		}
		for (int i = 0; i < precos.length; i++) {
			total += precos[i];
		}
		
		JOptionPane.showMessageDialog(null, "Total de precos: \n" + total);
	}

}
