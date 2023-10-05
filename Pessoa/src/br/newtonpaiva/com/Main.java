package br.newtonpaiva.com;

public class Main {
    public static void main(String[] args) {
        Professor professor = new Professor("João", "joao@example.com", 50.0, 20);

        System.out.println("Dados do Professor:");
        System.out.println(professor.mostraProfessor());

        Aluno aluno = new Aluno("Maria", "maria@example.com", 2, "A");

        System.out.println("\nDados do Aluno:");
        System.out.println(aluno.mostraAluno());
    }
}