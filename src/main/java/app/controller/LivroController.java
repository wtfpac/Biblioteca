package app.controller;

import app.entities.Livro;
import app.services.LivroService;
import java.util.List;

public class LivroController {
    private LivroService livroService = new LivroService();

    public void adicionarLivro(String titulo, int anoPublicacao, String autor) {
        Livro livro = new Livro();
        livro.setTitulo(titulo);
        livro.setAno_publicacao(anoPublicacao);
        livro.setAutor(autor);
        livroService.adicionar(livro);
    }

    public Livro obterLivro(int index) {
        return livroService.obter(index);
    }

    public List<Livro> listarTodosLivros() {
        return livroService.listarTodos();
    }

    public void atualizarLivro(int index, String novoTitulo, int novoAnoPublicacao, String novoAutor) {
        Livro livroAtualizado = new Livro();
        livroAtualizado.setTitulo(novoTitulo);
        livroAtualizado.setAno_publicacao(novoAnoPublicacao);
        livroAtualizado.setAutor(novoAutor);
        livroService.atualizar(index, livroAtualizado);
    }

    public void deletarLivro(int index) {
        livroService.deletar(index);
    }
}
