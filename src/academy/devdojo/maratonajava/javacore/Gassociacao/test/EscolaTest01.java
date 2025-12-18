package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Escola;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Professor;

public class EscolaTest01 {
    public static void main(String[] args) {
        Professor professor = new Professor("Leandro");
        Professor professor1 = new Professor("Júnior");
        Professor professor2 = new Professor("Genison");

        Professor professores[] = {professor1, professor2, professor};

        Escola escola1 = new Escola("Pingo de gente");
        escola1.setProfessores(professores);

        escola1.imprime();

    }
}
