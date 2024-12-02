package models;

import interfaces.IProfessor;

public class Professor extends Pessoa implements IProfessor {

    private String especialidade;

    public Professor(String nome, String telefone, String cpf, String especialidade) {
        super(nome, telefone, cpf);
        this.especialidade = especialidade;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    @Override
    public void ministrarAula() {
        System.out.println("Estou ministrando uma aula sobre " + especialidade + "!");
    }

    @Override
    public void corrigirProvas() {
        System.out.println("Estou corrigindo provas!");
    }
}
