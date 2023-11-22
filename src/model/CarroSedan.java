package model;

public class CarroSedan implements Carro {
    private String modelo;

    public CarroSedan(String modelo) {
        this.modelo = modelo;
    }

    public void exibirInfo() {
        System.out.println("Carro Sedan: Um carro de passeio com espaço confortável para passageiros.");
        System.out.println("Modelo: " + modelo);
    }
}