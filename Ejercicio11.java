import java.util.Scanner;
public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Introduzca los Kb: ");
        int Kb = sc.nextInt();
        System.out.printf("Los Kb introducidos equivalen a: "+(Kb/1000)+" " + "Mb");
        sc.close();
    }
}