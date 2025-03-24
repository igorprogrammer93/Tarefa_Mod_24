package src.interfaces;
public interface IContratoDAO {
    void assinarContrato(String contrato);

    // NOVOS MÉTODOS
    String buscar(String contratoId);
    void excluir(String contratoId);
    void atualizar(String contratoId, String novoConteudo);
}