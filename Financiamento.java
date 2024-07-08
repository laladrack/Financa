//Maria Julia Lourenço Marques

public class Financiamento {
    private double valorImovel;
    private int prazoFinanciamento;
    private double taxaJurosAnual;

    public Financiamento(v, p, t){
        this.setvalorImovel(v);
        this.setprazoFinanciamento(p);
        this.settaxaJurosAnual(t); 
    }
    public void CalculoMensal(){
        double PagamentoMensal = (valorImovel/(prazoFinanciamento*12))*(1 + (taxaJurosAnual/12));
        return PagamentoMensal;
    }
    public void CalculoTotal(){
        double PagamentoTotal = PagamentoMensal*prazoFinanciamento*12;
        return PagamentoTotal;
    }
    public void Status(){
        System.out.println("O valor do imóvel é " + getvalorImovel);
        System.out.println("O prazo do financiamento é " + getprazoFinanciamento);
        System.out.println("A taxa de juros do imóvel é " + gettaxaJurosAnual);
    }   


    public void setvalorImovel(double valorImovel){
        this.valorImovel = valorImovel;
    }
    public double getvalorImovel(){
        return this.valorImovel;
    }
    public void setprazoFinanciamento(int prazoFinanciamento){
        this.prazoFinanciamento = prazoFinanciamento;
    }
    public int getprazoFinanciamento(){
        return this.prazoFinanciamento;
    }
    public void settaxaJurosAnual(double taxaJurosAnual){
        this.taxaJurosAnual = taxaJurosAnual;
    }
    public double gettaxaJurosAnual(){
        return this.taxaJurosAnual;
    }
}
