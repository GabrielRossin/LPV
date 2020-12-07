
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        double [] num = new double [6];
        double contPlusle = 0;
        double contMinium = 0;
        double sumPlusle = 0;
        double avg;



        int i;
        int error;
        int libera;

        Scanner input = new Scanner(System.in);

        do
        {
            libera = 0;
            for(i = 0; i < num.length; i++)
            {
                System.out.println("Insira um número");
                num[i] = input.nextDouble();

                if (num[i] > 0)
                {
                    contPlusle++;
                    sumPlusle+= num[i];
                }
                else
                {
                    contMinium++;
                }

            }

            if (contMinium == num.length)
            {
                do
                {
                    System.out.println("ERRO");
                    System.out.println("Você inseriu somente valores negativos e/ou nulos");
                    System.out.println("Deseja tentar novamente [1-sim | 2-não]");
                    error = input.nextInt();
                    if (error == 1)
                    {
                        libera = 1;
                        contMinium = 0;
                    }

                }while(error < 1 || error > 2);

            }

        }while(libera != 0);

        if (contMinium == num.length)
        {
            System.out.println("Você não inseriu número negativo");
        }
        else
        {
            avg = sumPlusle / contPlusle;


            System.out.println(contPlusle + " Valores Positivos");
            System.out.printf("média dos valores positivos: %.1f", avg);
        }




    }
}

