package exercicio3;

public class Gerente extends Funcionarios{

    public double calcularImposto() {
        return this.getSalario() * 0.1;
    }
}
