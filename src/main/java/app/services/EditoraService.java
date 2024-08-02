package app.services;

import app.entities.Editora;
import java.util.ArrayList;
import java.util.List;

public class EditoraService {
    private List<Editora> editoras = new ArrayList<>();

    public void adicionar(Editora editora) {
        editoras.add(editora);
    }

    public Editora obter(int index) {
        if (index >= 0 && index < editoras.size()) {
            return editoras.get(index);
        }
        return null;
    }

    public List<Editora> listarTodos() {
        return editoras;
    }

    public void atualizar(int index, Editora editoraAtualizada) {
        if (index >= 0 && index < editoras.size()) {
            editoras.set(index, editoraAtualizada);
        }
    }

    public void deletar(int index) {
        if (index >= 0 && index < editoras.size()) {
            editoras.remove(index);
        }
    }
}
