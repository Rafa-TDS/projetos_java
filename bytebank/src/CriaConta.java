public class CriaConta {

    public static void main(String[] args) {
        Conta primeiraConta = new Conta(); //criação de uma conta (objeto). Instanciando na memória
        primeiraConta.saldo = 200; //saldo da primeira conta
        System.out.println(primeiraConta.saldo);

        primeiraConta.saldo += 100; //primeiraconta + primeiraconta + 100
        System.out.println(primeiraConta.saldo);

        Conta segundaConta = new Conta(); //criação de outra conta
        segundaConta.saldo = 300;

        System.out.println("primeira conta tem " + primeiraConta.saldo);
        System.out.println("segunda conta tem " + segundaConta.saldo);

        primeiraConta.agencia = 146;
        System.out.println(primeiraConta.agencia);
        System.out.println(primeiraConta.numero);

        segundaConta.agencia = 146;
        System.out.println("agora a segunda conta está"
                + " na agencia " + segundaConta.agencia);

        if(primeiraConta == segundaConta) {
            System.out.println("mesma conta");
        } else {
            System.out.println("contas diferentes");
        }

        System.out.println(primeiraConta); //

    }
}
