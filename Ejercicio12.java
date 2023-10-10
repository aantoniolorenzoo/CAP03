import java.util.Scanner;
public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Introduce la nota del primer examen: ");
        double PrimerNota = sc.nextDouble();
        System.out.printf("¿Qué nota quieres sacar en el trimestre? ");
        double notaTotal = sc.nextDouble();
        double notaCalculada ;
        notaCalculada =(((notaTotal)-(PrimerNota *0.40))/0.60);
        System.out.printf("Para tener un"+" "+notaTotal+ " "+"en el trimestre necesitas sacar un "+notaCalculada );
        sc.close();
    }
}
