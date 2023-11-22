package factory;

import model.Carro;
import model.CarroHatch;

public class FabricaCarroHatch implements FabricaCarro {

    public Carro criarCarro(String modelo) {
        return new CarroHatch(modelo);
    }
}