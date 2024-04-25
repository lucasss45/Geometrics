public class geoEspacial extends geometrica {

    // Método para calcular a área de um círculo
    public double calcularAreaCirculo(double raio) {
        return Math.PI * Math.pow(raio, 2);
    }

    // Método para calcular a área de um retângulo
    public double calcularAreaRetangulo(double base, double altura) {
        return base * altura;
    }

    // Método para calcular a área de um triângulo
    public double calcularAreaTriangulo(double base, double altura) {
        return (base * altura) / 2;
    }

    // Método para calcular a área de um quadrado
    public double calcularAreaQuadrado(double lado) {
        return Math.pow(lado, 2);
    }

    // Método para calcular o perímetro de um círculo
    public double calcularPerimetroCirculo(double raio) {
        return 2 * Math.PI * raio;
    }

    // Método para calcular o perímetro de um retângulo
    public double calcularPerimetroRetangulo(double base, double altura) {
        return 2 * (base + altura);
    }

    // Método para calcular o perímetro de um triângulo
    public double calcularPerimetroTriangulo(double lado1, double lado2, double lado3) {
        return lado1 + lado2 + lado3;
    }

    // Método para calcular o perímetro de um quadrado
    public double calcularPerimetroQuadrado(double lado) {
        return 4 * lado;
    }

    // Método para calcular a área total de várias formas geométricas planas
    public double calcularAreaTotal(double... areas) {
        double areaTotal = 0.0;
        for (double area : areas) {
            areaTotal += area;
        }
        return areaTotal;
    }
}
