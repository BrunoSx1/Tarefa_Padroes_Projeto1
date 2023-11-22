package br.com.bs.main;

import factory.FabricaCarro;
import factory.FabricaCarroHatch;
import factory.FabricaCarroSedan;
import model.Carro;

public class Cliente {
    public static void main(String[] args) {

        FabricaCarro fabricaSedan = new FabricaCarroSedan();
        Carro carroSedan1 = fabricaSedan.criarCarro("Sedan Luxo");
        Carro carroSedan2 = fabricaSedan.criarCarro("Sedan Esportivo");
        Carro carroSedan3 = fabricaSedan.criarCarro("Sedan Básico");


        System.out.println("Carros Sedan:");
        carroSedan1.exibirInfo();
        carroSedan2.exibirInfo();
        carroSedan3.exibirInfo();

        System.out.println();


        FabricaCarro fabricaHatch = new FabricaCarroHatch();
        Carro carroHatch1 = fabricaHatch.criarCarro("Hatch Esportivo");
        Carro carroHatch2 = fabricaHatch.criarCarro("Hatch Aventureiro");
        Carro carroHatch3 = fabricaHatch.criarCarro("Hatch Econômico");


        System.out.println("Carros Hatch:");
        carroHatch1.exibirInfo();
        carroHatch2.exibirInfo();
        carroHatch3.exibirInfo();
    }
}