public class Aluno extends Pessoa {
    private String matricula;

    public Aluno(String nome, String cpf, int idade, String matricula) {
        super(nome, cpf, idade);
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void pagarMensalidade() {
        System.out.println("Mensalidade do(a) aluno(a) " + this.getNome() + " paga.");
    }
}


