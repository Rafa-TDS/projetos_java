public class TesteReferencias

{
    public static void main(String[] args) {

        Funcionario g1 = new Gerente(); // New Gerente() -> Criação do objeto. g1 -> Variável do tipo Gerente. Como o Gerente é um Funcionário, pode-se fazer desse jeito
        //Funcionario g1 = new Gerente(); //Variável agora é do tipo Funcionário. Só funciona assim porque quaisqueres gerentes são funcionários.
        g1.setNome("Marcos");//Chama o método setNome.
        //String nome = g1.getNome(); //Recupera o nome
        g1.setSalario(5000.0);

        EditorVideo ev = new EditorVideo();
        ev.setSalario(2500.0);

        Designer d = new Designer();
        d.setSalario(2000);

        ControleBonificacao controle = new ControleBonificacao();
        controle.registra(g1);
        controle.registra(ev);
        controle.registra(d);

        System.out.println(controle.getSoma());

        //g1.autentica(2222); //g1 é uma referência do tipo funcionário porém a classe funcionário não tem o método autentica, por isso nesse caso não funciona. Só pode chamar métodos definidos nessa classe.
        //System.out.println(nome);

    }
}
//TesteReferencias, onde você instancia funcionários diferentes, registra suas bonificações e visualiza a sua somaa