package src.service;

import src.interfaces.IContratoDAO;

public class ContratoService {
    private IContratoDAO contratoDAO;

    public ContratoService(IContratoDAO contratoDAO) {
        this.contratoDAO = contratoDAO;
    }

    public void assinar(String contrato) {
        contratoDAO.assinarContrato(contrato);
    }

    public String buscar(String contrato) {
        return contratoDAO.buscar(contrato);
    }

    public void atualizar(String antigo, String novo) {
        contratoDAO.atualizar(antigo, novo);
    }

    public void excluir(String contrato) {
        contratoDAO.excluir(contrato);
    }
}