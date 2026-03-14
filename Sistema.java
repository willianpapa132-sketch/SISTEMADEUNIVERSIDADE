package javatestevscode.SISTEMADEUNIVERSIDADE;

public class Sistema {
    private Aluno[] alunos;
    private int quantidadeAlunos;
    public Sistema() {
        this.alunos = new Aluno[100];
        this.quantidadeAlunos = 0;
    }

    public void adicionarAluno(Aluno aluno){
        if(quantidadeAlunos < alunos.length){
            alunos[quantidadeAlunos] = aluno;
            quantidadeAlunos++;
        } else {
            System.out.println("Limite de alunos atingido.");
        }
    }
    public void mostrarAlunos(){
        for(int i = 0; i < quantidadeAlunos; i++){
            System.out.println("Nome: " + alunos[i].getNome());
            System.out.println("-------------------");
        }

    }

}
