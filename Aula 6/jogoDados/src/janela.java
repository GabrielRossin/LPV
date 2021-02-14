import javax.swing.*;


import javax.swing.JOptionPane;


public class janela
{
    public int numb;
    public int numbEX;



    public void jogar()
    {
        UIManager.put("OptionPane.okButtonText", "JOGAR");
        UIManager.put("OptionPane.cancelButtonText", "NOVO JOGO");
        String number = JOptionPane.showInputDialog(null,"Insira o número");


        if(number == null)
        {
            this.setNumb(0);
        }
        else
        {
            numbEX = Integer.parseInt(number);
            if (number.equals(0));
            {
               this.setNumb(-7);
            }
            if(numbEX > 0)
            {
                this.setNumb(Integer.parseInt(number));
            }



        }


    }
    public void confirma()
    {
        UIManager.put("OptionPane.okButtonText", "OK");
        JOptionPane.showMessageDialog(null,"Parabéns! Você acertou","",JOptionPane.PLAIN_MESSAGE);
    }
    public void errou(int tentativas, int num1, int num2)
    {
        if(tentativas >= 1)
        {
            UIManager.put("OptionPane.okButtonText", "OK");
            JOptionPane.showMessageDialog(null,"Você errou. Tentativas restantes: " + tentativas,"",JOptionPane.PLAIN_MESSAGE);
        }
        else
        {
            if (tentativas == 0)
            {
                UIManager.put("OptionPane.okButtonText", "OK");
                JOptionPane.showMessageDialog(null,"Fim de jogo. Dados =  "+ num1 + " e "
                                               + num2,"", JOptionPane.PLAIN_MESSAGE );
            }

        }
    }

    public int getNumb() {
        return numb;
    }

    public void setNumb(int numb) {
        this.numb = numb;
    }


}
