import java.util.Scanner;
public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Introduzca el primer número: ");
        double n1 = sc.nextDouble();
        System.out.printf("Introduzca el segundo número: ");
        double n2 = sc.nextDouble();
        System.out.println("La suma es: "+(n1+n2));
        System.out.println("La resta es: "+(n1-n2));
        System.out.println("La multiplicación es: "+(n1*n2));
        System.out.println("La división es: "+(n1/n2));
        sc.close();
    }
    
    
}
