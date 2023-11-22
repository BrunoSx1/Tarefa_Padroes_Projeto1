package factory;

import model.Carro;
import model.CarroSedan;

public class FabricaCarroSedan implements FabricaCarro {

    public Carro criarCarro(String modelo) {
        return new CarroSedan(modelo);
    }
}