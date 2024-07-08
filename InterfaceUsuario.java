//Maria Julia Lourenço Marques
import java.util.Scanner;

public class InterfaceUsuario {
    void valor(){
        Scanner scanValor = new Scanner(System.in);
        System.out.println("Digite o valor do imóvel.");
        String input = scanValor.nextLine();
        try{
            double valorImovel = Double.parseDouble(input);

            if (valorImovel() < 0){
                System.out.println("Erro! Valor menor que zero.");
            }
            else{
                System.out.println("O valor do imóvel é " + valorImovel);}
            }

    void prazo(){
        Scanner scanPrazo = new Scanner(System.in);
        System.out.println("Digite o prazo do financiamento em anos.");
        String input = scanPrazo.nextLine();
        try{
            int prazoFinanciamento = Integer.parseInt(input);

            if (prazoFinanciamento < 0){
                System.out.println("Erro! Valor menor que zero.");
            }
            else{
                System.out.println("O prazo de pagamento do imóvel é " + prazoFinanciamento)}
            }
        }
    void taxa(){
        Scanner scanTaxa = new Scanner(System.in);
        System.out.println("Digite a taxa de juros anual.");
        String input = scanTaxa.nextLine();
        try{
            double taxaJurosAnual = Double.parseDouble(input);

            if (taxaJurosAnual() < 0){
                System.out.println("Erro! Valor menor que zero.");
            }
            else{
                System.out.println("A taxa de juros do imóvel é " + taxaJurosAnual);}
            }
    }
}
