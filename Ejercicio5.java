import java.util.Scanner;
public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Introduce el largo del rectángulo que desesa calcular en cm: ");
        double largo = sc.nextDouble();
        System.out.printf("Introduzca el ancho del rectángulo que desea calcular en cm: ");
        double ancho =sc.nextDouble();
        System.out.printf("El are del rectángulo es: "+(largo*ancho));
        sc.close();
    }
}
