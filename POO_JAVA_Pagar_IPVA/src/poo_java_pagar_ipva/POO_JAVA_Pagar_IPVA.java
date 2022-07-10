
package poo_java_pagar_ipva;

public class POO_JAVA_Pagar_IPVA {

  
    private static Moto moto = new Moto();
    private static Carro carro = new Carro();

    public static void main(String[] args) {
        MotoIpva(1990, 4000.00, "CBA-8659", "CG 125 TODAY", "HONDA");
        MotoIpva(2022, 49700.00, "ABC-9568", "NC 750X", "Honda ");
        CarroIpva(2020, 98000.00, "EFG-546", "Corola", "Toyota");
        CarroIpva(1980, 49000.00, "GFE-654", "Monza", "Chevrolet");
        CarroIpva(1990, 9900.00, "BHA-685", "Santana", "Volkswagen ");

    }

    private static void CarroIpva(int ano, double preco, String placa, String modelo, String marca){

        carro.ano = ano;
        carro.preco = preco;
        carro.placa = placa;
        carro.modelo = modelo;
        carro.marca = marca;

        if (carro.VerificarObrigatoriedadeDoIpva()) {
            System.out.println(" Carro modelo: " + modelo + " - Marca: " + marca + " - Placa: " + placa + " - Ano: " + ano + " - Preço: " + preco + " - Valor do IPVA= " + carro.CalcularIpva());
        } else {
            System.out.println(" Carro modelo: " + modelo + " - Marca: " + marca + " - Placa: " + placa + " - Ano: " + ano + " - Preço: " + preco + " - Não é necessário pagar IPVA!");
        }
    }
    private static void MotoIpva(int ano, double preco, String placa, String modelo, String marca) {

        moto.ano = ano;
        moto.preco = preco;
        moto.placa = placa;
        moto.modelo = modelo;
        moto.marca = marca;

        if (moto.VerificarObrigatoriedadeDoIpva()) {
            System.out.println(" Moto modelo: " + modelo + " - Marca: " + marca + " - Placa: " + placa + " - Ano: " + ano + " - Preco: " + preco + " - Valor do IPVA= " + moto.CalcularIpva());
        } else {
            System.out.println(" Moto modelo: " + modelo + " - Marca: " + marca + " - Placa: " + placa + " - Ano: " + ano + " - Preço: " + preco + " - Não é necessário pagar IPVA!");
        }
    }
}
