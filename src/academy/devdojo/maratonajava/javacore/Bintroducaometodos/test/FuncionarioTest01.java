package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Funcionario;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.nome = "Jaqueline";
        funcionario.idade = 21;
        funcionario.salario = new double[]{12500, 5120, 4000};

        funcionario.imprimir();

    }
}
