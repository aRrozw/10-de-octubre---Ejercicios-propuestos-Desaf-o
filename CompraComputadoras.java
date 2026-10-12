import java.util.Scanner;

public class CompraComputadoras {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double precio = 2500;
        double importe;
        double descuento;
        double total;
        int cantidad;

        System.out.print("Ingrese la cantidad de computadoras: ");
        cantidad = entrada.nextInt();

        if (cantidad >= 5) {
            importe = cantidad * precio;
            descuento = importe * 0.12;
        } else {
            importe = cantidad * precio;
            descuento = importe * 0.05;
        }

        total = importe - descuento;

        System.out.println("Importe: S/" + importe);
        System.out.println("Descuento: S/" + descuento);
        System.out.println("Total a pagar: S/" + total);

        entrada.close();
    }
}