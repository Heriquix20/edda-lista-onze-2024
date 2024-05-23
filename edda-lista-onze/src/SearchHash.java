
import java.util.HashMap;
import java.util.Scanner;

public class SearchHash {
    public static void main(String[] args) throws Exception {

        Scanner leitor = new Scanner(System.in);

        HashMap<String, String> dados = new HashMap<String, String>();

        for(int i = 0; i <5; i++) {
            System.out.println("Digite o CPF desejado:");
            String CPF = leitor.next();
            System.out.println("Digite o telefone desejado:");
            String Telefone = leitor.next();
            dados.put(CPF, Telefone);
        }

        System.out.println("\nDados recebidos:");
        dados.forEach((CPF, Telefone) -> {
            System.out.println("\nCPF: " + CPF + ", Telefone: " + Telefone);
     });

        System.out.println("\n\nDigite o CPF do telefone requisitado: ");
        String buscaCPF = leitor.next();
        if(dados.containsKey(buscaCPF)) {
            System.out.println("\nO telefone do CPF " +buscaCPF+ " é " +dados.get(buscaCPF));
        } else { System.out.println("\nO CPF pesquisado não encontrado");}

        leitor.close();

        }
}
