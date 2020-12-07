import java.text.DecimalFormat;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {

        int resp;
        double contRato = 0;
        double contCoelho = 0;
        double contSapo = 0;
        double qtde = 0;
        double total;

        double percRato;
        double percCoelho;
        double percSapo;
        String caracter;



        int i;
        Scanner input = new Scanner(System.in);


        System.out.println("Insira o valor dos casos de teste");
        resp = input.nextInt();


        for(i = 0; i < resp; i++)
        {
            do
            {
                //input.nextLine();
                System.out.println("Insira a quantidade do animal ");
                qtde = input.nextInt();
                if (qtde < 1 || qtde >15)
                {
                    System.out.println("Valor invalido");
                    System.out.println("           ");
                }
            }while (qtde < 1 || qtde > 15);
            input.nextLine();
            System.out.println("Insira o caracter do animal ");
            caracter = input.nextLine().toUpperCase();

            if (caracter.equals("C"))
            {
                contCoelho += qtde;
            }
            else
            {
                if (caracter.equals("R"))
                {
                    contRato += qtde;
                }
                else
                {
                    if (caracter.equals("S"))
                    {
                        contSapo += qtde;
                    }

                }
            }

        }

        total = contCoelho + contRato + contSapo;
        percCoelho = (contCoelho * 100) / total;
        percRato = (contRato * 100) / total;
        percSapo = (contSapo * 100) / total;


        System.out.println("Total: " + total );
        System.out.println("Total de coelhos: " + contCoelho);
        System.out.println("Total de ratos: " + contRato);
        System.out.println("Total de sapos: " +contSapo);
        System.out.printf("Percentual de coelhos %.2f %% \n ", percCoelho);
        System.out.printf("Percentual de ratos: %.2f  %% \n", percRato);
        System.out.printf("Percentual de sapos: %.2f %% \n", percSapo);



    }
}
