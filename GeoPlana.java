
public class GeoPlana extends Geometrica {
    private double base;
    private double altura;
    private double lado;
    private double diaMaior;
    private double diaMenor;
    private double baseMaior;
    private double baseMenor;
    private double raio;

    public double quadrado(double base, double altura) {
        return base * altura;
    }

    public double triangulo(double base, double altura) {
        return (base * altura) / 2;
    }

    public double equilatero(double lado) {
        return (Math.pow(lado, 2) * Math.sqrt(3)) / 4;
    }

    public double paralelo(double base, double altura) {
        return base * altura;
    }

    public double losango(double diaMaior, double diaMenor) {
        return (diaMaior * diaMenor) / 2;
    }

    public double trapezio(double baseMaior, double baseMenor, double altura) {
        return ((baseMaior + baseMenor) * altura) / 2;
    }

    public double circulo(double raio) {
        return Math.PI * Math.pow(raio, 2);
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
