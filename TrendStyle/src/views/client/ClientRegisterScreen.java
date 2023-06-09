/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package views.client;

import communication.communication;
import java.awt.Color;
import java.awt.Toolkit;
import javax.swing.JOptionPane;
import utils.SHA256;
import utils.Validator;

/**
 *
 * @author Unknown Account
 */
public class ClientRegisterScreen extends javax.swing.JFrame {
    communication dbAccess = new communication();
    Validator validator = new Validator();
    SHA256 sha256 = new SHA256();
    
    public void fixDesign() {
        FieldUsername.setOpaque(false);
        FieldUsername.setBackground(new Color(0, 0, 0, 0));
        
        FieldPassword.setOpaque(false);
        FieldPassword.setBackground(new Color(0, 0, 0, 0));
        
        FieldEmail.setOpaque(false);
        FieldEmail.setBackground(new Color(0, 0, 0, 0));
        
        FieldFirstName.setOpaque(false);
        FieldFirstName.setBackground(new Color(0, 0, 0, 0));
        
        FieldLastName.setOpaque(false);
        FieldLastName.setBackground(new Color(0, 0, 0, 0));
        
        FieldCPF.setOpaque(false);
        FieldCPF.setBackground(new Color(0, 0, 0, 0));
        
        FieldCelular.setOpaque(false);
        FieldCelular.setBackground(new Color(0, 0, 0, 0));

        FieldCity.setOpaque(false);
        FieldCity.setBackground(new Color(0, 0, 0, 0));
        
        FieldCEP.setOpaque(false);
        FieldCEP.setBackground(new Color(0, 0, 0, 0));
        
        FieldAddress.setOpaque(false);
        FieldAddress.setBackground(new Color(0, 0, 0, 0));
        
        FieldAddressNumber.setOpaque(false);
        FieldAddressNumber.setBackground(new Color(0, 0, 0, 0));
        
    }
    
    public boolean validateFields(String email, String cpf) {
        boolean valid = true;
        
        if (!validator.isValidEmail(email)) {
            valid = false;
            JOptionPane.showMessageDialog(null, "Por favor, insira um endereço de e-mail válido.", "Erro", JOptionPane.ERROR_MESSAGE);
        }
        if (!validator.isValidCPF(cpf)) {
            JOptionPane.showMessageDialog(null, "Por favor, insira um CPF válido.", "Erro", JOptionPane.ERROR_MESSAGE);
            valid = false;
        }
        
        return valid;
    }
    
    public boolean verifyAndRegisterFields() {
        try {
            String username      = FieldUsername.getText().replaceAll("\\s", "").toLowerCase();
            String password      = FieldPassword.getText();
            String email         = FieldEmail.getText();
            String firstName     = FieldFirstName.getText();
            String lastName      = FieldLastName.getText();
            String CPF           = FieldCPF.getValue().toString().replaceAll("-", "").replaceAll("\\.", "");
            String celular       = FieldCelular.getValue().toString().replaceAll("[^0-9]", "");
            String estate        = FieldEstate.getSelectedItem().toString();
            String city          = FieldCity.getText();
            String CEP           = FieldCEP.getValue().toString().replaceAll("\\.", "");
            String address       = FieldAddress.getText();
            String addressNumber = FieldAddressNumber.getText();
            
            if (username.isEmpty() || password.isEmpty() || email.isEmpty() || firstName.isEmpty()
                || lastName.isEmpty() || CPF.isEmpty() || celular.isEmpty() || city.isEmpty()
                || CEP.isEmpty() || address.isEmpty() || addressNumber.isEmpty()) {
            throw new Exception();
            }
            
            if (validateFields(email,CPF)) {
                password = sha256.convertToSHA256(password);
                if (dbAccess.registerClient(username, password, CPF, firstName, lastName, email, celular, CEP, address, addressNumber, city, estate)) {
                    JOptionPane.showMessageDialog(null, "Usuário criado com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
                    return true;
                } else {
                    JOptionPane.showMessageDialog(null, "Erro ao criar usuário. Por favor, tente novamente.", "Erro", JOptionPane.ERROR_MESSAGE);
                }
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Por favor, preencha todos os campos obrigatórios.", "Erro", JOptionPane.ERROR_MESSAGE);
        }
        return false;
    }
    
    /**
     * Creates new form ClientRegisterScreen
     */
    public ClientRegisterScreen() {
        initComponents();
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("../../media/TrendStyleIcon.png")));
        setLocationRelativeTo(null);
        fixDesign();
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
        FieldUsername = new javax.swing.JTextField();
        FieldPassword = new javax.swing.JPasswordField();
        FieldEmail = new javax.swing.JTextField();
        FieldFirstName = new javax.swing.JTextField();
        FieldLastName = new javax.swing.JTextField();
        FieldCPF = new javax.swing.JFormattedTextField();
        FieldCelular = new javax.swing.JFormattedTextField();
        FieldEstate = new javax.swing.JComboBox<>();
        FieldCity = new javax.swing.JTextField();
        FieldCEP = new javax.swing.JFormattedTextField();
        FieldAddress = new javax.swing.JTextField();
        FieldAddressNumber = new javax.swing.JTextField();
        ButtonBack = new javax.swing.JButton();
        ButtonRegister = new javax.swing.JButton();
        Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("TrendStyle - Client Register");

        Panel.setBackground(new java.awt.Color(255, 255, 255));
        Panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        FieldUsername.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        FieldUsername.setToolTipText("");
        FieldUsername.setBorder(null);
        FieldUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FieldUsernameActionPerformed(evt);
            }
        });
        Panel.add(FieldUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(57, 170, 262, 30));

        FieldPassword.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        FieldPassword.setBorder(null);
        Panel.add(FieldPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(337, 170, 260, 30));

        FieldEmail.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        FieldEmail.setToolTipText("");
        FieldEmail.setBorder(null);
        FieldEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FieldEmailActionPerformed(evt);
            }
        });
        Panel.add(FieldEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(617, 170, 285, 30));

        FieldFirstName.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        FieldFirstName.setToolTipText("");
        FieldFirstName.setBorder(null);
        FieldFirstName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FieldFirstNameActionPerformed(evt);
            }
        });
        Panel.add(FieldFirstName, new org.netbeans.lib.awtextra.AbsoluteConstraints(57, 265, 169, 30));

        FieldLastName.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        FieldLastName.setToolTipText("");
        FieldLastName.setBorder(null);
        FieldLastName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FieldLastNameActionPerformed(evt);
            }
        });
        Panel.add(FieldLastName, new org.netbeans.lib.awtextra.AbsoluteConstraints(244, 265, 168, 30));

        FieldCPF.setBorder(null);
        try {
            FieldCPF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        FieldCPF.setToolTipText("");
        FieldCPF.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Panel.add(FieldCPF, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 265, 170, 30));

        FieldCelular.setBorder(null);
        try {
            FieldCelular.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) #####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        FieldCelular.setToolTipText("");
        FieldCelular.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Panel.add(FieldCelular, new org.netbeans.lib.awtextra.AbsoluteConstraints(617, 265, 168, 30));

        FieldEstate.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        FieldEstate.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SP", "MG", "RJ", "BA", "PR", "RS", "PE", "CE", "PA", "SC", "MA", "GO", "AM", "ES", "PB", "RN", "MT", "AL", "PI", "DF", "MS", "SE", "RO", "TO", "AC", "AP", "RR" }));
        Panel.add(FieldEstate, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 260, 110, 40));

        FieldCity.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        FieldCity.setToolTipText("");
        FieldCity.setBorder(null);
        FieldCity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FieldCityActionPerformed(evt);
            }
        });
        Panel.add(FieldCity, new org.netbeans.lib.awtextra.AbsoluteConstraints(57, 359, 169, 30));

        FieldCEP.setBorder(null);
        try {
            FieldCEP.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        FieldCEP.setToolTipText("");
        FieldCEP.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Panel.add(FieldCEP, new org.netbeans.lib.awtextra.AbsoluteConstraints(244, 359, 120, 30));

        FieldAddress.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        FieldAddress.setToolTipText("");
        FieldAddress.setBorder(null);
        FieldAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FieldAddressActionPerformed(evt);
            }
        });
        Panel.add(FieldAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(383, 359, 403, 30));

        FieldAddressNumber.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        FieldAddressNumber.setBorder(null);
        Panel.add(FieldAddressNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(804, 359, 99, 30));

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
        Panel.add(ButtonBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 60, 50));

        ButtonRegister.setBorderPainted(false);
        ButtonRegister.setContentAreaFilled(false);
        ButtonRegister.setMaximumSize(new java.awt.Dimension(300, 50));
        ButtonRegister.setMinimumSize(new java.awt.Dimension(300, 50));
        ButtonRegister.setPreferredSize(new java.awt.Dimension(300, 50));
        ButtonRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonRegisterActionPerformed(evt);
            }
        });
        Panel.add(ButtonRegister, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 430, 260, 60));

        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/clientRegister.png"))); // NOI18N
        Panel.add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void FieldUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FieldUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FieldUsernameActionPerformed

    private void FieldEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FieldEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FieldEmailActionPerformed

    private void FieldFirstNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FieldFirstNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FieldFirstNameActionPerformed

    private void FieldLastNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FieldLastNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FieldLastNameActionPerformed

    private void ButtonBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonBackActionPerformed
        ClientHomeScreen page = new ClientHomeScreen();
        page.setVisible(true);
        dispose();
    }//GEN-LAST:event_ButtonBackActionPerformed

    private void ButtonRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonRegisterActionPerformed
        if (verifyAndRegisterFields()) {
            ClientHomeScreen page = new ClientHomeScreen();
            page.setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_ButtonRegisterActionPerformed

    private void FieldAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FieldAddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FieldAddressActionPerformed

    private void FieldCityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FieldCityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FieldCityActionPerformed

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
            java.util.logging.Logger.getLogger(ClientRegisterScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ClientRegisterScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ClientRegisterScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ClientRegisterScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ClientRegisterScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background;
    private javax.swing.JButton ButtonBack;
    private javax.swing.JButton ButtonRegister;
    private javax.swing.JTextField FieldAddress;
    private javax.swing.JTextField FieldAddressNumber;
    private javax.swing.JFormattedTextField FieldCEP;
    private javax.swing.JFormattedTextField FieldCPF;
    private javax.swing.JFormattedTextField FieldCelular;
    private javax.swing.JTextField FieldCity;
    private javax.swing.JTextField FieldEmail;
    private javax.swing.JComboBox<String> FieldEstate;
    private javax.swing.JTextField FieldFirstName;
    private javax.swing.JTextField FieldLastName;
    private javax.swing.JPasswordField FieldPassword;
    private javax.swing.JTextField FieldUsername;
    private javax.swing.JPanel Panel;
    // End of variables declaration//GEN-END:variables
}
