package exercicio3;

public class Supervisor extends Funcionarios{
    public double calcularImposto() {
        return this.getSalario() * 0.05;
    }
}
