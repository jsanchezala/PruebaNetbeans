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
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

/**
 *
 * @author Juan
 */
public class MenuPrincipalFrame extends javax.swing.JFrame {

    /**
     * Creates new form MenuFrame
     */
    public MenuPrincipalFrame() {
        initComponents();
        ProgramasExcel programasExcel = new ProgramasExcel();
        try {
            programasExcel.comprobarExcel();
        } catch (IOException ex) {
            Logger.getLogger(MenuPrincipalFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        Anadir e1 = new Anadir();
        Editar e2 = new Editar();
        Eliminar e3 = new Eliminar();
        ANADIRButton.addActionListener(e1);
        EDITARButton.addActionListener(e2);
        ELIMINARButton.addActionListener(e3);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ANADIRButton = new javax.swing.JButton();
        EDITARButton = new javax.swing.JButton();
        ELIMINARButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        ANADIRButton.setText("Añadir");
        ANADIRButton.setToolTipText("");
        ANADIRButton.setActionCommand("botonAnadir");


        EDITARButton.setText("Editar");
        EDITARButton.setToolTipText("");
        EDITARButton.setActionCommand("botonEditar");


        ELIMINARButton.setText("Eliminar");
        ELIMINARButton.setToolTipText("");
        ELIMINARButton.setActionCommand("botonEliminar");


        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(156, 156, 156)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ANADIRButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(EDITARButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ELIMINARButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(175, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(ANADIRButton, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(EDITARButton, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ELIMINARButton)
                .addContainerGap(161, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //GEN-FIRST:event_ANADIRButtonActionPerformed
        // TODO add your handling code here:
    //GEN-LAST:event_ANADIRButtonActionPerformed

    //GEN-FIRST:event_EDITARButtonActionPerformed
        // TODO add your handling code here:
    //GEN-LAST:event_EDITARButtonActionPerformed

    //GEN-FIRST:event_ELIMINARButtonActionPerformed
        // TODO add your handling code here:
    //GEN-LAST:event_ELIMINARButtonActionPerformed

    public class Anadir implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e1) {
            MenuAnadirFrame obj = new MenuAnadirFrame();
            obj.setVisible(true);
            dispose();
        }

    }

    public class Editar implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e2) {
            MenuEditar obj = new MenuEditar();
            obj.setVisible(true);
            dispose();
        }

    }

    public class Eliminar implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            MenuEliminar obj = new MenuEliminar();
            obj.setVisible(true);
            dispose();
        }

    }

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ANADIRButton;
    private javax.swing.JButton EDITARButton;
    private javax.swing.JButton ELIMINARButton;
    // End of variables declaration//GEN-END:variables
}
