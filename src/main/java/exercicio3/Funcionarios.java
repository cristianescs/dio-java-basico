package exercicio3;

public class Funcionarios {
    private double imposto;
    private double salario;

    public double getImposto() {
        return imposto;
    }

    public void setImposto(double imposto) {
        this.imposto = imposto;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double calcularImposto(){
        return this.salario * 0;
    }
}
