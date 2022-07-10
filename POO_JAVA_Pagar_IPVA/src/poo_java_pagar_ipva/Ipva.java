package poo_java_pagar_ipva;

abstract class Ipva {

    public int ano;
    public double preco;
    public String placa;
    public String modelo;
    public String marca;

    public abstract double CalcularIpva();
    public abstract boolean VerificarObrigatoriedadeDoIpva();
}