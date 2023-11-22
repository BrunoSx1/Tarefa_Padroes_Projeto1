package factory;

import model.Carro;

public interface FabricaCarro {
    Carro criarCarro(String modelo);
}