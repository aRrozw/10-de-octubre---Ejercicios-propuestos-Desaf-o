import java.util.Scanner;

public class ConsumoElectrico {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double consumo;
        double monto;

        System.out.print("Ingrese el consumo electrico en kWh: ");
        consumo = entrada.nextDouble();

        if (consumo <= 100) {
            monto = consumo * 0.80;
        } else {
            monto = consumo * 1.20;
        }

        System.out.println("Consumo electrico: " + consumo + " kWh");
        System.out.println("Monto a pagar: S/" + monto);

        entrada.close();
    }
}