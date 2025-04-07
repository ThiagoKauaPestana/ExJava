public class TestaCirculo {
    public static void main(String[] args) {
        Circulo circulo = new Circulo(10);

        double area = circulo.calcularArea();
        System.out.printf("A area do circulo é: %.2f\n", area);

        
        double perimetro = circulo.calcularPerimetro();
        System.out.printf("O perimetro do círculo é: %.2f\n", perimetro);
    }
}