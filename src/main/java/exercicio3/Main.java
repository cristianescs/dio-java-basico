package exercicio3;

public class Main {
    public static void main(String[] args) {

        /*
        POLIMORSFISMO
        Vamos pensar em um cenario onde temos Funcionarios. Esses funcionarios podem ser:
        - Gerente
        - Supervisor
        - Atendente
        Cada tipo de funcionario desses tem politicas diferentes de impostos:
        - Gerente paga 0.1% do salario;
        - Supervisor paga 0.05% do salario;
        - Atendente paga 0.01% do salario;
         */

        Funcionarios maria = new Gerente();
        maria.setSalario(3000.0);
        System.out.println(maria.calcularImposto());

        Funcionarios claudio = new Supervisor();
        claudio.setSalario(2000.0);
        System.out.println(claudio.calcularImposto());

        Funcionarios junior = new Atendente();
        junior.setSalario(1000.0);
        System.out.println(junior.calcularImposto());

    }

}
