import java.util.Scanner;
public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Indique cuantas horas semanalmente has trabajado: ");
        double horas = sc.nextDouble();
        System.out.printf("El salario que le corresponde por las horas trabajadas semanalmente es de: "+(horas *12));
        sc.close();
    }
}
