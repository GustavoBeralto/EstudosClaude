import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int opcao;
            do{
            AgendaApp.mostrarMenu();
            opcao = AgendaApp.lerOpcao();

            switch(AgendaApp.lerOpcao()){
                case 1 -> {
                    AgendaApp.cadastrarContato();
                }
                case 2 -> {
                    AgendaApp.listarContatos();
                }
                case 3 -> {
                    AgendaApp.enviarMensagem();
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
        AgendaApp.scanner.close();
    }
}
