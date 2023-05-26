public class TestaBanco {

    public static void main(String[] args) {
        Cliente paulo = new Cliente();//paulo é a variável. esse new é um novo cliente
        paulo.nome = "Paulo Silveira";
        paulo.cpf = "222.222.222-22";
        paulo.profissao = "programador";

        Conta contaDoPaulo = new Conta(); //contaDoPaulo é a variável. esse new é uma nova conta
        //Cria o objeto na memória, devolveu o número dela e guarda dentro da referência.
        contaDoPaulo.deposita(100);

        contaDoPaulo.titular = paulo; //Composição dos objetos. Associa o cliente Paulo
        // a conta contaDoPaulo
        System.out.println(contaDoPaulo.titular.nome);

    }

}
