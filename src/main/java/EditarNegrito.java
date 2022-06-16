public class EditarNegrito implements WordEdicao {

    private EditarNegrito() {};
    private static EditarNegrito instance = new EditarNegrito();
    public static EditarNegrito getInstance() {
        return instance;
    }

    public String getNomeEdicao() {
        return "Negrito Adicionado";
    }
}
