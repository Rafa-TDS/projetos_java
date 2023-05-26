public class Conta {
    private double saldo;
    private int agencia;
    private int numero;
    private Cliente titular = new Cliente();// titular é uma referência ao objeto do tipo cliente. Nesse caso o tipo da variável precisa ser o nome da classe
    //que referencia o titular, que no caso é Cliente.
    private static int total; //esse total é da classe, não de cada objeto

    public Conta(int agencia, int numero){
        Conta.total++;
        System.out.println("o total de contas é: " + total);

        this.agencia = agencia;
        this.numero = numero;
        System.out.println("estou criando uma conta" + this.numero);
    }
    public void deposita(double valor) {
        this.saldo += valor; //this.saldo + valor;
        //(double valor){... Valor 50 que é o que está na classe TestaMetodo. Esse saldo é da conta a qual está sendo invocado esse método
    }   //public void deposita(double valor)...Criação do método. Em java é obrigatório retornar alguma informação ao depositar (nesse caso).
    //Quando não se retorna nada, basta inserir void, conforme exemplo.
    //This é uma referência ao objeto da classe TestaMetodo, contaDoPaulo

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

    public double getSaldo() {
        return this.saldo;
    }

    public int getNumero() {
        return this.numero; //devolve o número da conta
    }

    public void setNumero(int numero) {
        if(numero <= 0){
            System.out.println("não pode valor <= 0");
            return;
        }
        this.numero = numero;
    }

    public int getAgencia() {
        return this.agencia;
    }

    public void setAgencia(int agencia) {
        if(agencia <= 0){
            System.out.println("não pode valor menor ou igual a 0");
            return; //como é void, somente o return basta

        }
        this.agencia = agencia;
    }
    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public Cliente getTitular() {
        return titular;
    }

    public static int getTotal(){
        return Conta.total;
    }
}




