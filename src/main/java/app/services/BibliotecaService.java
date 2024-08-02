package app.services;

import app.entities.Biblioteca;
import java.util.ArrayList;
import java.util.List;

public class BibliotecaService {
    private List<Biblioteca> bibliotecas = new ArrayList<>();

    public void adicionar(Biblioteca biblioteca) {
        bibliotecas.add(biblioteca);
    }

    public Biblioteca obter(int index) {
        if (index >= 0 && index < bibliotecas.size()) {
            return bibliotecas.get(index);
        }
        return null;
    }

    public List<Biblioteca> listarTodos() {
        return bibliotecas;
    }

    public void atualizar(int index, Biblioteca bibliotecaAtualizada) {
        if (index >= 0 && index < bibliotecas.size()) {
            bibliotecas.set(index, bibliotecaAtualizada);
        }
    }

    public void deletar(int index) {
        if (index >= 0 && index < bibliotecas.size()) {
            bibliotecas.remove(index);
        }
    }
}
