import java.lang.Math;

public class GeoEspacial extends Geometrica {
    public double calcularAreaCirculo(double raio) {
        return Math.PI * Math.pow(raio, 2);
    }

    public double calcularAreaRetangulo(double base, double altura) {
        return base * altura;
    }

    public double calcularAreaTriangulo(double base, double altura) {
        return (base * altura) / 2;
    }

    public double calcularAreaQuadrado(double lado) {
        return Math.pow(lado, 2);
    }

    public double calcularPerimetroCirculo(double raio) {
        return 2 * Math.PI * raio;
    }

    public double calcularPerimetroRetangulo(double base, double altura) {
        return 2 * (base + altura);
    }

    public double calcularPerimetroTriangulo(double lado1, double lado2, double lado3) {
        return lado1 + lado2 + lado3;
    }

    public double calcularPerimetroQuadrado(double lado) {
        return 4 * lado;
    }

    public double calcularAreaTotal(double... areas) {
        double areaTotal = 0.0;
        for (double area : areas) {
            areaTotal += area;
        }
        return areaTotal;
    }

    @Override
    public double calcularArea() {
        // Implementação específica não definida
        return 0;
    }

    @Override
    public double calcularPerimetro() {
        // Implementação específica não definida
        return 0;
    }
}
