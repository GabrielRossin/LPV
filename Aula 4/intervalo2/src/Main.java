import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        int n ;
        int i;
        int resp;
        int libera;

        int contIntervalo = 0; //conta quantos valores estão dentro do intervalo [10,20]
        int contFIntervalo = 0; //conta quantos valores estão fora do intervalo [10,20]

        Scanner input = new Scanner(System.in);



        do
        {
            libera = 0;
            System.out.println("Insira quantos número serão lido - valor deve ser < 10000 ");
            n = input.nextInt();

            if (n >= 10000)
            {
                do
                {
                    System.out.println("ERRO");
                    System.out.println("Você inseriu um valor invalido");
                    System.out.println("Deseja tentar novamente [1-sim | 2-não]");
                    resp = input.nextInt();

                    if (resp == 1)
                    {
                        libera = 1;
                    }
                    else
                    {
                        libera = 2;
                    }


                }while(resp < 1 || resp > 2);
            }

        }while(libera == 1);

        if(libera != 2)
        {
            int [] num = new int[n];

            for(i = 0; i < n; i ++)
            {
                System.out.println("Insira o número");
                num[i] = input.nextInt();

                if (num[i] >= 10 && num[i] <= 20)
                {
                    contIntervalo++;
                }
                else
                {
                    contFIntervalo++;
                }

            }

            System.out.println(contIntervalo + " dentro do intervalo");
            System.out.println(contFIntervalo + " Fora do intervalo");

        }


    }
}
