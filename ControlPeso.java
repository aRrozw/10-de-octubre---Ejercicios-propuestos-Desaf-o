import java.util.Scanner;

public class ControlPeso {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double peso;
        double exceso;

        System.out.print("Ingrese el peso del paquete en kg: ");
        peso = entrada.nextDouble();

        if (peso <= 50) {
            System.out.println("Paquete aceptado.");
        } else {
            exceso = peso - 50;
            System.out.println("Paquete rechazado.");
            System.out.println("Excede el limite por " + exceso + " kg.");
        }

        entrada.close();
    }
}