import java.util.Scanner;
public class Aula_Scanner {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n1 = 0, n2 = 0, n3 = 0, n4 = 0, soma = 0;
        String nome = "",  res = "";

        // Input do nome
        System.out.println("Qual o nome do aluno? ");
        nome = scan.nextLine();

        // Input dos Números
        System.out.println("Digite a primeira nota: ");
        n1 = scan.nextInt();
        System.out.println("Digite a segunda nota: ");
        n2 = scan.nextInt();
        System.out.println("Digite a terceira nota: ");
        n3 = scan.nextInt();
        System.out.println("Digite a quarta nota: ");
        n4 = scan.nextInt();

        // Print do resultado
        soma = (n1+n2+n3+n4) / 4;
        
        if(soma >= 6) {
        	System.out.printf("O aluno %s ficou com a média %d e foi aprovado!",nome, soma);
        }
        else if (soma >= 5) {
        	System.out.printf("O aluno %s ficou com a média %d e está de recuperação!",nome, soma);
        }
        else {
        	System.out.printf("O aluno %s ficou com a média %d e foi reprovado!",nome, soma);
        }
       

    }
}