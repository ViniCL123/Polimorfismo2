package sobrecarga;

public class CalculadoraAreas {

public int calcularArea(int a){
    return a * a;
}

public int calcularArea(int x, int y){
   return x * y;
}

public double calcularArea (double r) {
    return Math.PI * (r * r);
}






}

