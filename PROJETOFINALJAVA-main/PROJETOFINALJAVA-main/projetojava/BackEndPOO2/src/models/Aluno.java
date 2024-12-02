package models;

import interfaces.IEstudante;
import interfaces.IProfessor;

public class Estudante extends Pessoa implements IEstudante, IProfessor {

    public Estudante(String nome, String telefone, String cpf) {
        super(nome, telefone, cpf);
    }

    @Override
    public void saberEstudar() {
        System.out.println("Sei estudar de forma eficiente!");
    }

    @Override
    public void saberFazerProvas() {
        System.out.println("Sei fazer provas com confiança!");
    }

    @Override
    public void ensinarMateria() {
        System.out.println("Posso ensinar matérias aos outros!");
    }

    @Override
    public void prepararAula() {
        System.out.println("Posso preparar uma aula de forma organizada!");
    }
}