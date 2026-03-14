package javatestevscode.SISTEMADEUNIVERSIDADE;

public class Main {

    public static void main(String[] args) {

        // Criando professores
        Professor p1 = new Professor("Carlos", "Programação");
        Professor p2 = new Professor("Ana", "Banco de Dados");

        // Criando cursos
        Curso c1 = new Curso("Programação Orientada a Objetos", p1);
        Curso c2 = new Curso("Banco de Dados", p2);

        // Criando alunos
        Aluno a1 = new Aluno("Willian", 1001);
        Aluno a2 = new Aluno("João", 1002);

        // Matriculando alunos nos cursos
        a1.matricularCurso(c1);
        a1.matricularCurso(c2);

        a2.matricularCurso(c1);

        // Criando sistema
        Sistema sistema = new Sistema();

        // Adicionando alunos no sistema
        sistema.adicionarAluno(a1);
        sistema.adicionarAluno(a2);

        // Mostrando alunos cadastrados
        System.out.println("===== ALUNOS CADASTRADOS =====");
        sistema.mostrarAlunos();

        System.out.println("\n===== DETALHES DO ALUNO =====");
        a1.mostrarAluno();

    }
}