
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

public class PantallaJuego extends javax.swing.JFrame {
    List<Object> players = new ArrayList<>();
    List<Object> characters = new ArrayList<>();
    static int characterSelected = 0;
    ClsControlador controller = new ClsControlador();
    /**
     * Creates new form PantallaJuego
     */
    public PantallaJuego() {
        initComponents();
        this.setTitle("Game Screen");
        btnStart.setEnabled(false);
        btnSelectPlayerTwo.setEnabled(false);
        fullComboPlayers();
    }

    public void fullComboPlayers(){
        cmbPlayerOne.setEnabled(true);
        cmbPlayerTwo.setEnabled(true);
        players = controller.extraerObjetos("listPlayers.dat");
        Player.combox = 1;
        cmbPlayerOne.setModel(new javax.swing.DefaultComboBoxModel(players.toArray()));
        cmbPlayerTwo.setModel(new javax.swing.DefaultComboBoxModel(players.toArray()));
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cmbPlayerOne = new javax.swing.JComboBox<>();
        cmbPlayerTwo = new javax.swing.JComboBox<>();
        cmbCharacters = new javax.swing.JComboBox<>();
        btnSelectPlayerOne = new javax.swing.JButton();
        btnSelectPlayerTwo = new javax.swing.JButton();
        btnRegisterPlayer = new javax.swing.JButton();
        btnStart = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        lblImagePlayerOne = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lblImagePlayerTwo = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        lblImageCharacter = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblFondScreenGame = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        getContentPane().add(cmbPlayerOne, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 148, -1));

        cmbPlayerTwo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbPlayerTwoActionPerformed(evt);
            }
        });
        getContentPane().add(cmbPlayerTwo, new org.netbeans.lib.awtextra.AbsoluteConstraints(458, 80, 150, -1));

        getContentPane().add(cmbCharacters, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 150, 187, -1));

        btnSelectPlayerOne.setText("Select Player One");
        btnSelectPlayerOne.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelectPlayerOneActionPerformed(evt);
            }
        });
        getContentPane().add(btnSelectPlayerOne, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 132, 36));

        btnSelectPlayerTwo.setText("Select Player Two");
        getContentPane().add(btnSelectPlayerTwo, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 280, 136, 35));

        btnRegisterPlayer.setText("Register Player");
        btnRegisterPlayer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterPlayerActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegisterPlayer, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 490, 150, 30));

        btnStart.setText("Start");
        btnStart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStartActionPerformed(evt);
            }
        });
        getContentPane().add(btnStart, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 540, -1, -1));

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblImagePlayerOne, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblImagePlayerOne, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 148, -1));

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblImagePlayerTwo, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblImagePlayerTwo, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 120, 150, -1));

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblImageCharacter, javax.swing.GroupLayout.DEFAULT_SIZE, 258, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblImageCharacter, javax.swing.GroupLayout.DEFAULT_SIZE, 218, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 350, 260, 220));

        jLabel1.setFont(new java.awt.Font("Papyrus", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("BATTLE BAKUGAN-X");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, -1, -1));

        jLabel2.setFont(new java.awt.Font("Papyrus", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Characters");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 120, -1, -1));

        lblFondScreenGame.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/fondo.jpg"))); // NOI18N
        getContentPane().add(lblFondScreenGame, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 630, 630));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegisterPlayerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterPlayerActionPerformed
        
        //Cambio De Pantalla 
        PantallaRegistro Obj = new PantallaRegistro();
        Obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnRegisterPlayerActionPerformed

    private void btnStartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStartActionPerformed
        
        PantallaPelea Obj = new PantallaPelea();
        Obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnStartActionPerformed

    private void btnSelectPlayerOneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelectPlayerOneActionPerformed
        Character  newCharacter = (Character) characters.get(characterSelected);
        
        cmbPlayerOne.setEnabled(false);
        cmbPlayerTwo.setEnabled(true);
    }//GEN-LAST:event_btnSelectPlayerOneActionPerformed

    private void cmbPlayerTwoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbPlayerTwoActionPerformed
        if (cmbPlayerOne.getSelectedIndex() == cmbPlayerTwo.getSelectedIndex()) {
            JOptionPane.showMessageDialog(rootPane, "Select a different user","Message",0);
            btnSelectPlayerTwo.setEnabled(false);
        } else {
            btnSelectPlayerTwo.setEnabled(true);
        }
    }//GEN-LAST:event_cmbPlayerTwoActionPerformed

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
            java.util.logging.Logger.getLogger(PantallaJuego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PantallaJuego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PantallaJuego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PantallaJuego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PantallaJuego().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegisterPlayer;
    private javax.swing.JButton btnSelectPlayerOne;
    private javax.swing.JButton btnSelectPlayerTwo;
    private javax.swing.JButton btnStart;
    private javax.swing.JComboBox<String> cmbCharacters;
    private javax.swing.JComboBox<String> cmbPlayerOne;
    private javax.swing.JComboBox<String> cmbPlayerTwo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lblFondScreenGame;
    private javax.swing.JLabel lblImageCharacter;
    private javax.swing.JLabel lblImagePlayerOne;
    private javax.swing.JLabel lblImagePlayerTwo;
    // End of variables declaration//GEN-END:variables
}
