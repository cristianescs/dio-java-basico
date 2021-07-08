package exercicios;

public class Carro {

    /* EXERCÍCIO
    * Criar uma classe Carro. Nessa classe deverá ter a quantidade de pessoas que estão dentro do carro e também é preciso
    * que tenha uma forma de adicionar e remover pessoas de dentro do carro.
    * */

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
