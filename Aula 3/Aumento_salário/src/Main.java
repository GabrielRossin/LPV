import java.util.Scanner;


public class Main
{
    public static void main(String[] args)
    {
        double salario;
        double novo_salario = 0;
        double reajuste;
        int percentual = 0;
        Scanner input = new Scanner(System.in);

        System.out.println("Insira seu atual salário");
        salario = input.nextDouble();

        if (salario <= 400)
        {
            novo_salario = salario * 1.15;
            percentual = 15;
        }
        else
        {
            if (salario > 400 && salario <= 800)
            {
                novo_salario = salario * 1.12;
                percentual = 12;
            }
            else
            {
                if (salario > 800 && salario <= 1200)
                {
                    novo_salario = salario * 1.10;
                    percentual = 10;
                }
                else
                {
                    if (salario > 1200 && salario < 2000)
                    {
                        novo_salario = salario * 0.07;
                        percentual = 7;
                    }
                    else
                    {
                        if (salario > 2000)
                        {
                            novo_salario = salario * 0.04;
                            percentual = 4;
                        }
                    }
                }
            }
        }

        reajuste = novo_salario - salario;



        System.out.println("Novo salário: "+ Math.ceil(novo_salario));
        System.out.println("Reajuste ganho: " +Math.ceil(reajuste));
        System.out.println("Em percentual: " +percentual+ "%");



    }
}
