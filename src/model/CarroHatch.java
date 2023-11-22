package model;

public class CarroHatch implements Carro {
    private String modelo;

    public CarroHatch(String modelo) {
        this.modelo = modelo;
    }

    public void exibirInfo() {
        System.out.println("Carro Hatch: Um carro compacto e ágil, ideal para a cidade.");
        System.out.println("Modelo: " + modelo);
    }
}