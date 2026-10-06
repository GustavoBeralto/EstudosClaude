import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("--------Agenda de contatos---------");
        System.out.println("1: Cadastrar contato");
        System.out.println("2: Listar contatos");
        System.out.println("3: Enviar mensagem");
        System.out.println("0: Sair");
        System.out.println("O que deseja fazer?");
        int opcao = scanner.nextInt();

        switch(opcao){
            case 1:
                System.out.println("Você cadastrou um contato");
                break;
            case 2:
                System.out.println("Você listou os contatos");
                break;
            case 3:
                System.out.println("Você enviou uma mensagem");
                break;
            case 0:
                System.out.println("Você saiu do sistema");
                break;
            default:
                System.out.println("Opção inválida");
        }
        scanner.close();

    }
}
