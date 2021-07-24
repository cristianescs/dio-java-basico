package exercicio3;

public class Atendente extends Funcionarios{
    public double calcularImposto() {
        return this.getSalario() * 0.01;
    }
}
