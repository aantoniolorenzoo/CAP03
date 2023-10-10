import java.util.Scanner;
public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Introduce la base imponible: "); 
        double baseImponible = sc.nextDouble();
        System.out.printf("IVA:                     %8.2f\n",(baseImponible * 0.21));
        System.out.printf("----------------------------------\n");
        System.out.printf("Total:                    %8.2f\n",(baseImponible * 1.21));
        sc.close();


    }
    
}
