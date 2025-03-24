package src.interfaces;

public interface IContratoService {
    void processarContrato(String contrato);

    // NOVOS MÉTODOS
    String buscarContrato(String contratoId);
    void excluirContrato(String contratoId);
    void atualizarContrato(String contratoId, String novoConteudo);
}