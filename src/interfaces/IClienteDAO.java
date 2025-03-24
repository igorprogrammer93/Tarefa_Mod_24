package src.interfaces;
public interface IClienteDAO {
    void salvar(String nome);
    String buscar(String nome);
    void atualizar(String nomeAntigo, String nomeNovo);
    void excluir(String nome);
}