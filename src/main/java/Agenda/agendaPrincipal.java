package Agenda;
import java.util.Scanner;
import java.text.ParseException;
import java.util.Scanner;

/**
 * Engenharia de Telecomunicações - IFSC
 * Programação Orientada a Objetos
 *
 * Agenda Telefônica
 *
 * @author Andrey Gonçalves
 *
 *
 * */
public class agendaPrincipal {
    public static void main(String[] args) throws ParseException {
        Agenda PhoneBook = new Agenda();
        Pessoa pessoa = new Pessoa("Andrey", "goncalves", "andrey@khomp.com", "48999026700","oi");
        Telefone telefone = new Telefone();
        int which = 0;
        int opcao;
        while (true) {
            System.out.println("------------------------------------------       -");
            System.out.println("- 1.  Digite 1 para adicionar PESSOA             -");
            System.out.println("- 2.  Digite 2 para adicionar TELEFONE           -");
            System.out.println("- 3.  Digite 3 para adicionar EMAIL              -");
            System.out.println("- 4.  Digite 4 para imprimir lista de telefones  -");
            System.out.println("--------------------------------------------------");


            System.out.println("Escolha uma operação de 0 á X:");
            Scanner ler = new Scanner(System.in);
            which = ler.nextInt();

            switch (which) {
                case 0:

                    break;
                case 1:
                    break;
                case 2:
                    System.out.println("Digite o tipo de telefone: ");
                    String typetel = ler.next();
                    System.out.println("Digite número de telefone: ");
                    String tel = ler.next();
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    return;
                default:
                    return;
            }


//            telefone.imprime_telefone();

        }
    }
}