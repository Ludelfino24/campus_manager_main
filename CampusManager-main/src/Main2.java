public class Main2 {
    public static void main(String[] args) {

        Disciplina d1 = new Disciplina("POO", "1", "2º semestre");
        Disciplina d2 = new Disciplina("Raciocínio Lógico", "2", "1º semestre");
        Disciplina d3 = new Disciplina("Java", "3", "3º semestre");

        AlunoRegular r1 = new AlunoRegular("João", "963.300.930-83", 20, "25");
        AlunoRegular r2 = new AlunoRegular("Maria", "125.429.660-36", 22, "26");

        AlunoBolsista b1 = new AlunoBolsista("Pedro", "377.347.030-46", 25, "27");

        Professor p1 = new Professor("Carlos", "155.588.350-87", 38, "Campus A");

        Visitante v1 = new Visitante("Leo", "848.208.930-76", 31);
        Visitante v2 = new Visitante("Yara", "343.494.490-78", 27);

        Turma t1 = new Turma("1", d1, p1);
        t1.adicionarAluno(r1);
        t1.adicionarAluno(r2);
        t1.adicionarAluno(b1);

        Turma t2 = new Turma("2", d2, p1);
        t2.adicionarAluno(r1);
        t2.adicionarAluno(r2);
        t2.adicionarAluno(b1);

        Turma t3 = new Turma("3", d3, p1);
        t3.adicionarAluno(r1);
        t3.adicionarAluno(r2);
        t3.adicionarAluno(b1);

        t1.listarAlunos();
        t2.listarAlunos();
        t3.listarAlunos();

    }

}
