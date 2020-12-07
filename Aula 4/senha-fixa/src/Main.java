import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        int senha;
        int senhaC = 2002;
        Scanner input = new Scanner(System.in);

        do
        {
            System.out.println("Insira a senha");
            senha = input.nextInt();

            if (senha != senhaC)
            {
                System.out.println("Senha inválida");
            }
            else
            {
                System.out.println("Acesso permitido");
            }

        }while(senha != senhaC );



    }
}
