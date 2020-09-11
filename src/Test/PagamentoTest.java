package Test;

import Entities.*;
import org.junit.Ignore;
import org.junit.Test;
import static org.junit.Assert.*;

public class PagamentoTest {



    @Test
    public void testCalcularTroco() {
        Pagamento pagamento = new Pagamento(50, true);
        assertEquals(50, pagamento.calcularTroco(100), 0.000000001);
    }

    @Test
    public void testRegistrarPagamento(){
        Pagamento pagamento = new Pagamento(50, false);
        pagamento.registrarPagamento();
        assertTrue(pagamento.isPago());
    }
}