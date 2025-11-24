public class Main {
    public static void main(String[] args) {

        // Instancia de 3 objetos disciplina
        Disciplina poo = new Disciplina("Progamação Orientada a Objetos", "123", "2025.2");
        Disciplina rla = new Disciplina("Raciocinio lógico algoritmo", "321", "2025.2");
        Disciplina fundamentos = new Disciplina("Fundamentos", "432", "2025.2");

        // Instancia de 3 objetos alunos2 (2regulares e 1 bolsista);
        Aluno aluno1 = new Aluno("Beatriz Abreu", "000-000-000-00", 23, "123");
        Aluno aluno2 = new Aluno("Vagner Moura", "123-321-456-65", 40, "4235324");
        Aluno aluno3 = new Aluno("Michael Jackson", "345-234-543-34", 35, "3453534");

        // Instancia de 1 objeto Professor
        Professor professor1 = new Professor("Adriano Nunes", "123-432-234-54", 40, "Tecnologico");

        // Instancia de 2 objeto Visitantes
        Visitante visitante1 = new Visitante("Frascisco Emanuel", "845-345-234-65", 19);
        Visitante visitante2 = new Visitante("Antonio Edgar ", "232-321-432-54", 33);
        // Instancia de 3 objetos turma, contendo todos os alunos, o professor e 1
        // disciplina em cada
        // turma criada;


        System.out.println("Teste q. 1 e 2(classe pessoa)");


        System.out.println("Nome: " + aluno2.getNome());
        System.out.println("Idade inicial: " + aluno2.getIdade());

        aluno1.fazerAniversario();

        System.out.println("Nova idade:" + aluno2.getIdade());

        System.out.println("---------------");

        // Disciplina poo = new Disciplina("Matemática", "685", "2025.2");

        System.out.println("Disciplina: " + poo.getNome());
        System.out.println("Código: " + poo.getCodigo());
        System.out.println("Semestre: " + poo.getSemestre());

        System.out.println("---------------");

        Aluno novoAluno = new Aluno("Paula", "111.111.111-11", 30, "xxxx-x");
        novoAluno.pagarMensalidade();

        System.out.println("---------------");

        AlunoRegular novoAlunoRegular = new AlunoRegular("Maria", "222.222.222-22", 25, "000000-0");
        novoAlunoRegular.pagarMensalidade();

        System.out.println("---------------");

        AlunoBolsista novoBolsista = new AlunoBolsista("João", "333.333.333-33", 22, "zzzz-z");
        novoBolsista.pagarMensalidade();

        System.out.println("---------------");

        Professor novoProfessor = new Professor("Matheus", "555.555.555-55", 35, "Matemática");
        novoProfessor.darAula();

        System.out.println("---------------");

    }

}
