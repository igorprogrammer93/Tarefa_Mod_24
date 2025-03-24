package src.mocks;

import src.interfaces.IClienteDAO;

public class ClienteDAOMock implements IClienteDAO {
    @Override
    public void salvar(String nome) {
        System.out.println("Mock: Cliente salvo (simulado): " + nome);
    }

    @Override
    public String buscar(String nome) {
        System.out.println("Mock: Buscando cliente (simulado): " + nome);
        return nome;
    }

    @Override
    public void atualizar(String nomeAntigo, String nomeNovo) {
        System.out.println("Mock: Atualizando cliente (simulado): " + nomeAntigo + " -> " + nomeNovo);
    }

    @Override
    public void excluir(String nome) {
        System.out.println("Mock: Excluindo cliente (simulado): " + nome);
    }
}


