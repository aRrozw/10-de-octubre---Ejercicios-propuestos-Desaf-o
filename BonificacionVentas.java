import java.util.Scanner;

public class BonificacionVentas {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double ventas;
        double bonificacion;
        double total;

        System.out.print("Ingrese el monto de ventas: S/");
        ventas = entrada.nextDouble();

        if (ventas > 5000) {
            bonificacion = ventas * 0.10;
        } else {
            bonificacion = ventas * 0.05;
        }

        total = ventas + bonificacion;

        System.out.println("Monto de ventas: S/" + ventas);
        System.out.println("Bonificacion: S/" + bonificacion);
        System.out.println("Total con bonificacion: S/" + total);

        entrada.close();
    }
}