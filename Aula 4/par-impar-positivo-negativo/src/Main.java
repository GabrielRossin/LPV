import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        int contPlusle = 0;
        int contMinium = 0;
        int contPar = 0;
        int contImpar = 0;

        int cont = 5;
        int i = 0;

        int num;

        Scanner input = new Scanner(System.in);

        do
        {
            System.out.println("Insira um número");
            num = input.nextInt();

            if (num % 2 == 0)
            {
                contPar++;
                if (num > 0)
                {
                    contPlusle++;
                }
                if(num < 0)
                {
                    contMinium++;
                }
            }
            else
            {
                contImpar++;
                if (num > 0)
                {
                    contPlusle++;
                }
                if (num < 0)
                {

                    contMinium++;
                }

            }

            i++;

        }while(i != cont);

        System.out.println(contPar + " valor (es) par      (es)");
        System.out.println(contImpar + " valor (es) impar    (es)");
        System.out.println(contPlusle + " valor (es) positivo (s )");
        System.out.println(contMinium + " valor (es) negativo (s )");



    }
}

