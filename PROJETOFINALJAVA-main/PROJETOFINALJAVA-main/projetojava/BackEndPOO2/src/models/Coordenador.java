package models;

public class Coordenador extends Pessoa {

    private int experiencia;

    public Coordenador(String nome, String telefone, String cpf, int experiencia) {
        super(nome, telefone, cpf);
        this.experiencia = experiencia;
    }

    public int getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }

}
