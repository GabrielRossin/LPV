import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        double n1;
        double n2;
        double n3;
        double n4;
        double media;
        double final_media;
        double exame;


        Scanner input = new Scanner(System.in);

        System.out.println("Insira a nota 1 do aluno");
        n1 = input.nextDouble();
        n1 = n1 * 0.2;


        System.out.println("Insira a nota 2 do aluno");
        n2 = input.nextDouble();
        n2 = n2 * 0.3;


        System.out.println("Insira a nota 3 do aluno");
        n3 = input.nextDouble();
        n3 = n3 * 0.4;


        System.out.println("Insira a nota 4 do aluno");
        n4 = input.nextDouble();
        n4 = n4 * 0.1;


        media = n1 + n2 + n3 + n4;



        if(media >= 7)
        {
            System.out.println("Média: " +Math.ceil(media));
            System.out.println("Aluno Aprovado");
        }
        else
        {
            if(media < 5)
            {
                System.out.println("Média: " +Math.ceil(media));
                System.out.println("Aluno Reprovado");
            }
            else
            {
                if (media >= 5 && media < 7)
                {
                    System.out.println("Média: " +Math.ceil(media));
                    System.out.println("Aluno em exame");
                    System.out.println("            ");
                    System.out.println("Insira a nota do exame:");
                    exame = input.nextDouble();
                    final_media = (media + exame) / 2;

                    if (final_media >= 5)
                    {
                        System.out.println("Exame: " +Math.ceil(exame));
                        System.out.println("Aluno aprovado");
                        System.out.println("Média Final: " +Math.ceil(final_media));
                    }

                    else
                    {
                        System.out.println("Exame: " +Math.ceil(exame));
                        System.out.println("Aluno reprovado");
                        System.out.println("Média Final: " +Math.ceil(final_media));
                    }
                }
            }
        }






    }
}
