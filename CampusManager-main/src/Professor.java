public class Professor extends Pessoa {
    private String centro;

    public Professor(String nome, String cpf, int idade, String centro) {
        super(nome, cpf, idade);
        this.centro = centro;
    }

    public String getCentro() {
        return centro;
    }

    public void setCentro(String centro) {
        this.centro = centro;
    }

    public void darAula() {
        System.out.println("O(A) professor(a) " + this.getNome() + " está dando aula no Centro de " + this.getCentro());
    }

}