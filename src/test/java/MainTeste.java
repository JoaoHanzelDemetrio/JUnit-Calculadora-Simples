import it.s.Main;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTeste {
    Main main = new Main();
    @Test
    public void testeSoma() {
        assertEquals(5, main.soma(2, 3), 0.01);
    }

    @Test
    public void testerSubtracao() {
        assertEquals(10, main.subtracao(30, 20), 0.01);
    }

    @Test
    public void testeMultiplicacao() {
        assertEquals(100, main.multiplicacao(10,10), 0.01);
    }

    @Test
    public void testeDivisao() {
        assertEquals(2.5, main.divisao(5,2), 0.01);
    }



}
