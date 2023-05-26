public class ControleBonificacao {

    private double soma;

    public void registra(Funcionario f){
        double boni = f.getBonificacao();// A classe gerente também possui um método getBonificação, assim como na classe funcionário. Porém o valor da comissão é diferente. Nesses casos, a classe gerente irá pegar o getBonificação especificado na sua classe.
        this.soma = this.soma + boni;
    } // Esse é um claro exemplo de polimorfismo, pois tendo um método genérico (Funcionário), cada tipo de funcionário, editor de vídeo, gerente, etc, irá pegar a comissão conforme está definido na sua classe. Assim não precisa criar um método para cada um confome abaixo

//    public void registra(Gerente g){
//        double boni = g.getBonificacao();
//        this.soma = this.soma + boni;
//    }
//
//    public void registra(EditorVideo ev){
//        double boni = ev.getBonificacao();
//        this.soma = this.soma + boni;
//    }

    public double getSoma(){
        return soma;
    }
}

//    Nessa classe, crie o método registra, que recebe um Funcionario por
//    parâmetro, pega a sua bonificação, e em seguida a soma com as outras
//    bonificações. E, crie também o método getSoma para retornar o valor do atributo soma: