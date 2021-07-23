import java.util.Scanner;
public class Java_001 {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    int n1 = 0, n2 = 0, n3 = 0, n4 = 0, resultado = 0;
    String nome = "";
    int maxFaltas = 30;

        System.out.println("Digite o nome do aluno: ");
        nome = scan.nextLine();

        System.out.println("Nota do 1° bimestre: ");
        n1 = scan.nextInt();

        System.out.println("Nota do 2° bimestre: ");
        n2 = scan.nextInt();

        System.out.println("Nota do 3° bimestre: ");
        n3 = scan.nextInt();

        System.out.println("Nota do 4° bimestre: ");
        n4 = scan.nextInt();

        System.out.println("Número de Faltas: ");
        maxFaltas = scan.nextInt();

        resultado = (n1 + n2 + n3 + n4) / 4;


        if (resultado >= 6 && maxFaltas < 30) {
            System.out.printf("A média do aluno %s foi de %d, ele está APROVADO!", nome, resultado);
        }
        else if (resultado >= 5 && maxFaltas <30){
            System.out.printf("A média do aluno %s foi de %d, ele está em RECUPERAÇÃO", nome, resultado);
        }
        else if (maxFaltas >= 30) {
            System.out.printf("O aluno %s está reprovado por faltas!", nome);
        }
        else {
            System.out.printf("A média do aluno %s foi de %d, ele está reprovado!", nome, resultado);
        }
    }
