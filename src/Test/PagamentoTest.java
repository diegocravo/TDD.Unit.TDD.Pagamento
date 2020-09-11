package Test;

import Entities.*;
import org.junit.Ignore;
import org.junit.Test;
import static org.junit.Assert.*;

public class PagamentoTest {

    Pagamento pagamento = new Pagamento(50, false);

    @Test
    public void testCalcularTroco() {
        assertEquals(50, pagamento.calcularTroco(100), 0.000000001);
    }

    @Test
    public void testRegistrarPagamento(){
        pagamento.registrarPagamento();
        assertTrue(pagamento.isPago());
    }
}