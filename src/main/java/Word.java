import java.util.ArrayList;
import java.util.List;

public class Word {

    private WordEdicao estado;

    private List<WordEdicao> memento = new ArrayList<WordEdicao>();

    public WordEdicao getEstado() {
        return this.estado;
    }

    public void setEstado(WordEdicao estado) {
        this.estado = estado;
        this.memento.add(this.estado);
    }

    public void restauraEstado(int indice) {
        if (indice < 0 || indice > this.memento.size() -1) {
            throw new IllegalArgumentException("Índice inválido");
        }
        this.estado = this.memento.get(indice);
    }

    public List<WordEdicao> getEstados() {
        return this.memento;
    }
}
