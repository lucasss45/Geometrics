import java.lang.Math;
import java.util.Scanner;



public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String figura;
        boolean continuar = true;

        while (continuar) {
            // Limpa o console antes de cada execução
            System.out.print("\033[H\033[2J");
            System.out.flush();

            System.out.println("Bem-vindo ao app de cálculo de formas geométricas!");

            System.out.print("Qual figura geométrica você gostaria de calcular (plana/espacial)? ");
            figura = scanner.nextLine();

            if (figura.equalsIgnoreCase("plana")) {
                GeoPlana geoPlana = new GeoPlana();
                // Chamar método para calcular área
                System.out.println("A área é: " + geoPlana.calcularArea());
            } else if (figura.equalsIgnoreCase("espacial")) {
                GeoEspacial geoEspacial = new GeoEspacial();
                // Chamar método para calcular volume
                System.out.println("O volume é: " + geoEspacial.calcularVolume());
            } else {
                System.out.println("Tipo de figura geométrica não reconhecido.");
            }

            System.out.print("Deseja calcular outra figura geométrica? (sim/não) ");
            String resposta = scanner.nextLine();
            continuar = resposta.equalsIgnoreCase("sim");
        }

        System.out.println("Obrigado por vir e usar nosso app. Volte Sempre!");
        scanner.close();
    }
}