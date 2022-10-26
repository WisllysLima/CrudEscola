/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

/**
 *
 * @author Wislls Lima
 */
public class CadastrarPage2 extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public CadastrarPage2() {
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

        FieldConfSenhaCad2 = new javax.swing.JPasswordField();
        LabelConfSenhaCad2 = new javax.swing.JLabel();
        FieldSenhaCad2 = new javax.swing.JPasswordField();
        LabelSenhaCad2 = new javax.swing.JLabel();
        LabelConfirmeEmailCad2 = new javax.swing.JLabel();
        TextConfEmailCad2 = new javax.swing.JTextField();
        BotaoCadastrarCad2 = new javax.swing.JButton();
        TextEmailCad2 = new javax.swing.JTextField();
        LabelEmailCad2 = new javax.swing.JLabel();
        LabelCadastrarCad2 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabelFundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        FieldConfSenhaCad2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FieldConfSenhaCad2ActionPerformed(evt);
            }
        });
        getContentPane().add(FieldConfSenhaCad2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 610, 280, 40));

        LabelConfSenhaCad2.setForeground(new java.awt.Color(255, 255, 255));
        LabelConfSenhaCad2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelConfSenhaCad2.setText("Confirme Senha");
        getContentPane().add(LabelConfSenhaCad2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 570, 100, 50));

        FieldSenhaCad2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FieldSenhaCad2ActionPerformed(evt);
            }
        });
        getContentPane().add(FieldSenhaCad2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 540, 280, 40));

        LabelSenhaCad2.setForeground(new java.awt.Color(255, 255, 255));
        LabelSenhaCad2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelSenhaCad2.setText("Senha");
        getContentPane().add(LabelSenhaCad2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 500, 100, 50));

        LabelConfirmeEmailCad2.setForeground(new java.awt.Color(255, 255, 255));
        LabelConfirmeEmailCad2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelConfirmeEmailCad2.setText("Confirme Email");
        getContentPane().add(LabelConfirmeEmailCad2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 430, 120, 50));

        TextConfEmailCad2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TextConfEmailCad2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextConfEmailCad2ActionPerformed(evt);
            }
        });
        getContentPane().add(TextConfEmailCad2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 470, 280, 40));

        BotaoCadastrarCad2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        BotaoCadastrarCad2.setText("Cadastrar");
        BotaoCadastrarCad2.setAlignmentY(0.0F);
        BotaoCadastrarCad2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoCadastrarCad2ActionPerformed(evt);
            }
        });
        getContentPane().add(BotaoCadastrarCad2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 680, 170, 50));

        TextEmailCad2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TextEmailCad2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextEmailCad2ActionPerformed(evt);
            }
        });
        getContentPane().add(TextEmailCad2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 400, 280, 40));

        LabelEmailCad2.setForeground(new java.awt.Color(255, 255, 255));
        LabelEmailCad2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelEmailCad2.setText("Email");
        getContentPane().add(LabelEmailCad2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 360, 120, 50));

        LabelCadastrarCad2.setFont(new java.awt.Font("Segoe Print", 0, 48)); // NOI18N
        LabelCadastrarCad2.setForeground(new java.awt.Color(255, 255, 255));
        LabelCadastrarCad2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelCadastrarCad2.setText("Cadastrar");
        getContentPane().add(LabelCadastrarCad2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 300, 280, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/imagens/painel-login.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 290, 580, 490));

        jLabelFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/imagens/Logo.jpg"))); // NOI18N
        getContentPane().add(jLabelFundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TextEmailCad2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextEmailCad2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextEmailCad2ActionPerformed

    private void BotaoCadastrarCad2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoCadastrarCad2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotaoCadastrarCad2ActionPerformed

    private void TextConfEmailCad2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextConfEmailCad2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextConfEmailCad2ActionPerformed

    private void FieldSenhaCad2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FieldSenhaCad2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FieldSenhaCad2ActionPerformed

    private void FieldConfSenhaCad2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FieldConfSenhaCad2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FieldConfSenhaCad2ActionPerformed

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
            java.util.logging.Logger.getLogger(CadastrarPage2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastrarPage2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastrarPage2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastrarPage2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastrarPage2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotaoCadastrarCad2;
    private javax.swing.JPasswordField FieldConfSenhaCad2;
    private javax.swing.JPasswordField FieldSenhaCad2;
    private javax.swing.JLabel LabelCadastrarCad2;
    private javax.swing.JLabel LabelConfSenhaCad2;
    private javax.swing.JLabel LabelConfirmeEmailCad2;
    private javax.swing.JLabel LabelEmailCad2;
    private javax.swing.JLabel LabelSenhaCad2;
    private javax.swing.JTextField TextConfEmailCad2;
    private javax.swing.JTextField TextEmailCad2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelFundo;
    // End of variables declaration//GEN-END:variables
}
