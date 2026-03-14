package javatestevscode.SISTEMADEUNIVERSIDADE;

public class Professor {
    private String nome;
    private String formacao;

    public Professor(String nome, String formacao) {
        this.nome = nome;
        this.formacao = formacao;
    }
    //mostrar professor
    public void mostrarProfessor(){
        System.out.println("Professor: " + nome);
        System.out.println("Formação: " + formacao);
    }
}
