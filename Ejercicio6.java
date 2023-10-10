import java.util.Scanner;
public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Introduce la altura del triángulo que desesa calcular en cm: ");
        double altura = sc.nextDouble();
        System.out.printf("Introduzca la base del triángulo que desea calcular en cm: ");
        double base =sc.nextDouble();
        System.out.printf("El area del triángulo es: "+((altura*base)/2));
        sc.close();
    }
}