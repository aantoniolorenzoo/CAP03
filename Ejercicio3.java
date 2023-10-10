import java.util.Scanner;
public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca la cantidad de pesetas que desea introducir: ");
        double pesetas = sc.nextDouble();
        System.out.printf("%.2f euros son %d pesetas: ", pesetas, (int)Math.round(pesetas/166.366));
        sc.close();
    }
}
