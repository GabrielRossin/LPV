import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        double x;
        double y;
        Scanner input = new Scanner(System.in);

        System.out.println("Insira a coordenada x");
        x = input.nextDouble();

        System.out.println("Insira a coordenada y");
        y = input.nextDouble();

        if (x > 0 && y> 0)
        {
            System.out.println("Q1");
        }
        else
        {
            if (x < 0 && y < 0)
            {
                System.out.println("Q3");
            }
            else
            {
                if(x > 0 && y < 0)
                {
                    System.out.println("Q4");
                }
                else
                {
                    if (x < 0 && y > 0)
                    {
                        System.out.println("Q2");
                    }
                    else
                    {
                        if (x == 0 && y == 0)
                        {
                            System.out.println("Origem");
                        }
                        else
                        {
                            if (x == 0 & y != 0)
                            {
                                System.out.println("Eixo Y");
                            }
                            else
                            {
                                if (x != 0 && y == 0)
                                {
                                    System.out.println("Eixo X");
                                }
                            }
                        }
                    }
                }
            }
        }


    }
}
