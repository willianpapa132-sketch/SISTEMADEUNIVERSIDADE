package javatestevscode.SISTEMADEUNIVERSIDADE;

public class Curso {
    private String nomedocurso;
    private Professor professor;

    public Curso(String nomedocurso, Professor professor) {
        this.nomedocurso = nomedocurso;
        this.professor = professor;
    }
    //mostrar curso
    public void mostrarCurso(){
        System.out.println("Nome do curso: " + nomedocurso);
        professor.mostrarProfessor();
    }
}
