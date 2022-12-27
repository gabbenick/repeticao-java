import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

    }

    private static void AlturaCrescimento() {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Insira duas alturas.");
            Double altura1 = scan.nextDouble();
            Double altura2 = scan.nextDouble();

            System.out.println("insira duas taxas de crescimento");
            Double crescimento1 = scan.nextDouble();
            Double crescimento2 = scan.nextDouble();

            int tempo = 0;

            while (altura1 >= altura2) {
                altura1 += crescimento1;
                altura2 += crescimento2;
                tempo = tempo + 1;
            }
            System.out.println(altura1);
            System.out.println(altura2);
            System.out.println(tempo);
        }
    }

    private static void Contagem() {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Insira o limite da contagem.");
            int limite = scan.nextInt();
            System.out.println("Insira o número que você quer.");
            int num = scan.nextInt();
            int i = 0;
            while (i < limite) {
                System.out.println(i);
                i++;
                if (i == num) {
                    System.out.println("O i vale " + num + ".");
                    break;
                }
            }
        }
    }

    private static void MediaIdade() {
        try (Scanner scan = new Scanner(System.in)) {
            int maisNovo = 0;
            int maisVelho = 0;
            System.out.println("Insira a quantidade de entrevistas: ");
            int quantidadeEntrevistas = scan.nextInt();
            int quantidadeEntrevistados = 0;
            int i = 0;
            int somaIdade = 0;
            float porcentagemMenorIdade = 0.0f;
            Double mediaIdade = 0.0d;

            while (quantidadeEntrevistados < quantidadeEntrevistas) {
                System.out.println("informe a sua idade.");
                int idadeInformada = scan.nextInt();
                if (idadeInformada >= maisVelho) {
                    maisVelho = idadeInformada;
                }
                if (idadeInformada <= maisNovo) {
                    maisNovo = idadeInformada;
                }
                if (idadeInformada < 18) {
                    i++;
                }
                somaIdade += idadeInformada;
                quantidadeEntrevistados++;
            }
            porcentagemMenorIdade = ((i * 100) / quantidadeEntrevistas);
            System.out.println("A porcentagem de menores de idade é: ");
            System.out.println(porcentagemMenorIdade);
            mediaIdade = (double) (somaIdade / quantidadeEntrevistas);
            System.out.println("A média das idades é: ");
            System.out.println(mediaIdade);
        }
    }

}
