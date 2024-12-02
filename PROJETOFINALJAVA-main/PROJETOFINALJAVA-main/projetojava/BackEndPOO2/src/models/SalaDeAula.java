package models;

public class SalaDeAula {
    private String numeroSala;
    private int capacidade;
    private boolean possuiProjetor;

    public SalaDeAula(String numeroSala, int capacidade, boolean possuiProjetor) {
        this.numeroSala = numeroSala;
        this.capacidade = capacidade;
        this.possuiProjetor = possuiProjetor;
    }

    @Override
    public String toString() {
        return String.format("Sala de Aula:\n" +
                             "  Número: %s\n" +
                             "  Capacidade: %d alunos\n" +
                             "  Possui projetor: %s",
                             numeroSala, capacidade, possuiProjetor ? "Sim" : "Não");
    }

    public String getNumeroSala() {
        return numeroSala;
    }

    public void setNumeroSala(String numeroSala) {
        this.numeroSala = numeroSala;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public boolean isPossuiProjetor() {
        return possuiProjetor;
    }

    public void setPossuiProjetor(boolean possuiProjetor) {
        this.possuiProjetor = possuiProjetor;
    }
}
