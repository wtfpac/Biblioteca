package app.controller;

import app.entities.Editora;
import app.services.EditoraService;
import java.util.List;

public class EditoraController {
    private EditoraService editoraService = new EditoraService();

    public void adicionarEditora(String nome, String endereco) {
        Editora editora = new Editora();
        editora.setNome(nome);
        editora.setEndereco(endereco);
        editoraService.adicionar(editora);
    }

    public Editora obterEditora(int index) {
        return editoraService.obter(index);
    }

    public List<Editora> listarTodasEditoras() {
        return editoraService.listarTodos();
    }

    public void atualizarEditora(int index, String novoNome, String novoEndereco) {
        Editora editoraAtualizada = new Editora();
        editoraAtualizada.setNome(novoNome);
        editoraAtualizada.setEndereco(novoEndereco);
        editoraService.atualizar(index, editoraAtualizada);
    }

    public void deletarEditora(int index) {
        editoraService.deletar(index);
    }
}
