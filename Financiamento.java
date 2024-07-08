//Maria Julia Lourenço Marques

public class Financiamento {
    public double valorImovel;
    public int prazoFinanciamento;
    public double taxaJurosAnual;

    double PagamentoMensal;
    double PagamentoTotal;

    public Financiamento(v, p, t){
        this.valorImovel = v;
        this.prazoFinanciamento = p;
        this.taxaJurosAnual = t; 
    }
    public void CalculoMensal(){
        PagamentoMensal = (valorImovel/(prazoFinanciamento*12))*(1 + (taxaJurosAnual/12));
        return PagamentoMensal
    }
    public void CalculoTotal(){
        PagamentoTotal = PagamentoMensal*prazoFinanciamento*12;
    }
}
