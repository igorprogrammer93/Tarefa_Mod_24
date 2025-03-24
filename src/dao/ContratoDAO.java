package src.dao;

import src.interfaces.IContratoDAO;

public class ContratoDAO implements IContratoDAO {
    @Override
    public void assinarContrato(String contrato) {
        System.out.println("Assinando contrato: " + contrato);
    }

    @Override
    public String buscar(String contrato) {
        System.out.println("Buscando contrato: " + contrato);
        return contrato;
    }

    @Override
    public void atualizar(String contratoAntigo, String contratoNovo) {
        System.out.println("Atualizando contrato: " + contratoAntigo + " -> " + contratoNovo);
    }

    @Override
    public void excluir(String contrato) {
        System.out.println("Excluindo contrato: " + contrato);
    }
}
