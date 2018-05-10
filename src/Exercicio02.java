import javax.swing.JOptionPane;

public class Exercicio02 {

	public static void main(String[] args) {
		int[] idade = new int[7];
		String vazio = "";
		for(int i = 0; i<7; i++){
			idade[i]= Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a idade:"));
			vazio += idade[i] + "\n";
		}
		JOptionPane.showMessageDialog(null,"Idades informadas:\n" + vazio);
	}
	

}
