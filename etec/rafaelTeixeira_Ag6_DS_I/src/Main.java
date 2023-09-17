import javax.swing.*;
public class Main {
    public static void main(String[] args) {

        int numFinal;
        String m;

        numFinal = Integer.parseInt(JOptionPane.showInputDialog(("Informe o número final da placa do veículo")));

        switch (numFinal){
            case 1:
                m = "Pagamento até 30/04";
                break;

            case 2:
                m = "Pagamento até 31/05";
                break;

            case 3:
                m = "Pagamento até 30/06";
                break;

            case 4:
                m = "Pagamento até 31/07";
                break;

            case 5:
                m = "Pagamento até 31/08";
                break;

            case 6:
                m = "Pagamento até 30/09";
                break;

            case 7:
                m = "Pagamento até 31/10";
                break;

            case 8:
                m = "Pagamento até 30/11";
                break;

            case 0:
                m = "Pagamento até 31/12";
                break;

            case 9:
                m = "Pagamento até 31/12";
                break;

            default:
                m = "O valor digitado está incorreto";
                break;

        }
        JOptionPane.showMessageDialog(null, m);
    }
}