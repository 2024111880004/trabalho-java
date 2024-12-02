package models;

public class Secretaria extends Pessoa {

    private String turno;
    private String departamento;

    public Secretaria(String nome, String telefone, String cpf, String turno, String departamento) {
        super(nome, telefone, cpf);
        this.turno = turno;
        this.departamento = departamento;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public void atenderTelefone() {
        System.out.println("Atendendo telefone no departamento " + departamento + ".");
    }

    public void organizarDocumentos() {
        System.out.println("Organizando documentos durante o turno " + turno + ".");
    }

    @Override
    public String toString() {
        return String.format("Secretária:\n" +
                             "  Nome: %s\n" +
                             "  Telefone: %s\n" +
                             "  CPF: %s\n" +
                             "  Turno: %s\n" +
                             "  Departamento: %s",
                             nome, telefone, cpf, turno, departamento);
    }
}