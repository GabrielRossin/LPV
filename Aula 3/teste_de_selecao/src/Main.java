import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        int a;
        int b;
        int c;
        int d;
        int cont = 0;

        Scanner input = new Scanner(System.in);

        System.out.println("Insira um número inteiro");
        a = input.nextInt();

        System.out.println("Insira um número inteiro");
        b = input.nextInt();

        System.out.println("Insira um número inteiro");
        c = input.nextInt();

        System.out.println("Insira um número inteiro");
        d = input.nextInt();

        if (b > c)
        {
            if (d > a)
            {
                if (c+d > a+b)
                {
                    if (c > 0 && d > 0)
                    {
                        if(a%2 == 0)
                        {
                            cont = 1;
                        }

                    }

                }
            }


        }
        if (cont == 1)
        {
            System.out.println("Valores aceitos");
        }
        else
        {
            System.out.println("Valores não aceitos");
        }


    }





}
