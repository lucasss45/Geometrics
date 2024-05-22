
public class calculos {
    double quadrado;
    double triangulo;
    double equilatero;
    double paralelo;
    double losango;
    double trapezio;
    double circulo;
    
    public double quadrado(double Base, double Altura) {
        return (Base * Altura);
    }
    public double triangulo(double Base, double Altura) {
        return (Base * Altura)/2;
    }
    public double equilatero(double Lado) {
        return (((Lado * Lado) * (Math.sqrt(4))) / 4 );
    }
    public double paralelo(double Base, double Altura) {
        return (Base * Altura);
    }
    public double losango(double DiaMaior, double DiaMenor) {
        return ((DiaMaior * DiaMenor)/2 );
    }
    public double trapezio(double BaseMaior, double BaseMenor, double Altura) {
        return (((BaseMaior + BaseMenor) * Altura)/2);
    }
    public double circulo(double PI, double Raio) {
        return ((Raio * Raio) * PI);
    }
    public static void main(String[] args) {
        calculos objeto = new calculos();
        System.out.println(objeto.quadrado(5, 2));
        System.out.println(objeto.triangulo(3, 6));
        System.out.println(objeto.equilatero(3));
    }
}