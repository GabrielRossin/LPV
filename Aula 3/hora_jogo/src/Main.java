import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        int ini;
        int fim;
        int duracao;
        Scanner input = new Scanner(System.in);

        System.out.println("Insira a hora que começou o jogo");
        ini = input.nextInt();

        System.out.println("Insira a hora que acabou o jogo");
        fim = input.nextInt();

        if(ini >= fim)
        {
            duracao = (24 - ini) + fim;
        }
        else
        {
            duracao = fim - ini;
        }
        System.out.println("O JOGO DUROU:"+duracao+" Hora(s)");

    }
}
