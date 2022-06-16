public class EditarFonte implements WordEdicao {

    private EditarFonte() {};
    private static EditarFonte instance = new EditarFonte();
    public static EditarFonte getInstance() {
        return instance;
    }

    public String getNomeEdicao() {
        return "Fonte trocada";
    }
}
