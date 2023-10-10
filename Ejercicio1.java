import java.util.Scanner;
public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Introduzca el primer número: ");
        int n1 = sc.nextInt();
        System.out.printf("Introduzca el segundo número: ");
        int n2 = sc.nextInt();
        System.out.printf("El resultado de su multiplicación es:  "+(n1*n2));
        sc.close();
    }
}
