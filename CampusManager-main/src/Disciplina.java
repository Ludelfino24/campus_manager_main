public class Disciplina {
    private String nome;
    private String codigo;
    private String semestre;

    public Disciplina(String nome, String codigo, String semestre) {
        this.nome = nome;
        this.codigo = codigo;
        this.semestre = semestre;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getSemestre() {
        return semestre;
    }

    public void setSemestre(String semestre) {
        this.semestre = semestre;
    }
}
