import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual o nome do seu contato?:");
        String nome = scanner.nextLine();

        System.out.println("Qual o telefone do seu contato?:");
        String telefone = scanner.nextLine();

        System.out.println("Qual o email do seu contato?:");
        String email = scanner.nextLine();

        System.out.println("Contato Criado! \n Nome:" + nome +"\n Telefone: " + telefone + "\n Email: " + email );
        scanner.close();
    }
}
