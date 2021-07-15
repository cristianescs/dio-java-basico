package exercicio2;

public class Main {
    public static void main(String[] args){

        Carro carro1 = new Carro("Ford", "EcoSport", 2021);
        Carro carro2 = new Carro("Volkswagen ", "Gol", 2010);

        System.out.println("Carro 1:\n" + carro1.getMarca() + "\n" + carro1.getModelo() + "\n"+ carro1.getAno() + "\n");
        System.out.println("Carro 2:\n" + carro2.getMarca() + "\n" + carro2.getModelo() + "\n"+ carro2.getAno());
    }
}
