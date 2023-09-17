import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String modeloCarro;
        double valorDiaria;
        int qntDias;
        double kmPercorridos;
        double totalPagar;

        Scanner leitor = new Scanner(System.in);

        System.out.println("Informe o modelo do carro: ");
        modeloCarro = leitor.next();

        System.out.println("Informe o valor da diária: ");
        valorDiaria = leitor.nextDouble();

        System.out.println("Informe a quantidade de dias para locação: ");
        qntDias = leitor.nextInt();

        System.out.println("Informe a quantidade de Km percorridos: ");
        kmPercorridos = leitor.nextDouble();

        totalPagar = qntDias * valorDiaria + kmPercorridos * 0.20;
        System.out.println("Modelo do carro: " + modeloCarro + ". Valor total a pagar: " + totalPagar);


    }
}