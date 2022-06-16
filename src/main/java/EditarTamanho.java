public class EditarTamanho implements WordEdicao{

    private EditarTamanho() {};
    private static EditarTamanho instance = new EditarTamanho();
    public static EditarTamanho getInstance() {
        return instance;
    }

    public String getNomeEdicao() {
        return "Trocou de Tamanho";
    }
}
