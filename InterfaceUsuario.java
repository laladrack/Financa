//Maria Julia Lourenço Marques
import java.util.Scanner;

public class InterfaceUsuario {
    void valor(){
        Scanner scanValor = new Scanner(System.in);
        System.out.println("Digite o valor do imóvel.");
        String valorImovel = scanValor.nextLine();
        System.out.println("O valor do imóvel é " + valorImovel);}
    void prazo(){
        Scanner scanPrazo = new Scanner(System.in);
        System.out.println("Digite o prazo do financiamento em anos.");
        String prazoFinanciamento = scanPrazo.nextLine();
        System.out.println("O prazo de pagamento do imóvel é " + prazoFinanciamento);
    }
    void taxa(){
        Scanner scanTaxa = new Scanner(System.in);
        System.out.println("Digite a taxa de juros anual.");
        String taxaJurosAnual = scanTaxa.nextLine();
        System.out.println("A taxa de juros do imóvel é " + taxaJurosAnual);
    }
}
