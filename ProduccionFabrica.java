import java.util.Scanner;

public class ProduccionFabrica {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int piezas;
        double importe;
        double incentivo;
        double total;

        System.out.print("Ingrese la cantidad de piezas producidas: ");
        piezas = entrada.nextInt();

        if (piezas < 0) {
            System.out.println("Cantidad no valida.");
        } else {
            importe = piezas * 5.0;

            if (piezas > 1000) {
                incentivo = importe * 0.15;
            } else {
                incentivo = importe * 0.08;
            }

            total = importe + incentivo;

            System.out.println("Cantidad de piezas: " + piezas);
            System.out.println("Importe de produccion: S/" + importe);
            System.out.println("Incentivo: S/" + incentivo);
            System.out.println("Total con incentivo: S/" + total);
        }

        entrada.close();
    }
}