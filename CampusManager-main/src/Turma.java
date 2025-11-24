import java.util.ArrayList;

public class Turma {
    private String codigo;
    private Disciplina disciplina;
    private Professor professor;
    private ArrayList<Aluno> alunos = new ArrayList<>();

    Turma(String codigo, Disciplina disciplina, Professor professor) {

        this.codigo = codigo;
        this.disciplina = disciplina;
        this.professor = professor;

    }

    public void adicionarAluno(Aluno aluno) {
        if (!alunos.contains(aluno)) {
            alunos.add(aluno);
        }
    }

    public void removerAluno(Aluno aluno) {
        if (alunos.contains(aluno)) {
            alunos.remove(aluno);
        }
    }

    public void listarAlunos() {
        System.out.println("----- INFORMAÇÕES DA TURMA -----");
        System.out.println("Código da turma: " + this.codigo);
        System.out.println("Professor da turma: " + professor.getNome());
        System.out.println("Disciplina da turma: " + disciplina.getNome());
        System.out.println("Alunos matriculados nesta turma: ");
        for (Aluno aluno : alunos) {
            System.out.println(aluno.getNome());
        }
        System.out.println("----- FIM DAS INFORMAÇÕES DA TURMA -----");
        System.out.println();
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public ArrayList<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(ArrayList<Aluno> alunos) {
        this.alunos = alunos;
    }
}
