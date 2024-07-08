public class Financiamento {
    double valorImovel;
    int prazoFinanciamento;
    double taxaJurosAnual;

    double PagamentoMensal;
    double PagamentoTotal;

    public void Carro(v, p, t){
        valorImovel = v;
        prazoFinanciamento = p;
        taxaJurosAnual = t;
    }
    public void CalculoMensal(){
        PagamentoMensal = (valorImovel/(prazoFinanciamento*12))*(1 + (taxaJurosAnual/12));
        return PagamentoMensal
    }
    public void CalculoTotal(){
        PagamentoTotal = PagamentoMensal*prazoFinanciamento*12;
    }
}
