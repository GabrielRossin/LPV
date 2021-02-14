import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        double valor1;
        double valor2;
        Scanner input = new Scanner(System.in);
        Calculadora c1 = new Calculadora();

        System.out.println("Insira o primeiro número da operação");
        valor1 = input.nextDouble();

        System.out.println("Insira o segundo número da operação");
        valor2 = input.nextDouble();

        c1.dividir(valor1 , valor2);
        c1.multi(valor1 , valor2);
        c1.somar(valor1 , valor2);
        c1.subtracao(valor1 , valor2);




    }
}
