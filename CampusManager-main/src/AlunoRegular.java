public class AlunoRegular extends Aluno {
    public AlunoRegular(String nome, String cpf, int idade, String matricula) {

        super(nome, cpf, idade, matricula);
    }

    public void pagarMensalidade() {
        System.out.println("Mensalidade do(a) Aluno (a) " + this.getNome() + " paga. Não há benefício de isenção ou desconto parcial.");
    }


}
