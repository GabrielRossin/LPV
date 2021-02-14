import java.util.Random;
import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int miniun = 0;
        int plusle = 0;
        int zero = 0;
        int num;
        int count;

        System.out.println("Insira 5 números");
        for(count = 0; count < 5; count++)
        {
            System.out.printf("\nInsira o %d º número: ",count+1);
            num = input.nextInt();
            if(num < 0)
            {
                miniun++;
            }
            else
            {
                if(num > 0)
                {
                    plusle++;
                }
                else
                {
                    zero++;
                }
            }
        }
        System.out.println("A quantidade de Número positivos foi de:" +plusle);
        System.out.println("A quantidade de números negativos foi de:" +miniun);
        System.out.println("A quantidade de zeros foi de:" +zero);


    }
}
