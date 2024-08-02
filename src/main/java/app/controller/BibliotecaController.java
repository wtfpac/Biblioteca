package app.controller;

import app.entities.Biblioteca;
import app.services.BibliotecaService;
import java.util.List;

public class BibliotecaController {
    private BibliotecaService bibliotecaService = new BibliotecaService();

    public void adicionarBiblioteca(String endereco, String telefone) {
        Biblioteca biblioteca = new Biblioteca();
        biblioteca.setEndereco(endereco);
        biblioteca.setTelefone(telefone);
        bibliotecaService.adicionar(biblioteca);
    }

    public Biblioteca obterBiblioteca(int index) {
        return bibliotecaService.obter(index);
    }

    public List<Biblioteca> listarTodasBibliotecas() {
        return bibliotecaService.listarTodos();
    }

    public void atualizarBiblioteca(int index, String novoEndereco, String novoTelefone) {
        Biblioteca bibliotecaAtualizada = new Biblioteca();
        bibliotecaAtualizada.setEndereco(novoEndereco);
        bibliotecaAtualizada.setTelefone(novoTelefone);
        bibliotecaService.atualizar(index, bibliotecaAtualizada);
    }

    public void deletarBiblioteca(int index) {
        bibliotecaService.deletar(index);
    }
}
