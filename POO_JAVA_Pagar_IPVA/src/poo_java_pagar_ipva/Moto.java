
package poo_java_pagar_ipva;
import java.util.Calendar;

public class Moto extends Ipva {

    @Override
    public double CalcularIpva() {
        return preco * 0.03;
    }

    @Override
    public boolean VerificarObrigatoriedadeDoIpva() {
        Calendar calendar = Calendar.getInstance();
        int anoAtual = calendar.get(Calendar.YEAR);
        if (this.ano <= (anoAtual - 20)){
            return false;
        }
        return true;
    }
}