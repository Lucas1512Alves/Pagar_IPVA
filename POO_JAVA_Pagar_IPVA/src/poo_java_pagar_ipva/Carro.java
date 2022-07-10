
package poo_java_pagar_ipva;

import java.util.Calendar;

public class Carro extends Ipva {

    @Override
    public double CalcularIpva() {
        return preco * 0.03;
    }

    @Override
    public boolean VerificarObrigatoriedadeDoIpva() {
        Calendar calendar = Calendar.getInstance();
        int anoAtual = calendar.get(Calendar.YEAR);
        return this.ano > (anoAtual - 20);
    }
}
