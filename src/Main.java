import javax.swing.plaf.synth.SynthTabbedPaneUI;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        /*Variaveis e Tipos de Dados */
        Scanner digito = new Scanner(System.in);
        System.out.println("---- MENU-------");
        System.out.println("\n 1 - MÉDIA ESTATICA \n" +
                " 2- ANTECESSOR E PREDECESSOR \n " +
                "3- MINI CÁLCULO \n " +
                "4 - CADASTRO \n" +
                "5 - ANO CADASTRO");
        System.out.print("Selecione a opção desejada: ");
        int opcao  = digito.nextInt();

        switch (opcao){
        case 1:
            System.out.println("-------MÉDIA ARITMÉTICA ESTÁTICA-------");
            int resultado =0;
            int m1 = (8+9+7)/3;
            System.out.println("Média 1: "+ m1);
            int m2 = (4+5+6)/3;
            System.out.println("Média 2: "+ m2);
            resultado = m1 + m2;
            System.out.println("Média 1 + Média 2 = "+ resultado);
            System.out.println("A soma das médias= " + resultado/2+"\n");
        break;

            case 2:
                System.out.println("-------ANTES E DEPOIS - NUMEROS -------");

                System.out.printf("Digite um número: ");
                int numero = digito.nextInt();
                System.out.println( (numero-1)+" "+ numero+" " + (numero+1) );
                break;

            case 3:
                System.out.println("\n---- MINI CÁLCULO -----");
                System.out.print("Digite o primeiro numero: ");
                float n1 = digito.nextFloat();
                System.out.print("Digite o segundo numero: ");
                float n2 = digito.nextFloat();
                System.out.println("Multiplicação: " + n1*n2);
                System.out.println("Divisão: " + n1/n2);
                System.out.println("Soma: " + (n1+n2));
                break;

            case 4:
                System.out.println("----CADASTRO---");
                System.out.print("Digite seu nome: ");
                String nome = digito.next();
                System.out.print("Digite seu sobrenome: ");
                String sobrenome = digito.next();
                System.out.print("Digite sua idade:");
                int idade = digito.nextInt();
                digito.nextLine();
                System.out.print("Digite seu endereço: ");
                String endereco = digito.nextLine();

                System.out.print("\n|||||||///// Seus Dados |||||||\nNome: " + nome + "\n Sobrenome: "+ sobrenome + "\n Idade: " + idade+"\n Endereço: "+ endereco);
                break;
            case 5:
                Calendar calendario = GregorianCalendar.getInstance();
                System.out.print("Digite seu nome: ");
                nome = digito.next();
                System.out.print("Digite sua idade:");
                idade = digito.nextInt();
                System.out.println(nome + " é seu nome, e você nasceu em " + ((calendario.get(Calendar.YEAR)) - idade) );
                break;

        }







    }
}