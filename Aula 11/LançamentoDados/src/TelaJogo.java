
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gabri
 */
public class TelaJogo extends javax.swing.JFrame  {

    /**
     * Creates new form NewJFrame
     */
     public int num1;
     public  int num2;
     public int soma;
     
     JLabel caixaDeTexto = new JLabel();
     JScrollPane scroll = new JScrollPane(caixaDeTexto);
  
    
    public TelaJogo() {
        initComponents();
        
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        btnLancar = new javax.swing.JButton();
        txtAposta = new javax.swing.JTextField();
        lbltitulo = new javax.swing.JLabel();
        lblAposta = new javax.swing.JLabel();
        btnJogar = new javax.swing.JButton();

        jLabel3.setText("jLabel3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        btnLancar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnLancar.setText("LANÇAR DADOS");
        btnLancar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLancarActionPerformed(evt);
            }
        });

        txtAposta.setEnabled(false);
        txtAposta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApostaActionPerformed(evt);
            }
        });

        lbltitulo.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lbltitulo.setText("               JOGO DE DADOS");

        lblAposta.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblAposta.setText("APOSTA");
        lblAposta.setEnabled(false);

        btnJogar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnJogar.setText("JOGAR");
        btnJogar.setEnabled(false);
        btnJogar.setMaximumSize(new java.awt.Dimension(161, 31));
        btnJogar.setMinimumSize(new java.awt.Dimension(161, 31));
        btnJogar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJogarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(lbltitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addComponent(btnLancar, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)
                        .addComponent(btnJogar, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(186, 186, 186)
                        .addComponent(lblAposta, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtAposta, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(124, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbltitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 103, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAposta, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAposta, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(61, 61, 61)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnLancar, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                    .addComponent(btnJogar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(74, 74, 74))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtApostaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApostaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtApostaActionPerformed

    private void btnLancarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLancarActionPerformed
        
       
        this.setNum1((int)(Math.random() * (6 + 1 - 1)+1));
        this.setNum2((int)(Math.random() * (6 + 1 - 1)+1));
        
        this.setSoma(getNum1() + getNum2());
        System.out.println(getNum1());
        System.out.println(getNum2());
        System.out.println(getSoma());
        
        btnJogar.setEnabled(true);
        txtAposta.setEnabled(true);
        lblAposta.setEnabled(true);
        btnLancar.setEnabled(false);
    }//GEN-LAST:event_btnLancarActionPerformed

    private void btnJogarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJogarActionPerformed
        int aposta = Integer.parseInt(txtAposta.getText());
        if(aposta == getSoma())
        {
            JOptionPane.showMessageDialog(null , "VOCÊ ACERTOU");
        }
        else
        {
            JOptionPane.showMessageDialog(null , "VOCÊ ERROU");
        }
        new TelaConfirma(getNum1() , getNum2() , getSoma()).setVisible(true);
        btnJogar.setEnabled(false);
        txtAposta.setEnabled(false);
        txtAposta.setText("");
        lblAposta.setEnabled(false);
        btnLancar.setEnabled(true);
     
        
    }//GEN-LAST:event_btnJogarActionPerformed

    private void confirma()
    {
     
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaJogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaJogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaJogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaJogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaJogo().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnJogar;
    private javax.swing.JButton btnLancar;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lblAposta;
    private javax.swing.JLabel lbltitulo;
    private javax.swing.JTextField txtAposta;
    // End of variables declaration//GEN-END:variables
     public int getNum1()
    {
        return num1;
    }

    public void setNum1(int num1)
    {
        this.num1 = num1;
    }

    public int getNum2()
    {
        return num2;
    }

    public void setNum2(int num2)
    {
        this.num2 = num2;
    }

    public int getSoma() {
        return soma;
    }

    public void setSoma(int soma) {
        this.soma = soma;
    }
    
    

}
