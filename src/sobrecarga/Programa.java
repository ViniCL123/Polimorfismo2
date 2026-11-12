package sobrecarga;

public class Programa {

    public static void main(String[] args) {
        CalculadoraAreas calc = new CalculadoraAreas();
        System.out.println(calc.calcularArea(5));
        System.out.println(calc.calcularArea(4, 5));
        System.out.println(calc.calcularArea(6.3));
    }



}
