import java.util.Scanner;

public class CalculoSalario {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double pagoHora = 20.0;
        double salario;
        int horasTrabajadas;

        System.out.print("Ingrese las horas trabajadas: ");
        horasTrabajadas = entrada.nextInt();

        if (horasTrabajadas > 40) {
            salario = (40 * pagoHora)
                    + ((horasTrabajadas - 40) * pagoHora * 2);
        } else {
            salario = horasTrabajadas * pagoHora;
        }

        System.out.println("Horas trabajadas: " + horasTrabajadas);
        System.out.println("Salario total: S/" + salario);

        entrada.close();
    }
}