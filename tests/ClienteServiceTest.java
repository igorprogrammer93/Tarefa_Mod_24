package tests;
import src.mocks.ClienteDAOMock;

import src.service.ClienteService;

public class ClienteServiceTest {
    public static void main(String[] args) {
        ClienteService service = new ClienteService(new ClienteDAOMock());

        service.salvarCliente("Fulano");
        service.buscarCliente("Fulano");
        service.atualizarCliente("Fulano", "Ciclano");
        service.excluirCliente("Ciclano");
    }
}

