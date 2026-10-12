import java.util.Scanner;

public class PrestamoBancario {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double sueldo;
        double prestamoMaximo;

        System.out.print("Ingrese su sueldo: S/");
        sueldo = entrada.nextDouble();

        if (sueldo >= 3000) {
            prestamoMaximo = sueldo * 5;
        } else {
            prestamoMaximo = sueldo * 2;
        }

        System.out.println("Sueldo: S/" + sueldo);
        System.out.println("Prestamo maximo: S/" + prestamoMaximo);

        entrada.close();
    }
}