import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        int cont = 6;
        int i = 0;
        double verifica;
        int contPlusle = 0;
        Scanner input = new Scanner(System.in);

        do
        {
            System.out.println("Insira um número positivo ou negativo ");
            verifica = input.nextDouble();
            if (verifica == 0)
            {
                System.out.println("Valor incorreto");
                System.out.println("Insira novamente");
                System.out.println("                  ");
            }
            else
            {
                i++;
                if (verifica > 0)
                {
                    contPlusle++;
                }
            }
        }while(i != cont);

        System.out.println(contPlusle + " Valores Positivos");



    }
}
