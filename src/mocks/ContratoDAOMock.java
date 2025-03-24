package src.mocks;

import src.interfaces.IContratoDAO;

public class ContratoDAOMock implements IContratoDAO {
    @Override
    public void assinarContrato(String contrato) {
        System.out.println("Mock: Contrato assinado (simulado): " + contrato);
    }

    @Override
    public String buscar(String contrato) {
        System.out.println("Mock: Buscando contrato (simulado): " + contrato);
        return contrato;
    }

    @Override
    public void atualizar(String contratoAntigo, String contratoNovo) {
        System.out.println("Mock: Atualizando contrato (simulado): " + contratoAntigo + " -> " + contratoNovo);
    }

    @Override
    public void excluir(String contrato) {
        System.out.println("Mock: Excluindo contrato (simulado): " + contrato);
    }
}