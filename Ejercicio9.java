import java.util.Scanner;
public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Introduzca el radio del cono: ");
        double radio = sc.nextDouble();
        System.out.printf("Introduzca la altura del cono: ");
        double altura = sc.nextDouble();
        double total = ((3.14*(radio*radio)*altura)/3);
        System.out.printf("El area del cono es: "+total+ "cm");
        sc.close();

    }
}
