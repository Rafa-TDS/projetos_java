public class Conta {
    double saldo;

    //Double saldo1;

    int agencia;

    //Integer agencia1;

    int numero;

    String titular;


    public void deposita(double valor) {
        this.saldo += valor; //this.saldo + valor;
        //(double valor){... Valor 50 que é o que está na classe TestaMetodo. Esse saldo é da conta a qual está sendo invocado esse método
    }   //public void deposita(double valor)...Criação do método. Em java é obrigatório retornar alguma informação ao depositar (nesse caso).
    //Quando não se retorna nada, basta inserir void, conforme exemplo.
    //This é uma referência ao objeto da classe TestaMetodo, contaDoPaulo.

    public boolean saca(double valor) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
            return true;
        } else {
            return false;
        }
        //Pra sacar, precisa de quais informações? Valor. Método saca não está dentro do método deposita.
        //Não existe método dentro de método.
    }

    public boolean transfere(double valor, Conta destino) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
            destino.deposita(valor);
            return true;
        }
        return false;
    }
}



