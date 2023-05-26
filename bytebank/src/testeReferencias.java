public class testeReferencias {

    public static void main(String[] args) {

        Conta primeiraConta = new Conta(); //Objeto do tipo conta. PrimeiraConta não é uma conta,
        // é uma referência pra conta criada.
        primeiraConta.saldo = 300;

        System.out.println("saldo da primeira: " + primeiraConta.saldo);

        Conta segundaConta = primeiraConta; //SegundaConta não é uma conta, é uma referência pra conta criada.

        segundaConta.saldo += 100;
        System.out.println("saldo da segunda conta: " + segundaConta.saldo);

        System.out.println(primeiraConta.saldo); // vai imprimir 400 pois só temos uma conta. As duas refên-
        //cias são pro mesmo objeto

        if(primeiraConta == segundaConta){
            System.out.println("são a mesmissima conta");
        }

    }
}
