import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int opcao;
        String nome;
        String telefone;
        String email;
            do{
            System.out.println("------Agenda de Contatos-------");
            System.out.println("1 - Cadastrar Contato");
            System.out.println("2 - Listar Contatos");
            System.out.println("3 - Enviar mensagem");
            System.out.println("0 - Sair");
            System.out.println("O que deseja fazer?");
            String opcaoTexto = scanner.nextLine();
            opcao = Integer.parseInt(opcaoTexto);

            switch(opcao){
                case 1 -> {
                    System.out.println("Digite o nome:");
                    nome = scanner.nextLine();
                    System.out.println("Digite o telefone:");
                    telefone = scanner.nextLine();
                    System.out.println("Digite o email:");
                    email = scanner.nextLine();
                    System.out.println("Você cadastrou um contato");
                }
                case 2 -> {
                    System.out.println("Você listou os contatos!");
                }
                case 3 -> {
                    System.out.println("Você enviou uma mensagem");
                }
                case 0 ->{
                    System.out.println("Saindo do programa!");
                }
                default -> {
                    System.out.println("Opção inválida");
                }


            }
            }
        while(opcao != 0);
        scanner.close();
    }
}
