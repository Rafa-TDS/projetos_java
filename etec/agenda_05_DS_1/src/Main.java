import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {

        int idade;

        idade = Integer.parseInt(JOptionPane.showInputDialog("Entre com a idade do usuário a ser atendido: "));

        if (idade < 60) {
            JOptionPane.showMessageDialog(null, "Fila Comum");
        } else if (idade >= 60 && idade <= 80) {
            JOptionPane.showMessageDialog(null, "Fila Prioritária");
        }else{
            JOptionPane.showMessageDialog(null, "Fila 80+");
            
        }
    }
}


