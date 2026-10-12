import java.util.Scanner;

public class SistemaPagoEmpleados {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double horasTrabajadas;
        double pagoPorHora;
        double salarioBruto;
        double impuesto;
        double bono;
        double salarioNeto;

        System.out.print("Ingrese las horas trabajadas: ");
        horasTrabajadas = entrada.nextDouble();

        System.out.print("Ingrese el pago por hora: S/");
        pagoPorHora = entrada.nextDouble();

        salarioBruto = horasTrabajadas * pagoPorHora;

        if (salarioBruto > 2500) {
            impuesto = salarioBruto * 0.12;
        } else {
            impuesto = salarioBruto * 0.07;
        }

        if (horasTrabajadas > 48) {
            bono = 300;
        } else {
            bono = 0;
        }

        salarioNeto = salarioBruto - impuesto + bono;

        System.out.println("\n----- BOLETA DE PAGO -----");
        System.out.println("Salario bruto: S/" + salarioBruto);
        System.out.println("Impuesto: S/" + impuesto);
        System.out.println("Bono: S/" + bono);
        System.out.println("Salario neto: S/" + salarioNeto);

        entrada.close();
    }
}