public class TestaMetodo {

    public static void main(String[] args) {
        Conta contaDoPaulo = new Conta();
        //É comum dar o nome da variável igual ao nome da classe, só que com letra minúscula.
        //O da esquerda precisa ser o nome da classe
        contaDoPaulo.saldo = 100;
        contaDoPaulo.deposita(50);
        //Quando for invocar um método, é obrigatório o uso de parênteses.
        //Essa invocação de método, executa o trecho de código que está na classe Conta ( public void deposita(double valor)
        System.out.println(contaDoPaulo.saldo);
       boolean conseguiuRetirar = contaDoPaulo.saca(20);
       //Variável conseguiuRetirar guarda true or false
        System.out.println(contaDoPaulo.saldo);
        System.out.println(conseguiuRetirar);

        Conta contaDaMarcela = new Conta();
        contaDaMarcela.deposita(1000);
        boolean sucessoTransferencia = contaDaMarcela.transfere(3000, contaDoPaulo);
        if(sucessoTransferencia){
            System.out.println("transferência com sucesso");
        } else {
            System.out.println("faltou dinheiro");
        }
        System.out.println(contaDaMarcela.saldo);
        System.out.println(contaDoPaulo.saldo);

        contaDoPaulo.titular = "paulo silveira";
        System.out.println(contaDoPaulo.titular);




    }
}
