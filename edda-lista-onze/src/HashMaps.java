
import java.util.HashMap;
import java.util.Scanner;

public class HashMaps {
    public static void main(String[] args) throws Exception {

        Scanner leitor = new Scanner(System.in);

        HashMap<String, String> dados = new HashMap<String, String>();

        for(int i = 0; i <5; i++) {
            System.out.println("\nDigite o CPF:");
            String CPF = leitor.next();
            System.out.println("\nDigite o telefone:");
            String Telefone = leitor.next();
            dados.put(CPF, Telefone);
        }
        System.out.println("\nDados recebidos:");
        dados.forEach((CPF, Telefone) -> {
            System.out.println("CPF: " + CPF + ", Telefone: " + Telefone);
    });
    
    leitor.close();
        }

    }