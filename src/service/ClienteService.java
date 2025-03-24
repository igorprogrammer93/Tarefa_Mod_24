package src.service;

import src.interfaces.IClienteDAO;

public class ClienteService {
    private IClienteDAO clienteDAO;

    public ClienteService(IClienteDAO clienteDAO) {
        this.clienteDAO = clienteDAO;
    }

    public void salvarCliente(String nome) {
        clienteDAO.salvar(nome);
    }

    public String buscarCliente(String nome) {
        return clienteDAO.buscar(nome);
    }

    public void atualizarCliente(String nomeAntigo, String nomeNovo) {
        clienteDAO.atualizar(nomeAntigo, nomeNovo);
    }

    public void excluirCliente(String nome) {
        clienteDAO.excluir(nome);
    }
}
