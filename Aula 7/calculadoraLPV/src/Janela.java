import javax.swing.*;

public class Janela extends Calculadora
{
    public Double n1;
    public Double n2;
    public Double resul;
    public int operador;
    public int conti;
    public int newOperacao = 1;
    public int cancel = 0;
    public int finaliza = 0;
    public int liberar = 0;

    public void definirOperando1()
    {

        String number1 = JOptionPane.showInputDialog(null,"Insira o primeiro operando");
        if (number1 == null)
        {
            confirmarCancel();
        }
        else
        {
            this.setN1(Double.parseDouble(number1));
            this.setLiberar(1);
        }


    }

    public void definirOperando2()
    {
        String number2 = JOptionPane.showInputDialog(null,"Insira o segundo operando");
        this.setLiberar(0);
        if (number2 == null)
        {
            confirmarCancel();
        }
        else
        {
            this.setN2(Double.parseDouble(number2));
            this.setLiberar(1);
        }

    }

    public void definirOperacao()
    {
        this.setLiberar(0);
        Object[] options = {"Soma", "Subtração", "Divisão", "Multiplicação", "Resto da divisão"};
        this.setOperador(JOptionPane.showOptionDialog(null, "Qual operaçao vai ser realizada",
                         "", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options,
                          options[0]));

        if(this.getOperador() == -1)
        {
            confirmarCancel();
        }
        else
        {
            this.setLiberar(1);
        }

    }

    public void exibirResultado()
    {
        if (this.getOperador() == 0)
        {
            this.setResul(somar(getN1() , getN2()));
             JOptionPane.showMessageDialog(null,+ getN1()+ " + " + getN2() + " = " + getResul());
        }
        else
        {
            if (this.getOperador() == 1)
            {
                this.setResul(subtrair(getN1() , getN2()));
                JOptionPane.showMessageDialog(null,+ getN1()+ " - " + getN2() + " = " + getResul());
            }
            else
            {
                if (this.getOperador() == 2)
                {
                    this.setResul(dividir(getN1() , getN2()));
                    JOptionPane.showMessageDialog(null,+ getN1()+ " / " + getN2() + " = " + getResul());
                }
                else
                {
                    if (this.getOperador() == 3)
                    {
                        this.setResul(multiplicar(getN1() , getN2()));
                        JOptionPane.showMessageDialog(null,+ getN1()+ " * " + getN2() + " = " + getResul());
                    }
                    else
                    {
                        if (this.getOperador() == 4)
                        {
                            this.setResul(restoDiv(getN1() , getN2()));
                            JOptionPane.showMessageDialog(null,"O resto da divisão entre " + getN1() + " e " + getN2() + " = " + getResul());
                        }
                    }
                }
            }

        }

    }

    public void continuar()
    {

        this.setLiberar(0);

        Object[] options = {"Sim","Não"};

        this.setConti(JOptionPane.showOptionDialog(null, "Deseja realizar uma outra operação usando os mesmos numerandos",
                "", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options,
                options[0]));

        if(getConti() == -1)
        {
            confirmarCancel();
        }
        else
        {
            if (getConti() == 0)
            {
                definirOperacao();
                exibirResultado();
                this.setLiberar(0);
                this.setCancel(1);
            }
            else
            {
                this.setLiberar(1);
            }
        }



    }

    public void novaOperacao()
    {

        this.setLiberar(0);

        Object[] options = {"Sim","Não"};

        this.setNewOperacao(JOptionPane.showOptionDialog(null, "Deseja realizar uma nova operação com números diferentes ? ",
                "", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options,
                options[0]));

        if(getNewOperacao() == -1)
        {
            confirmarCancel();
        }
        else
        {
            if (getNewOperacao() == 0)
            {
                this.setFinaliza(0);
                this.setLiberar(-7);
                this.setCancel(0);
            }
            else
            {

                this.setFinaliza(1);
                this.setLiberar(-7);
                this.setCancel(0);
            }


        }



    }

    public void confirmarCancel()
    {

        Object[] options = {"Sim","Não"};

        this.setCancel(JOptionPane.showOptionDialog(null, "Deseja realmente cancelar ?",
                "", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options,
                options[0]));

        if(getCancel() == 0)
        {
            this.setFinaliza(1);
            this.setLiberar(-7);
            this.setCancel(0);
        }


    }


    public Double getN1() {
        return n1;
    }

    public void setN1(Double n1) {
        this.n1 = n1;
    }

    public Double getN2() {
        return n2;
    }

    public void setN2(Double n2) {
        this.n2 = n2;
    }

    public int getOperador() {
        return operador;
    }

    public void setOperador(int operador) {
        this.operador = operador;
    }

    public Double getResul() {
        return resul;
    }

    public void setResul(Double resul) {
        this.resul = resul;
    }

    public int getConti() {
        return conti;
    }

    public void setConti(int conti) {
        this.conti = conti;
    }

    public int getCancel() {
        return cancel;
    }

    public void setCancel(int cancel) {
        this.cancel = cancel;
    }

    public int getNewOperacao() {
        return newOperacao;
    }

    public void setNewOperacao(int newOperacao) {
        this.newOperacao = newOperacao;
    }

    public int getLiberar() {
        return liberar;
    }

    public void setLiberar(int liberar) {
        this.liberar = liberar;
    }

    public int getFinaliza() {
        return finaliza;
    }

    public void setFinaliza(int finaliza) {
        this.finaliza = finaliza;
    }
}
