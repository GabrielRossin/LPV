import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int num_item;
        int qtde;
        double valor = 0;
        double total;

            System.out.println("\n---------MENU----------");
            System.out.println("1.Cachorro Quente   R$4.00");
            System.out.println("2.X-Salada          R$4.50");
            System.out.println("3.X-Bancon          R$5.00");
            System.out.println("4.Torrada Simples   R$2.00");
            System.out.println("5.Refrigerante      R$1.50");

            System.out.println("\nInsira o número do item a ser comprado:");
            num_item = input.nextInt();

            System.out.println("\nInsira a quantidade do item");
            qtde = input.nextInt();

            if (num_item == 1)
            {
                valor = 4;
            }
            else
            {
                if(num_item == 2)
                {
                    valor = 4.50;
                }
                else
                {
                    if (num_item == 3)
                    {
                        valor = 5;
                    }
                    else
                    {
                        if (num_item == 4)
                        {
                            valor = 2;
                        }
                        else
                        {
                            if (num_item == 5)
                            {
                                valor = 1.50;
                            }
                        }
                    }
                }
            }
            total = qtde * valor;
            System.out.println("Total R$: "+total);
    }
}
