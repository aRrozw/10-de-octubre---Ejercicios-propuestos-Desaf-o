import java.util.Scanner;

public class ComparacionTresNumeros {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double num1, num2, num3;
        double mayor, menor, diferencia;

        System.out.print("Ingrese el primer numero: ");
        num1 = entrada.nextDouble();

        System.out.print("Ingrese el segundo numero: ");
        num2 = entrada.nextDouble();

        System.out.print("Ingrese el tercer numero: ");
        num3 = entrada.nextDouble();

        if (num1 >= num2 && num1 >= num3) {
            mayor = num1;
        } else if (num2 >= num1 && num2 >= num3) {
            mayor = num2;
        } else {
            mayor = num3;
        }

        if (num1 <= num2 && num1 <= num3) {
            menor = num1;
        } else if (num2 <= num1 && num2 <= num3) {
            menor = num2;
        } else {
            menor = num3;
        }

        diferencia = mayor - menor;

        System.out.println("Numero mayor: " + mayor);
        System.out.println("Numero menor: " + menor);
        System.out.println("Diferencia: " + diferencia);

        entrada.close();
    }
}