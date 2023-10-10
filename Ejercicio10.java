import java.util.Scanner;
public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Introduzca los Mb: ");
        int Mb = sc.nextInt();
        System.out.printf("Los Mb introducidos equivalen a: "+(Mb*1000)+" " + "Kb");
        sc.close();
    }
}
