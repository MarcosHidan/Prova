package br.newtonpaiva.com;

class Professor extends Pessoa {
    private double salarioHora;
    private int horasAula;

    public Professor(String nome, String email, double salarioHora, int horasAula) {
        super(nome, email);
        this.salarioHora = salarioHora;
        this.horasAula = horasAula;
    }

    // Getters e Setters
    public double getSalarioHora() {
        return salarioHora;
    }

    public void setSalarioHora(double salarioHora) {
        this.salarioHora = salarioHora;
    }

    public int getHorasAula() {
        return horasAula;
    }

    public void setHorasAula(int horasAula) {
        this.horasAula = horasAula;
    }

    public double calculaSalario() {
        return salarioHora * horasAula;
    }

    public String mostraProfessor() {
        return "Nome: " + getNome() +
                "\nEmail: " + getEmail() +
                "\nSalário: R$" + calculaSalario();
    }
}