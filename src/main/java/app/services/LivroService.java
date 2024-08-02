package app.services;

import app.entities.Livro;
import java.util.ArrayList;
import java.util.List;

public class LivroService {
    private List<Livro> livros = new ArrayList<>();

    public void adicionar(Livro livro) {
        livros.add(livro);
    }

    public Livro obter(int index) {
        if (index >= 0 && index < livros.size()) {
            return livros.get(index);
        }
        return null;
    }

    public List<Livro> listarTodos() {
        return livros;
    }

    public void atualizar(int index, Livro livroAtualizado) {
        if (index >= 0 && index < livros.size()) {
            livros.set(index, livroAtualizado);
        }
    }

    public void deletar(int index) {
        if (index >= 0 && index < livros.size()) {
            livros.remove(index);
        }
    }
}
