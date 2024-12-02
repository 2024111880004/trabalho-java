import java.util.ArrayList;

import models.Professor;
import models.Aluno;
import models.EnumCurso;
import models.Coordenador;
import models.SalaDeAula;
import models.Secretaria;

public class App {
    public static void main(String[] args) {
        System.out.println("Universidade Java" + "\n");

        Secretaria secretaria1 = new Secretaria("Glória", "12345678", "987654321-09");

        secretaria1.atenderTelefone();
        secretaria1.organizarDocumentos();

        Professor professor1 = new Professor("Ana", "839098765", "456787654-87");

        professor1.ensinarMateria();
        professor1.prepararAula();

        Coordenador coordenador1 = new Coordenador("joão", "8399555338", "12792264470");
        coordenador1.gestaoAcademica();

        SalaDeAula sala1 = new SalaDeAula("390A", 30, EnumCurso.MATEMATICA);
        SalaDeAula sala2 = new SalaDeAula("400B", 50, EnumCurso.COMPUTACAO);

        System.out.println(sala2);

        Aluno aluno1 = new Aluno("Lucas", "839123123123", "123456789-01", 42);
        Aluno aluno2 = new Aluno("Rebeca", "839123123123", "123456789-02", 17);
        Aluno aluno3 = new Aluno("Kauanny", "839123123123", "123456789-03", 21);
        Aluno aluno4 = new Aluno("Afonso", "839123123123", "123456789-04", 36);

        ArrayList<Aluno> alunos = new ArrayList<Aluno>();

        alunos.add(aluno1);
        alunos.add(aluno2);
        alunos.add(aluno3);
        alunos.add(aluno4);

        System.out.println(alunos.size());
    }
}