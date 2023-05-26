//Gerente herda da Classe Funcionário, é um funcionário, assina o contrato Autenticavel, é um autenticável
public class Gerente extends Funcionario implements Autenticavel {

    private AutenticacaoUtil autenticador;

    public Gerente(){
        this.autenticador = new AutenticacaoUtil();
    }

    public double getBonificacao() {
        System.out.println("Chamando o método de bonificação do GERENTE");
        return super.getSalario();
        // return super.getBonificacao() + super.getSalario(); //Super quer dizer
        // que o atributo não está nessa classe

    }


    @Override
    public void setSenha(int senha) {
        this.autenticador.setSenha(senha);
    }

    @Override
    public boolean autentica(int senha) {
        boolean autenticou = this.autenticador.autentica(senha);
        return autenticou;

    }
}


