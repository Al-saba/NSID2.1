/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Log_IN;
import home.teacher_home;
import java.awt.HeadlessException;
import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author AL-SABA
 */
public class teacher_login extends javax.swing.JFrame {

    /**
     * Creates new form teacher_login
     */
    public teacher_login() {
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

        jPanel1 = new javax.swing.JPanel();
        id_user = new javax.swing.JTextField();
        pass_user = new javax.swing.JPasswordField();
        login = new javax.swing.JButton();
        icon_01 = new javax.swing.JLabel();
        show_password = new javax.swing.JCheckBox();
        background = new javax.swing.JLabel();
        login_button_02 = new javax.swing.JLabel();
        icon_02 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        id_user.setBackground(new java.awt.Color(237, 237, 233));
        id_user.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        id_user.setBorder(null);
        jPanel1.add(id_user, new org.netbeans.lib.awtextra.AbsoluteConstraints(539, 354, 290, 40));

        pass_user.setBackground(new java.awt.Color(237, 237, 233));
        pass_user.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        pass_user.setAutoscrolls(false);
        pass_user.setBorder(null);
        jPanel1.add(pass_user, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 459, 290, 40));

        login.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Button/login button 07.png"))); // NOI18N
        login.setContentAreaFilled(false);
        login.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                loginMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                loginMouseExited(evt);
            }
        });
        login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginActionPerformed(evt);
            }
        });
        jPanel1.add(login, new org.netbeans.lib.awtextra.AbsoluteConstraints(619, 521, -1, -1));

        icon_01.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/icon04.png"))); // NOI18N
        icon_01.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                icon_01MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                icon_01MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                icon_01MouseExited(evt);
            }
        });
        jPanel1.add(icon_01, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 570, -1, -1));

        show_password.setText("Show password");
        show_password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                show_passwordActionPerformed(evt);
            }
        });
        jPanel1.add(show_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 520, -1, -1));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Background/teacher login.png"))); // NOI18N
        jPanel1.add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        login_button_02.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Button/login button 06.png"))); // NOI18N
        jPanel1.add(login_button_02, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 530, -1, -1));

        icon_02.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/icon01.png"))); // NOI18N
        jPanel1.add(icon_02, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 590, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void icon_01MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icon_01MouseEntered
        icon_01.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/icon01.png")));
    }//GEN-LAST:event_icon_01MouseEntered

    private void icon_01MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icon_01MouseExited
        icon_01.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/icon04.png")));
    }//GEN-LAST:event_icon_01MouseExited

    private void icon_01MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icon_01MouseClicked
        new Home_page_all_account().setVisible(true);
        dispose();
    }//GEN-LAST:event_icon_01MouseClicked

    private void loginMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginMouseEntered
        login.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Button/login button 06.png")));
    }//GEN-LAST:event_loginMouseEntered

    private void loginMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginMouseExited
       login.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Button/login button 07.png")));
    }//GEN-LAST:event_loginMouseExited

    private void loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginActionPerformed
         try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/nsid?zeroDateTimeBehavior=CONVERT_TO_NULL", "root", "")) {
            String user = id_user.getText();
            String pass = pass_user.getText();
            
            
            // Use PreparedStatement to prevent SQL injection
            String sql = "SELECT * FROM registration WHERE school_id=? AND school_pass=?";
            try (PreparedStatement pstmt = con.prepareStatement(sql)) {
                pstmt.setString(1, user);
                pstmt.setString(2, pass);
                try (ResultSet rs = pstmt.executeQuery()) {
                    if (rs.next()) {
                        new teacher_home().setVisible(true);
                        dispose();
                    } else {
                        JOptionPane.showMessageDialog(this, "Wrong username or password...");
                        id_user.setText("");
                        pass_user.setText("");
                    }
                }
            }
        }
    } catch (HeadlessException | ClassNotFoundException | SQLException e) { // Helps to identify errors
        // Helps to identify errors
        JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
    }

    }//GEN-LAST:event_loginActionPerformed

    private void show_passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_show_passwordActionPerformed
     if (show_password.isSelected()) {
        pass_user.setEchoChar((char) 0); // Show password
    } else {
        pass_user.setEchoChar('*'); // Hide password
    }  
    }//GEN-LAST:event_show_passwordActionPerformed

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
            java.util.logging.Logger.getLogger(teacher_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(teacher_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(teacher_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(teacher_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new teacher_login().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JLabel icon_01;
    private javax.swing.JLabel icon_02;
    private javax.swing.JTextField id_user;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton login;
    private javax.swing.JLabel login_button_02;
    private javax.swing.JPasswordField pass_user;
    private javax.swing.JCheckBox show_password;
    // End of variables declaration//GEN-END:variables
}
