/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpanels;

import excel.ProgramasExcel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JDialog;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

/**
 *
 * @author Juan
 */
public class AnadirProductor extends javax.swing.JFrame {

    private String getValue;

    /**
     * Creates new form AnadirProductor
     */
    public AnadirProductor() {
        initComponents();
        OKButton e1 = new OKButton();
        MENUButton e2 = new MENUButton();
        VOLVERButton e3 = new VOLVERButton();
        OKButton.addActionListener(e1);
        MENUButton.addActionListener(e2);
        VOLVERButton.addActionListener(e3);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PRODUCTORTextField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        MENUButton = new javax.swing.JButton();
        VOLVERButton = new javax.swing.JButton();
        OKButton = new JButton("");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PRODUCTORTextField.setToolTipText("");
        PRODUCTORTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PRODUCTORTextFieldActionPerformed(evt);
            }
        });

        jLabel1.setText("Productor:");

        MENUButton.setText("MENU");
        MENUButton.setToolTipText("");
        MENUButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MENUButtonActionPerformed(evt);
            }
        });

        VOLVERButton.setText("VOLVER");
        VOLVERButton.setToolTipText("");

        OKButton.setText("OK");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 46, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(32, 32, 32)
                        .addComponent(PRODUCTORTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(87, 87, 87))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(MENUButton)
                        .addGap(93, 93, 93)
                        .addComponent(VOLVERButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(OKButton)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(130, 130, 130)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PRODUCTORTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 116, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MENUButton)
                    .addComponent(VOLVERButton)
                    .addComponent(OKButton))
                .addContainerGap())
        );

        PRODUCTORTextField.getAccessibleContext().setAccessibleParent(OKButton);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void PRODUCTORTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PRODUCTORTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PRODUCTORTextFieldActionPerformed

    private void MENUButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MENUButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MENUButtonActionPerformed

    
        public class MENUButton implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e2) {
            MenuPrincipalFrame obj = new MenuPrincipalFrame();
            obj.setVisible(true);
            dispose();
        }

    }
        
        
        public class VOLVERButton implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e2) {
            MenuAnadirFrame obj = new MenuAnadirFrame();
            obj.setVisible(true);
            dispose();
        }

    }    
    
    
    public class OKButton implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e1) {
            getValue = PRODUCTORTextField.getText();
            AnadirProductor obj = new AnadirProductor();
            ProgramasExcel programasExcel = new ProgramasExcel();
            try {
                programasExcel.comprobarColumna("Productor", getValue);
            } catch (IOException ex) {
                Logger.getLogger(AnadirProductor.class.getName()).log(Level.SEVERE, null, ex);
            } catch (InvalidFormatException ex) {
                Logger.getLogger(AnadirProductor.class.getName()).log(Level.SEVERE, null, ex);
            }
            obj.setVisible(true);
            dispose();
        }

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
            java.util.logging.Logger.getLogger(AnadirProductor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AnadirProductor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AnadirProductor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AnadirProductor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AnadirProductor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton MENUButton;
    private javax.swing.JButton OKButton;
    private javax.swing.JTextField PRODUCTORTextField;
    private javax.swing.JButton VOLVERButton;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
