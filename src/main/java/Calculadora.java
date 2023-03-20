import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1, num2, resultado;
        char operacion;

        System.out.println("Ingrese el primer número: ");
        num1 = input.nextInt();
        System.out.println("Ingrese el segundo número: ");
        num2 = input.nextInt();
        System.out.println("Ingrese la siguente operación a realizar (+, -, *, /): ");
        operacion = input.next().charAt(0);

        switch (operacion) {
            case '+':
                resultado = num1 + num2;
                System.out.println(num1 + " + " + num2 + " = " + resultado);
                break;
            case '-':
                resultado = num1 - num2;
                System.out.println(num1 + " - " + num2 + " = " + resultado);
                break;
            case '*':
                resultado = num1 * num2;
                System.out.println(num1 + " * " + num2 + " = " + resultado);
                break;
            case '/':
                resultado = num1 / num2;
                System.out.println(num1 + " / " + num2 + " = " + resultado);
                break;
            default:
                System.out.println("La operación ingresada no es válida.");
                break;
        }
    }
}
