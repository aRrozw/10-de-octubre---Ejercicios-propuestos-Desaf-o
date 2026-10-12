import java.util.Scanner;

public class RendimientoAcademico {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double promedio;

        System.out.print("Ingrese el promedio del alumno (0 a 20): ");
        promedio = entrada.nextDouble();

        if (promedio < 0 || promedio > 20) {
            System.out.println("Promedio no valido.");
        } else if (promedio < 11) {
            System.out.println("Desaprobado");
        } else if (promedio <= 14) {
            System.out.println("Regular");
        } else if (promedio <= 17) {
            System.out.println("Bueno");
        } else {
            System.out.println("Excelente");
        }

        entrada.close();
    }
}