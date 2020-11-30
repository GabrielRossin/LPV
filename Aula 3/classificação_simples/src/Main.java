import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        int i;
        int cont1;
        int cont2;
        int menor;
        int maior;
        int medio;

        int [] num;
        num = new int[3];


        for (i = 0; i < 3; i++)
        {
            System.out.println("Insira um valor inteiro: ");
            num[i] = input.nextInt();

        }
        menor = num[0];
        maior = num[0];
        medio = num[0];
        cont1 = 0;
        cont2 = 0;



        for (i = 1; i < 3; i++)
        {
            if (num[i] < menor)
            {
                if (cont1 > 0)
                {
                    medio = menor;
                }
                menor = num[i];
                cont1++;

            }
            if (num[i] > maior)
            {
                if (cont2 > 0)
                {
                    medio = maior;
                }
                maior = num[i];
                cont2++;
            }
            if(num[i] > menor && num[i] < maior)
            {
                medio = num[i];
            }



        }

        System.out.println(menor);
        System.out.println(medio);
        System.out.println(maior);
        System.out.println("               ");
        for(i = 0; i < 3; i++)
        {
            System.out.println(num[i]);
        }







    }
}
