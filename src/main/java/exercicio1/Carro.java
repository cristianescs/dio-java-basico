package exercicio1;

public class Carro {

    //Construtores

    public int pessoas = 0;

    public int getPessoas() {
        return pessoas;
    }

    public String adicionar() {
        pessoas = getPessoas() + 1;
        return "Foi adicionado uma pessoa\n Total de pessoas dentro do carro: " + pessoas;
    }

    public String remover() {
        pessoas = getPessoas() - 1;
        return "Foi removido uma pessoa\n Total de pessoas dentro do carro: " + pessoas;
    }
}
