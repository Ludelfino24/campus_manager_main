public class AlunoBolsista extends Aluno {
    public AlunoBolsista(String nome, String cpf, int idade, String matricula) {
        super(nome, cpf, idade, matricula);
    }

    public void pagarMensalidade() {
        System.out.println("Mensalidade do(a) Bolsista " + this.getNome() + " paga. Benefício de isenção ou desconto parcial.");
    }

}
