import java.util.Scanner;
public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca la cantidad de euros que desea introducir: ");
        double euros = sc.nextDouble();
        System.out.printf("%.2f euros son %d pesetas: ", euros, (int)Math.round(euros*166.366));
        sc.close();
    } 
    
}
