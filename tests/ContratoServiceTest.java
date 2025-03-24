package tests;

import src.mocks.ContratoDAOMock;
import src.service.ContratoService;

public class ContratoServiceTest {
    public static void main(String[] args) {
        ContratoService service = new ContratoService(new ContratoDAOMock());

        service.assinar("Contrato X");
        service.buscar("Contrato X");
        service.atualizar("Contrato X", "Contrato Y");
        service.excluir("Contrato Y");
    }
}
