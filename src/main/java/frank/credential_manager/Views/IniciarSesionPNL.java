package frank.credential_manager.Views;

import frank.credential_manager.Authentication.UserSession;
import frank.credential_manager.DAO.UserDAO;
import frank.credential_manager.Database.DB_Chooser;
import frank.credential_manager.Models.User;
import frank.credential_manager.Utils.Tools;

import javax.swing.*;

public class IniciarSesionPNL extends javax.swing.JPanel {

    private UserDAO userDAO;

    public IniciarSesionPNL() {
        initComponents();
        userDAO = new UserDAO();

        Tools.loadIntoCombobox(usersCBOX, userDAO.getAllUsernames());
        usersCBOX.setSelectedIndex(0);

        Tools.setKeyEventButton(iniciarBTN, "ENTER");

        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                passTF.requestFocusInWindow();
            }
        });
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        passLBL = new javax.swing.JLabel();
        iniciarBTN = new javax.swing.JButton();
        userLBL = new javax.swing.JLabel();
        passTF = new javax.swing.JPasswordField();
        usersCBOX = new javax.swing.JComboBox<>();
        changeDbBTN = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        passLBL.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        passLBL.setForeground(new java.awt.Color(0, 0, 0));
        passLBL.setText("Contraseña");

        iniciarBTN.setBackground(new java.awt.Color(0, 102, 204));
        iniciarBTN.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        iniciarBTN.setForeground(new java.awt.Color(255, 255, 255));
        iniciarBTN.setText("Iniciar");
        iniciarBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iniciarBTNActionPerformed(evt);
            }
        });

        userLBL.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        userLBL.setForeground(new java.awt.Color(0, 0, 0));
        userLBL.setText("Nombre de usuario");

        passTF.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        usersCBOX.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        usersCBOX.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {}));

        changeDbBTN.setBackground(new java.awt.Color(0, 153, 0));
        changeDbBTN.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        changeDbBTN.setForeground(new java.awt.Color(255, 255, 255));
        changeDbBTN.setText("Cambiar base de datos");
        changeDbBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changeDbBTNActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(iniciarBTN, javax.swing.GroupLayout.DEFAULT_SIZE, 364, Short.MAX_VALUE)
                    .addComponent(userLBL, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passLBL, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passTF, javax.swing.GroupLayout.DEFAULT_SIZE, 364, Short.MAX_VALUE)
                    .addComponent(usersCBOX, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(changeDbBTN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(29, 29, 29))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(userLBL)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(usersCBOX, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(passLBL)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(passTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(iniciarBTN)
                .addGap(18, 18, 18)
                .addComponent(changeDbBTN)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(0, 102, 204));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("INICIAR SESION");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(402, 402, 402))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(340, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(324, 324, 324))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(97, 97, 97)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(108, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void iniciarBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iniciarBTNActionPerformed

        String password = String.valueOf(passTF.getPassword());

        User user = userDAO.authenticateUser(String.valueOf(usersCBOX.getSelectedItem()), password);
        if (user != null) {
            JOptionPane.showMessageDialog(null, "Autenticacion exitosa", "Info", JOptionPane.INFORMATION_MESSAGE);
            UserSession.getInstance().setUsuario(user);
            Tools.changePanel(DashboardPNL.getInstance(), (JPanel) this.getParent());
        } else {
            JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrectos.", "Error de autenticacion", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_iniciarBTNActionPerformed

    private void changeDbBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changeDbBTNActionPerformed
        DB_Chooser.changeDatabase();
        Tools.changePanel(DashboardPNL.getInstance(), (JPanel) this.getParent());
    }//GEN-LAST:event_changeDbBTNActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton changeDbBTN;
    private javax.swing.JButton iniciarBTN;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel passLBL;
    private javax.swing.JPasswordField passTF;
    private javax.swing.JLabel userLBL;
    private javax.swing.JComboBox<String> usersCBOX;
    // End of variables declaration//GEN-END:variables
}
