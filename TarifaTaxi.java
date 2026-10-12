import java.util.Scanner;

public class TarifaTaxi {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double kilometros;
        double tarifa;

        System.out.print("Ingrese la distancia recorrida en km: ");
        kilometros = entrada.nextDouble();

        if (kilometros <= 0) {
            System.out.println("Distancia no valida.");
        } else {
            if (kilometros <= 3) {
                tarifa = 8.0;
            } else {
                tarifa = 8.0 + (kilometros - 3) * 2.50;
            }

            System.out.println("Distancia recorrida: " + kilometros + " km");
            System.out.println("Tarifa del taxi: S/" + tarifa);
        }

        entrada.close();
    }
}