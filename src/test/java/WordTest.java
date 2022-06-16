import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class WordTest {

    @Test
    public void deveArmazenarEstados() {
        Word word = new Word();
        word.setEstado(EditarFonte.getInstance());
        word.setEstado(EditarNegrito.getInstance());
        assertEquals(2, word.getEstados().size());
    }

    @Test
    public void deveRetornarEstadoInicial() {
        Word word = new Word();
        word.setEstado(EditarFonte.getInstance());
        word.setEstado(EditarNegrito.getInstance());
        word.restauraEstado(0);
        assertEquals(EditarFonte.getInstance(), word.getEstado());
    }

    @Test
    public void deveRetornarEstadoAnterior() {
        Word word = new Word();
        word.setEstado(EditarFonte.getInstance());
        word.setEstado(EditarTamanho.getInstance());
        word.setEstado(EditarFonte.getInstance());
        word.setEstado(EditarNegrito.getInstance());
        word.restauraEstado(2);
        assertEquals(EditarFonte.getInstance(), word.getEstado());
    }

    @Test
    public void deveRetornarExcecaoIndiceInvalido() {
        try {
            Word word = new Word();
            word.restauraEstado(0);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Índice inválido", e.getMessage());
        }
    }
}
