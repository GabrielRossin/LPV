import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        int i = 0;
        int cont1;
        int cont2;
        double valor;
        double a;
        double b;
        double c;

        double [] num;
        num = new double[3];



        do
        {
            System.out.println("Insira o lado do triângulo: ");
            valor = input.nextDouble();
            if (valor <= 0)
            {
                System.out.println("Valor inválido");
                System.out.println("\nInsira novamente");
            }
            else
            {
                num[i] = valor;
                i++;
            }

        }while(i < 3);
        a = num[0];
        b = num[0];
        c = num[0];
        cont1 = 0;
        cont2 = 0;



        for (i = 1; i < 3; i++)
        {
            if (num[i] < c)
            {
                if (cont1 > 0)
                {
                    b = c;
                }
                b = num[i];
                cont1++;

            }
            if (num[i] > a)
            {
                if (cont2 > 0)
                {
                    b = a;
                }
                a = num[i];
                cont2++;
            }
            if(num[i] > c && num[i] < a)
            {
                b = num[i];
            }



        }


        if (a >= b+c)
        {
            System.out.println("NÃO FORMA TRIANGULO");
        }
        else
        {
            if(a*a == b*b + c*c)
            {
                System.out.println("TRIANGULO RETANGULO");
            }
            if(a*a > b*b + c*c)
            {
                System.out.println("TRIANGULO OBTUSANGULO");
            }
            if(a*a < b*b + c*c)
            {
                System.out.println("TRIANGULO ACUTANGULO");
            }

            if (a == b && a == c)
            {
               System.out.println("TRIANGULO EQUILATERO");
            }
            if ( (a == b && a != c) || (a == c && a != b) || (b == c && b != a) )
            {
                System.out.println("TRIANGULO ISOSCELES");
            }




        }

    }
}
