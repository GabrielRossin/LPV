public class Main
{
    public static void main(String[] args)
    {
            Janela j1 = new Janela();


            do
            {
                j1.definirOperando1();

                if(j1.getLiberar() == 1)
                {
                    do
                    {
                        j1.definirOperando2();

                        if(j1.getLiberar() == 1)
                        {
                            do
                            {
                                j1.definirOperacao();

                                if(j1.getLiberar() == 1)
                                {
                                    do
                                    {
                                        j1.exibirResultado();
                                        if(j1.getLiberar() == 1)
                                        {
                                            do
                                            {
                                                j1.continuar();
                                                if (j1.getLiberar() == 1)
                                                {
                                                    do
                                                    {
                                                        j1.novaOperacao();

                                                    }while (j1.getCancel() == 1 || j1.getLiberar() != -7);
                                                }

                                            }while(j1.getCancel() == 1);
                                        }


                                    }while(j1.getCancel() == 1);
                                }

                            }while(j1.getCancel() == 1);
                        }

                    }while(j1.getCancel() == 1);
                }

            }while(j1.getFinaliza() == 0);



    }
}
