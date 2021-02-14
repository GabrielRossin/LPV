import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        double peso;
        double altura;
        double imc;

        System.out.println("Insira o peso em quilogramas");
        peso = input.nextDouble();

        System.out.println("Insira a altura em metros");
        altura = input.nextDouble();

        imc = peso/(altura * altura);

        System.out.printf("O seu imc é %.2f: ", imc);

        System.out.println("\nCategorias de IMC: Baixo\n" +
                "peso = <18,5\n" +
                "Peso normal = 18,5–24,9\n" +
                "Sobrepeso = 25–29,9\n" +
                "Obesidade = IMC de 30 ou maior");



    }
}
