/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package views.admin;

import java.awt.Toolkit;

/**
 *
 * @author Unknown Account
 */
public class AdminPanel extends javax.swing.JFrame {

    /**
     * Creates new form AdminPanel
     */
    public AdminPanel() {
        initComponents();
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("../../media/TrendStyleIcon.png")));
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Panel = new javax.swing.JPanel();
        ButtonBack = new javax.swing.JButton();
        ButtonProducts = new javax.swing.JButton();
        ButtonVendors = new javax.swing.JButton();
        ButtonOrders = new javax.swing.JButton();
        ButtonAdministrator = new javax.swing.JButton();
        ButtonConfiguration = new javax.swing.JButton();
        Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("TrendStyle - Admin Panel");

        Panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ButtonBack.setBorderPainted(false);
        ButtonBack.setContentAreaFilled(false);
        ButtonBack.setMaximumSize(new java.awt.Dimension(50, 50));
        ButtonBack.setMinimumSize(new java.awt.Dimension(50, 50));
        ButtonBack.setPreferredSize(new java.awt.Dimension(50, 50));
        ButtonBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonBackActionPerformed(evt);
            }
        });
        Panel.add(ButtonBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 120, 50));

        ButtonProducts.setBorderPainted(false);
        ButtonProducts.setContentAreaFilled(false);
        ButtonProducts.setMaximumSize(new java.awt.Dimension(50, 50));
        ButtonProducts.setMinimumSize(new java.awt.Dimension(50, 50));
        ButtonProducts.setPreferredSize(new java.awt.Dimension(50, 50));
        ButtonProducts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonProductsActionPerformed(evt);
            }
        });
        Panel.add(ButtonProducts, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 340, 130, 160));

        ButtonVendors.setBorderPainted(false);
        ButtonVendors.setContentAreaFilled(false);
        ButtonVendors.setMaximumSize(new java.awt.Dimension(50, 50));
        ButtonVendors.setMinimumSize(new java.awt.Dimension(50, 50));
        ButtonVendors.setPreferredSize(new java.awt.Dimension(50, 50));
        ButtonVendors.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonVendorsActionPerformed(evt);
            }
        });
        Panel.add(ButtonVendors, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, 170, 150));

        ButtonOrders.setBorderPainted(false);
        ButtonOrders.setContentAreaFilled(false);
        ButtonOrders.setMaximumSize(new java.awt.Dimension(50, 50));
        ButtonOrders.setMinimumSize(new java.awt.Dimension(50, 50));
        ButtonOrders.setPreferredSize(new java.awt.Dimension(50, 50));
        ButtonOrders.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonOrdersActionPerformed(evt);
            }
        });
        Panel.add(ButtonOrders, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 360, 110, 130));

        ButtonAdministrator.setBorderPainted(false);
        ButtonAdministrator.setContentAreaFilled(false);
        ButtonAdministrator.setMaximumSize(new java.awt.Dimension(50, 50));
        ButtonAdministrator.setMinimumSize(new java.awt.Dimension(50, 50));
        ButtonAdministrator.setPreferredSize(new java.awt.Dimension(50, 50));
        ButtonAdministrator.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonAdministratorActionPerformed(evt);
            }
        });
        Panel.add(ButtonAdministrator, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 350, 190, 140));

        ButtonConfiguration.setBorderPainted(false);
        ButtonConfiguration.setContentAreaFilled(false);
        ButtonConfiguration.setMaximumSize(new java.awt.Dimension(50, 50));
        ButtonConfiguration.setMinimumSize(new java.awt.Dimension(50, 50));
        ButtonConfiguration.setPreferredSize(new java.awt.Dimension(50, 50));
        ButtonConfiguration.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonConfigurationActionPerformed(evt);
            }
        });
        Panel.add(ButtonConfiguration, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 360, 200, 130));

        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/adminPanel.png"))); // NOI18N
        Panel.add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonBackActionPerformed
        AdminHomeScreen page = new AdminHomeScreen();
        page.setVisible(true);
        dispose();
    }//GEN-LAST:event_ButtonBackActionPerformed

    private void ButtonProductsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonProductsActionPerformed
        AdminProductScreen page = new AdminProductScreen();
        page.setVisible(true);
        dispose();
    }//GEN-LAST:event_ButtonProductsActionPerformed

    private void ButtonVendorsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonVendorsActionPerformed
        AdminVendorScreen page = new AdminVendorScreen();
        page.setVisible(true);
        dispose();
    }//GEN-LAST:event_ButtonVendorsActionPerformed

    private void ButtonOrdersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonOrdersActionPerformed
        AdminOrderScreen page = new AdminOrderScreen();
        page.setVisible(true);
        dispose();
    }//GEN-LAST:event_ButtonOrdersActionPerformed

    private void ButtonConfigurationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonConfigurationActionPerformed
        AdminConfigurationScreen page = new AdminConfigurationScreen();
        page.setVisible(true);
        dispose();
    }//GEN-LAST:event_ButtonConfigurationActionPerformed

    private void ButtonAdministratorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonAdministratorActionPerformed
        AdminAdministratorScreen page = new AdminAdministratorScreen();
        page.setVisible(true);
        dispose();
    }//GEN-LAST:event_ButtonAdministratorActionPerformed

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
            java.util.logging.Logger.getLogger(AdminPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminPanel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background;
    private javax.swing.JButton ButtonAdministrator;
    private javax.swing.JButton ButtonBack;
    private javax.swing.JButton ButtonConfiguration;
    private javax.swing.JButton ButtonOrders;
    private javax.swing.JButton ButtonProducts;
    private javax.swing.JButton ButtonVendors;
    private javax.swing.JPanel Panel;
    // End of variables declaration//GEN-END:variables
}
