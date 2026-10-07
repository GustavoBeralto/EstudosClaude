import java.util.Scanner;

public class AgendaApp {
    static String nome;
    static String telefone;
    static String email;
    static Scanner scanner = new Scanner(System.in);

    public static int lerOpcao(){
        return Integer.parseInt(scanner.nextLine());
    }
    public static void cadastrarContato() {
        System.out.println("Qual o nome do seu contato?: ");
        nome = scanner.nextLine();
        System.out.println("Qual o telefone do seu contato?: ");
        telefone = scanner.nextLine();
        System.out.println("Qual o email do seu contato?: ");
        email = scanner.nextLine();
        System.out.println("Você cadastrou um contato");
    }

    public static void listarContatos(){
        System.out.println("Você listou os contatos");
    }

    public static void enviarMensagem(){
        System.out.println("Você enviou uma mensagem");
    }

    public static void mostrarMenu(){
        System.out.println("------Agenda de Contatos-------");
        System.out.println("1 - Cadastrar Contato");
        System.out.println("2 - Listar Contatos");
        System.out.println("3 - Enviar mensagem");
        System.out.println("0 - Sair");
        System.out.println("O que deseja fazer?");
    }

}
