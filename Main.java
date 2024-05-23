
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
                // Exemplo de cálculo com figuras planas
                System.out.print("Escolha a figura geométrica (quadrado, triangulo, equilatero, paralelo, losango, trapezio, circulo): ");
                String tipoFigura = scanner.nextLine();

                switch (tipoFigura.toLowerCase()) {
                    case "quadrado" -> {
                        System.out.print("Digite o valor da base do quadrado: ");
                        double baseQuadrado = scanner.nextDouble();
                        System.out.print("Digite o valor da altura do quadrado: ");
                        double alturaQuadrado = scanner.nextDouble();
                        System.out.println("A área do quadrado é: " + geoPlana.quadrado(baseQuadrado, alturaQuadrado));
                    }
                    case "triangulo" -> {
                        System.out.print("Digite o valor da base do triângulo: ");
                        double baseTriangulo = scanner.nextDouble();
                        System.out.print("Digite o valor da altura do triângulo: ");
                        double alturaTriangulo = scanner.nextDouble();
                        System.out.println("A área do triângulo é: " + geoPlana.triangulo(baseTriangulo, alturaTriangulo));
                    }
                    case "equilatero" -> {
                        System.out.print("Digite o valor do lado do triângulo equilátero: ");
                        double ladoEquilatero = scanner.nextDouble();
                        System.out.println("A área do triângulo equilátero é: " + geoPlana.equilatero(ladoEquilatero));
                    }
                    case "paralelo" -> {
                        System.out.print("Digite o valor da base do paralelogramo: ");
                        double baseParalelo = scanner.nextDouble();
                        System.out.print("Digite o valor da altura do paralelogramo: ");
                        double alturaParalelo = scanner.nextDouble();
                        System.out.println("A área do paralelogramo é: " + geoPlana.paralelo(baseParalelo, alturaParalelo));
                    }
                    case "losango" -> {
                        System.out.print("Digite o valor do diâmetro maior do losango: ");
                        double diaMaiorLosango = scanner.nextDouble();
                        System.out.print("Digite o valor do diâmetro menor do losango: ");
                        double diaMenorLosango = scanner.nextDouble();
                        System.out.println("A área do losango é: " + geoPlana.losango(diaMaiorLosango, diaMenorLosango));
                    }
                    case "trapezio" -> {
                        System.out.print("Digite o valor da base maior do trapézio: ");
                        double baseMaiorTrapezio = scanner.nextDouble();
                        System.out.print("Digite o valor da base menor do trapézio: ");
                        double baseMenorTrapezio = scanner.nextDouble();
                        System.out.print("Digite o valor da altura do trapézio: ");
                        double alturaTrapezio = scanner.nextDouble();
                        System.out.println("A área do trapézio é: " + geoPlana.trapezio(baseMaiorTrapezio, baseMenorTrapezio, alturaTrapezio));
                    }
                    case "circulo" -> {
                        System.out.print("Digite o valor do raio do círculo: ");
                        double raioCirculo = scanner.nextDouble();
                        System.out.println("A área do círculo é: " + geoPlana.circulo(raioCirculo));
                    }
                    default -> System.out.println("Tipo de figura geométrica não reconhecido.");
                }
                scanner.nextLine(); // Limpar o buffer do scanner
            } else if (figura.equalsIgnoreCase("espacial")) {
                GeoEspacial geoEspacial = new GeoEspacial();
                // Exemplo de cálculo com figuras espaciais
                System.out.print("Escolha a figura geométrica (circulo, retangulo, triangulo, quadrado): ");
                String tipoFigura = scanner.nextLine();

                switch (tipoFigura.toLowerCase()) {
                    case "circulo" -> {
                        System.out.print("Digite o valor do raio do círculo: ");
                        double raio = scanner.nextDouble();
                        System.out.println("A área do círculo é: " + geoEspacial.calcularAreaCirculo(raio));
                    }
                    case "retangulo" -> {
                        System.out.print("Digite o valor da base do retângulo: ");
                        double baseRetangulo = scanner.nextDouble();
                        System.out.print("Digite o valor da altura do retângulo: ");
                        double alturaRetangulo = scanner.nextDouble();
                        System.out.println("A área do retângulo é: " + geoEspacial.calcularAreaRetangulo(baseRetangulo, alturaRetangulo));
                    }
                    case "triangulo" -> {
                        System.out.print("Digite o valor da base do triângulo: ");
                        double baseTrianguloEspacial = scanner.nextDouble();
                        System.out.print("Digite o valor da altura do triângulo: ");
                        double alturaTrianguloEspacial = scanner.nextDouble();
                        System.out.println("A área do triângulo é: " + geoEspacial.calcularAreaTriangulo(baseTrianguloEspacial, alturaTrianguloEspacial));
                    }
                    case "quadrado" -> {
                        System.out.print("Digite o valor do lado do quadrado: ");
                        double ladoQuadrado = scanner.nextDouble();
                        System.out.println("A área do quadrado é: " + geoEspacial.calcularAreaQuadrado(ladoQuadrado));
                    }
                    default -> System.out.println("Tipo de figura geométrica não reconhecido.");
                }
                scanner.nextLine(); // Limpar o buffer do scanner
            } else {
                System.out.println("Tipo de figura geométrica não reconhecido.");
            }

            System.out.print("Deseja calcular outra figura geométrica? (sim/não) ");
            String resposta = scanner.nextLine();
            continuar = resposta.equalsIgnoreCase("sim");
        }

        System.out.println("Obrigado por usar nosso app. Volte sempre!!!");
        scanner.close();
    }
}


