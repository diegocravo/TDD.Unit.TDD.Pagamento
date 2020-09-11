package Entities;

import java.util.Locale;

public class Pagamento {

    public float valorVenda;
    public boolean pago;

    public Pagamento(float valorVenda, boolean pago){
        this.valorVenda = valorVenda;
        this.pago = pago;
    }

    public boolean isPago() {
        return pago;
    }

    public float calcularTroco(float valorFornecido){
        return valorFornecido - valorVenda;
    }

    public void registrarPagamento(){
        this.pago = true;
    }
}
