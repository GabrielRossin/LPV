
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gabri
 */
public class TelaExibir  
{
    
    public TelaExibir( String nome1 , double salario1 , String nome2,  double salario2)
    {
        inicio(nome1 , salario1, nome2 , salario2);
    }
    
    public void inicio(String nome1 , double salario1 ,String nome2 , double salario2)
    {
        JOptionPane.showMessageDialog(null, "Nome 1: " + nome1 + "  Salario1: " + String.format("%.2f", salario1) + "\n Nome2: " + nome2 + " Salario2: " + String.format("%.2f", salario2));
    }
    
}
