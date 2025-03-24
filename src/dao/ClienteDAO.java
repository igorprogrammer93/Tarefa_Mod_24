package src.dao;

import src.interfaces.IClienteDAO;

import java.util.HashMap;
import java.util.Map;

public class ClienteDAO implements IClienteDAO {
    private Map<String, String> bancoSimulado = new HashMap<>();

    @Override
    public void salvar(String nome) {
        bancoSimulado.put(nome, nome);
        System.out.println("Salvando cliente no banco: " + nome);
    }

    @Override
    public String buscar(String nome) {
        System.out.println("Buscando cliente: " + nome);
        return bancoSimulado.get(nome);
    }

    @Override
    public void atualizar(String nomeAntigo, String nomeNovo) {
        if (bancoSimulado.containsKey(nomeAntigo)) {
            bancoSimulado.remove(nomeAntigo);
            bancoSimulado.put(nomeNovo, nomeNovo);
            System.out.println("Cliente atualizado: " + nomeAntigo + " -> " + nomeNovo);
        } else {
            System.out.println("Cliente não encontrado para atualizar: " + nomeAntigo);
        }
    }

    @Override
    public void excluir(String nome) {
        bancoSimulado.remove(nome);
        System.out.println("Cliente excluído: " + nome);
    }
}
