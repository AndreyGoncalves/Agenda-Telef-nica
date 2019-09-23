package Agenda;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
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
        Pessoa pessoa = new Pessoa("Andrey","Goncalves","andrey@khomp.com","48999026700",2019,11,29);
        Telefone telefone2 = new Telefone();
        Email email = new Email();

      /*  telefone2.add("Comercial","48991508756");
        telefone2.add("Khomp", "77991508756");
        telefone2.add("C1","00000000000");
        telefone2.imprimirTelefones();
        email.add("comercial","andreygoncalves@Live.com");
        email.add("comerc2ial","andreygoncalves@Live.com");
        email.add("comerci2sal","andreygoncalves@Live.com");
        email.add("comç~çççercial","2ça@Live.com");
        email.toString();*/

      pessoa.toString();
      /*        int which = 0;
        int opcao;
        while(true) {
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
                    PhoneBook.addPessoa(pessoa);
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
                    PhoneBook.toString();
                    telefone.imprimirTelefones();
                    break;
                case 5:
                    return;
                default:
                    return;
            }*/


//

    }
}