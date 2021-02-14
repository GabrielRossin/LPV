

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;




public class TelaConfirma extends JFrame
{
    JTextArea caixaDeTexto = new JTextArea();
    JScrollPane scroll = new JScrollPane(caixaDeTexto);
    
    
    public TelaConfirma(int num1 ,int num2 , int soma)
    {
        iniciar(num1 , num2 , soma);
        
    }
    
    public void iniciar(int num1 , int num2 , int soma)
    {
        System.out.println("oi");
        setSize(420,160);
        setLocationRelativeTo(null);
        setVisible(true);
        setResizable(true);
        caixaDeTexto.setEnabled(false);
        add(scroll);
       caixaDeTexto.setText("O RESULTADO DO PRIMEIRO DADO É " +  num1 + "\n\n\nO RESULTADO DO SEGUNDO DADO É " + num2 + "\n\n\nA SOMA DOS VALORES LANÇADOS É " +soma );
        caixaDeTexto.setFont(new java.awt.Font("Tahoma", 0, 18));
        
    }

    
    
    
}
