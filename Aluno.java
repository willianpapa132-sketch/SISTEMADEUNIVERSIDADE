package javatestevscode.SISTEMADEUNIVERSIDADE;

public class Aluno {
    private String nome;
    private int matricula;
    Curso[] curso;
    private int quantidadeCursos;

    public Aluno(String nome, int matricula) {
        this.nome = nome;
        this.matricula = matricula;
        this.curso = new Curso[10];
        this.quantidadeCursos = 0;
    }

    //metodos 

    public void matricularCurso(Curso curso){
        if(quantidadeCursos < this.curso.length){
            this.curso[quantidadeCursos] = curso;
            quantidadeCursos++;
        } else {
            System.out.println("Limite de cursos atingido.");
        }
    }
    public void mostrarCursosMatriculados(){
        System.out.println("Cursos matriculados:");
        for(int i = 0; i < quantidadeCursos; i++){
            curso[i].mostrarCurso();
            System.out.println("-------------------");
        }
    }
    public void mostrarAluno(){
        System.out.println("Nome: " + nome);
        System.out.println("Matrícula: " + matricula);
        mostrarCursosMatriculados();
    }
    public String getNome() {
        return nome;
    }

}
