public class Main
{
    public static void main(String[] args)
    {
        janela j1 = new janela();

        Dado dado = new Dado();

        dado.gerar();

        int tentativas = 3;
        int exit = 0;

        j1.jogar();

        do
        {

            if (j1.getNumb() == 0) // se apertar em novo jogo
            {
                dado.gerar();
                j1.jogar();
                tentativas = 3;
                exit = 0;
            }
            else
            {
                if ( (j1.getNumb() == dado.getNum1() || j1.getNumb() == dado.getNum2()) &&  exit == 0)
                {

                    j1.confirma();
                   exit = 1;

                }
                else
                {

                    if(tentativas >= 1 && exit == 0)
                    {
                        tentativas --;
                        j1.errou(tentativas,dado.getNum1(), dado.getNum2());
                        j1.jogar();

                    }
                    else
                    {
                        if (tentativas == 0 && exit == 0)
                        {
                            j1.errou(tentativas, dado.getNum1(), dado.getNum2());
                            tentativas--;
                            exit = 1;
                        }
                    }

                }


            }



        }while(exit == 0);



    }


}
