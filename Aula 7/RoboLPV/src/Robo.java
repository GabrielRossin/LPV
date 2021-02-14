import javax.swing.*;

public class Robo
{
    public String nome;
    public int codX;
    public int codY;
    public int direcao = 0;
    public String direcaoAtual;
    public String codX1;
    public String codY1;
    public int passos;
    public int veri = 0;
    public int ini;
    public int libera = 0;
    public int travarInicio = 1;

    public void inicial()
    {
        Object[] options = {"Novo robô", "Andar com o robô", "Consultar dados", "Alterar Direçao","Sair"};

        this.setIni(JOptionPane.showOptionDialog(null, ""
                    , "", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options,
                    options[0]));

        if (getIni() == 0 && getTravarInicio() == 1)
        {
            criaRobo();
            this.setLibera(1);
            this.setTravarInicio(0);

        }
        else
        {
            if(getTravarInicio() == 0 && getIni() == 0)
            {
                JOptionPane.showMessageDialog(null,"Já existe um robô criado");
            }
        }

        if(getIni() == 1)
        {
            if (getLibera() == 0)
            {
                JOptionPane.showMessageDialog(null,"Error: Robo não criado");

            }
            else
            {
                andar();

            }
        }
        else
        {
            if(getIni() == 2)
            {
                consultar();

            }
            if (getIni() == 3)
            {
                alterarDirecao();
            }
            if(getIni() == 4)
            {
                this.setLibera(2);

            }
        }

    }

    public void criaRobo()
    {
        UIManager.put("OptionPane.cancelButtonText", "Consutar dados");
        this.setNome(JOptionPane.showInputDialog("Digite o nome do robo"));
        while (getNome() == null)
        {
            consultar();
            this.setNome(JOptionPane.showInputDialog("Digite o nome do robo"));

        }
        this.setCodX1(JOptionPane.showInputDialog("Digite a coordenada X"));
        while (getCodX1() == null)
        {
            consultar();
            this.setCodX1(JOptionPane.showInputDialog("Digite a coordenada X"));

        }
        this.setCodX(Integer.parseInt(getCodX1()));

        this.setCodY1(JOptionPane.showInputDialog("Digite a coordenada Y"));
        while (getCodY1() == null)
        {
            consultar();
            this.setCodY1(JOptionPane.showInputDialog("Digite a coordenada Y"));

        }
        this.setCodY(Integer.parseInt(getCodY1()));

        Object[] options = {"Norte", "Sul", "Leste", "Oeste","Consultar dados"};
        this.setDirecao(JOptionPane.showOptionDialog(null, "Digite a direção atual do robô", "Entrada", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]));

        while(getDirecao() == 4)
        {
            consultar();
            this.setDirecao(JOptionPane.showOptionDialog(null, "Digite a direção atual do robô", "Entrada", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]));

        }
        upDirecao();
        consultar();
    }

    public void upDirecao()
    {
        switch (this.getDirecao())
        {
            case 0:
            {
                this.setDirecaoAtual("Norte");
                break;
            }

            case 1:
            {
                this.setDirecaoAtual("Sul");
                break;
            }

            case 2:
            {
                this.setDirecaoAtual("Leste");
                break;
            }

            case 3:
            {
                this.setDirecaoAtual("Oeste");
                break;
            }


        }
    }

    public void verificar()
    {
        if(getPassos() < 0)
        {
            JOptionPane.showMessageDialog(null,"Valor incorreto");
        }
        else
        {
            this.setVeri(1);
        }
    }

    public void andar()
    {
        String passos = JOptionPane.showInputDialog(null,"Insira a quantidada de passos");
        while (passos == null)
        {
            consultar();
            passos = JOptionPane.showInputDialog(null,"Insira a quantidada de passos");
        }
        this.setPassos(Integer.parseInt(passos));
        verificar();

        if (getVeri() == 1)
        {
            Object[] options = {"Norte", "Sul", "Leste", "Oeste","consultar dados"};

            this.setDirecao(JOptionPane.showOptionDialog(null, "Para qual direção o robô deve seguir?"
                    , "Entrada", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options,
                    options[0]));

            while (getDirecao() == 4)
            {
                switch (getDirecao())
                {
                    case 0:
                    {
                        this.setCodY(this.getCodY() + this.getPassos());
                        break;
                    }
                    case 1:
                    {
                        this.setCodY(this.getCodY() - this.getPassos());
                        break;
                    }
                    case 2:
                    {
                        this.setCodX(this.getCodX() + this.getPassos());
                        break;
                    }
                    case 3:
                    {
                        this.setCodX(this.getCodX() - this.getPassos());
                        break;
                    }
                    case 4:
                    {
                        consultar();
                        this.setDirecao(JOptionPane.showOptionDialog(null, "Para qual direção o robô deve seguir?"
                                , "Entrada", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options,
                                options[0]));
                        break;
                    }
                }

            }
            upDirecao();
             consultar();
        }
    }

    public void alterarDirecao()
    {
        Object[] options = {"Norte", "Sul", "Leste", "Oeste","Consultar dados"};
        this.setDirecao(JOptionPane.showOptionDialog(null, "Digite a direção atual do robô", "Entrada", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]));

        while(getDirecao() == 4)
        {
            consultar();
            this.setDirecao(JOptionPane.showOptionDialog(null, "Digite a direção atual do robô", "Entrada", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]));

        }
        upDirecao();
        consultar();

    }
    public void consultar()
    {

        JOptionPane.showMessageDialog(null," Nome: " + getNome() + "\n Coordenada X: " +getCodX() +
                                        "\n Coordenada Y: " +getCodY()  + "\n Direção: " +getDirecaoAtual() );


    }

    public String getNome()
    {
        return nome;
    }

    public void setNome(String nome)
    {
        this.nome = nome;
    }

    public int getCodX()
    {
        return codX;
    }

    public void setCodX(int codX)
    {
        this.codX = codX;
    }

    public int getCodY()
    {
        return codY;
    }

    public void setCodY(int codY)
    {
        this.codY = codY;
    }

    public int getDirecao()
    {
        return direcao;
    }

    public void setDirecao(int direcao)
    {
        this.direcao = direcao;
    }

    public int getPassos()
    {
        return passos;
    }

    public void setPassos(int passos)
    {
        this.passos = passos;
    }

    public int getVeri()
    {
        return veri;
    }

    public void setVeri(int veri)
    {
        this.veri = veri;
    }

    public String getDirecaoAtual()
    {
        return direcaoAtual;
    }

    public void setDirecaoAtual(String direcaoAtual)
    {
        this.direcaoAtual = direcaoAtual;
    }

    public int getIni()
    {
        return ini;
    }

    public void setIni(int ini)
    {
        this.ini = ini;
    }

    public String getCodX1()
    {
        return codX1;
    }

    public void setCodX1(String codX1)
    {
        this.codX1 = codX1;
    }

    public int getLibera()
    {
        return libera;
    }

    public void setLibera(int libera)
    {
        this.libera = libera;
    }

    public int getTravarInicio()
    {
        return travarInicio;
    }

    public void setTravarInicio(int travarInicio)
    {
        this.travarInicio = travarInicio;
    }

    public String getCodY1()
    {
        return codY1;
    }

    public void setCodY1(String codY1)
    {
        this.codY1 = codY1;
    }
}
