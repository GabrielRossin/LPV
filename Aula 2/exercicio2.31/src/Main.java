public class Main
{
    public static void main(String[] args)
    {
        int num;
        int cont;
        int quadrado;
        int cubo;
        System.out.printf("NÚMERO   QUADRADO  CUBO");
        for (cont = 0; cont < 11; cont++ )
        {
            num = cont;
            quadrado = cont * cont;
            cubo = cont * cont * cont;
            if (cont < 4)
            {
                System.out.printf("\n%d        %d         %d", num, quadrado,cubo);
            }
            else
            {
                if(cont < 10)
                {
                    System.out.printf("\n%d        %d        %d", num, quadrado,cubo);
                }
                else
                {
                    System.out.printf("\n%d       %d       %d", num, quadrado,cubo);
                }

            }


        }

    }
}
