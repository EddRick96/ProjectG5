package Game;


import java.awt.Image;
import java.util.ArrayList;
import java.util.List;
import javax.swing.Icon;
import javax.swing.ImageIcon;

public class PantallaPelea extends javax.swing.JFrame {

    static String nameP1, lastNameP1, nameP2, lastNameP2;
    public static int idPlayer1, idPlayer2;
    //Datos de los Personajes
    static String nameCharacter1, nameCharacter2, lifeCharacter1, lifeCharacter2, staminaCharacter1, staminaCharacter2
            , imageCharacter1, imageCharacter2, imageElement1, imageElement2;
    public static int idP1, idP2;
    
    ClsControlador controller = new ClsControlador();
    List<Object> player1 = new ArrayList<>();
    List<Object> player2 = new ArrayList<>();
    List<Object> characters = new ArrayList<>();
    //ArrayList<Object> personajes2 = new ArrayList<>();
    static int accountant1 = 0;
    static int accountant2 = 0;
    static boolean defenseP1 = false;
    static boolean defenseP2 = false;
    static String turns = "";
    String text = "";
    int victoriesP1 = 0;
    int victoriesP2 = 0;
    ImageIcon image;
    Icon icon;
    
    public PantallaPelea() {
        initComponents();
        ImageIcon fondFight = new ImageIcon("src/Images/darkfond.jpg");
        Icon fond = new ImageIcon(fondFight.getImage().getScaledInstance(lblFondFightScreen.getWidth(), lblFondFightScreen.getHeight(), Image.SCALE_DEFAULT));
        lblFondFightScreen.setIcon(fond);
        
        ImageIcon fondText = new ImageIcon("src/Images/angel.jpg");
        Icon fondTx = new ImageIcon(fondText.getImage().getScaledInstance(lblFontAttacks.getWidth(), lblFontAttacks.getHeight(), Image.SCALE_DEFAULT));
        lblFontAttacks.setIcon(fondTx);
        
        fullInfo();
        turns("p1");
        
    }
    
    public void turns(String turns) {
        System.out.println(turns);
        if (turns == "p1") {
            btnAttackPlayerOne.setEnabled(true);
            btnFinalAttackPlayerOne.setEnabled(true);
            btnCurePlayerOne.setEnabled(true);
            btnDefensePlayerOne.setEnabled(true);
            
            btnAttackPlayerTwo.setEnabled(false);
            btnFinalAttackPlayerTwo.setEnabled(false);
            btnCurePlayerTwo.setEnabled(false);
            btnDefensePlayerTwo.setEnabled(false);
            
        } else if (turns == "p2") {
            btnAttackPlayerOne.setEnabled(false);
            btnFinalAttackPlayerOne.setEnabled(false);
            btnCurePlayerOne.setEnabled(false);
            btnDefensePlayerOne.setEnabled(false);
            
            btnAttackPlayerTwo.setEnabled(true);
            btnFinalAttackPlayerTwo.setEnabled(true);
            btnCurePlayerTwo.setEnabled(true);
            btnDefensePlayerTwo.setEnabled(true);
        }
    }

    public void cleanLbl() {
        txtLifePlayerOne.setText("");
        txtLifePlayerTwo.setText("");
        txtStaminaPlayerOne.setText("");
        txtStaminaPlayerTwo.setText("");
    }

    public void fullInfo(){
        lblNamePlayerOne.setText(nameP1);
        lblCharacterPlayerOne.setText(nameCharacter1);
        
        image = new ImageIcon(imageCharacter1);
        icon = new ImageIcon(image.getImage().getScaledInstance(lblPlayerOneFight.getWidth(),lblPlayerOneFight.getHeight(),Image.SCALE_DEFAULT));
        lblPlayerOneFight.setIcon(icon);
        
        image = new ImageIcon(imageElement1);
        icon = new ImageIcon(image.getImage().getScaledInstance(lblFondFieldOne.getWidth(),lblFondFieldOne.getHeight(),Image.SCALE_DEFAULT));
        lblFondFieldOne.setIcon(icon);
        
        
        lblNamePlayerTwo.setText(nameP2);
        lblCharacterPlayerTwo.setText(nameCharacter2);
        
        image = new ImageIcon(imageCharacter2);
        icon = new ImageIcon(image.getImage().getScaledInstance(lblPlayerTwoFight.getWidth(),lblPlayerTwoFight.getHeight(),Image.SCALE_DEFAULT));
        lblPlayerTwoFight.setIcon(icon);
        
        image = new ImageIcon(imageElement2);
        icon = new ImageIcon(image.getImage().getScaledInstance(lblFondFieldTwo.getWidth(),lblFondFieldTwo.getHeight(),Image.SCALE_DEFAULT));
        lblFondFieldTwo.setIcon(icon);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        lblNamePlayerOne = new javax.swing.JLabel();
        lblCharacterPlayerOne = new javax.swing.JLabel();
        lblLifePlayerOne = new javax.swing.JLabel();
        lblStaminaPlayerOne = new javax.swing.JLabel();
        txtLifePlayerOne = new javax.swing.JTextField();
        txtStaminaPlayerOne = new javax.swing.JTextField();
        lblFondFieldOne = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        lblNamePlayerTwo = new javax.swing.JLabel();
        lblCharacterPlayerTwo = new javax.swing.JLabel();
        lblLifePlayerTwo = new javax.swing.JLabel();
        lblStaminaPlayerTwo = new javax.swing.JLabel();
        txtLifePlayerTwo = new javax.swing.JTextField();
        txtStaminaPlayerTwo = new javax.swing.JTextField();
        lblFondFieldTwo = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        lblPlayerTwoFight = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        lblPlayerOneFight = new javax.swing.JLabel();
        lblFondFightScreen = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtArea = new javax.swing.JTextArea();
        btnAttackPlayerOne = new javax.swing.JButton();
        btnDefensePlayerOne = new javax.swing.JButton();
        btnFinalAttackPlayerOne = new javax.swing.JButton();
        btnCurePlayerOne = new javax.swing.JButton();
        btnAttackPlayerTwo = new javax.swing.JButton();
        btnDefensePlayerTwo = new javax.swing.JButton();
        btnFinalAttackPlayerTwo = new javax.swing.JButton();
        btnCurePlayerTwo = new javax.swing.JButton();
        lblFontAttacks = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblNamePlayerOne.setBackground(new java.awt.Color(255, 255, 255));
        lblNamePlayerOne.setFont(new java.awt.Font("Papyrus", 1, 20)); // NOI18N
        lblNamePlayerOne.setForeground(new java.awt.Color(255, 255, 255));
        lblNamePlayerOne.setText("jLabel1");
        jPanel2.add(lblNamePlayerOne, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 12, 230, -1));

        lblCharacterPlayerOne.setFont(new java.awt.Font("Papyrus", 1, 16)); // NOI18N
        lblCharacterPlayerOne.setForeground(new java.awt.Color(255, 255, 255));
        lblCharacterPlayerOne.setText("jLabel2");
        jPanel2.add(lblCharacterPlayerOne, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 50, 210, -1));

        lblLifePlayerOne.setFont(new java.awt.Font("Papyrus", 0, 12)); // NOI18N
        lblLifePlayerOne.setForeground(new java.awt.Color(255, 255, 255));
        lblLifePlayerOne.setText("Life:");
        jPanel2.add(lblLifePlayerOne, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 88, -1, -1));

        lblStaminaPlayerOne.setFont(new java.awt.Font("Papyrus", 0, 12)); // NOI18N
        lblStaminaPlayerOne.setForeground(new java.awt.Color(255, 255, 255));
        lblStaminaPlayerOne.setText("Stamina:");
        jPanel2.add(lblStaminaPlayerOne, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 127, -1, -1));
        jPanel2.add(txtLifePlayerOne, new org.netbeans.lib.awtextra.AbsoluteConstraints(77, 87, 182, -1));
        jPanel2.add(txtStaminaPlayerOne, new org.netbeans.lib.awtextra.AbsoluteConstraints(77, 126, 182, -1));
        jPanel2.add(lblFondFieldOne, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 270, 170));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 270, 170));

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblNamePlayerTwo.setFont(new java.awt.Font("Papyrus", 1, 20)); // NOI18N
        lblNamePlayerTwo.setForeground(new java.awt.Color(255, 255, 255));
        lblNamePlayerTwo.setText("jLabel5");
        jPanel3.add(lblNamePlayerTwo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 12, 240, -1));

        lblCharacterPlayerTwo.setFont(new java.awt.Font("Papyrus", 1, 16)); // NOI18N
        lblCharacterPlayerTwo.setForeground(new java.awt.Color(255, 255, 255));
        lblCharacterPlayerTwo.setText("jLabel6");
        jPanel3.add(lblCharacterPlayerTwo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 55, 230, -1));

        lblLifePlayerTwo.setFont(new java.awt.Font("Papyrus", 0, 12)); // NOI18N
        lblLifePlayerTwo.setForeground(new java.awt.Color(255, 255, 255));
        lblLifePlayerTwo.setText("Life:");
        jPanel3.add(lblLifePlayerTwo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 99, -1, -1));

        lblStaminaPlayerTwo.setFont(new java.awt.Font("Papyrus", 0, 12)); // NOI18N
        lblStaminaPlayerTwo.setForeground(new java.awt.Color(255, 255, 255));
        lblStaminaPlayerTwo.setText("Stamina:");
        jPanel3.add(lblStaminaPlayerTwo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 138, -1, -1));

        txtLifePlayerTwo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLifePlayerTwoActionPerformed(evt);
            }
        });
        jPanel3.add(txtLifePlayerTwo, new org.netbeans.lib.awtextra.AbsoluteConstraints(78, 99, 170, -1));
        jPanel3.add(txtStaminaPlayerTwo, new org.netbeans.lib.awtextra.AbsoluteConstraints(81, 137, 170, -1));
        jPanel3.add(lblFondFieldTwo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 270, 180));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 210, 270, 180));

        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblPlayerTwoFight, javax.swing.GroupLayout.DEFAULT_SIZE, 258, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblPlayerTwoFight, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(654, 20, 260, 170));

        jPanel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblPlayerOneFight, javax.swing.GroupLayout.DEFAULT_SIZE, 268, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblPlayerOneFight, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 214, 270, 170));
        jPanel1.add(lblFondFightScreen, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 940, 410));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 4, 940, 410));

        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtArea.setColumns(20);
        txtArea.setRows(5);
        jScrollPane1.setViewportView(txtArea);

        jPanel4.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 119, 918, 129));

        btnAttackPlayerOne.setFont(new java.awt.Font("Papyrus", 0, 11)); // NOI18N
        btnAttackPlayerOne.setText("Attack");
        jPanel4.add(btnAttackPlayerOne, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 12, 73, -1));

        btnDefensePlayerOne.setFont(new java.awt.Font("Papyrus", 0, 11)); // NOI18N
        btnDefensePlayerOne.setText("Defense");
        jPanel4.add(btnDefensePlayerOne, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 78, -1, -1));

        btnFinalAttackPlayerOne.setFont(new java.awt.Font("Papyrus", 0, 11)); // NOI18N
        btnFinalAttackPlayerOne.setText("Final Attack");
        jPanel4.add(btnFinalAttackPlayerOne, new org.netbeans.lib.awtextra.AbsoluteConstraints(139, 12, -1, -1));

        btnCurePlayerOne.setFont(new java.awt.Font("Papyrus", 0, 11)); // NOI18N
        btnCurePlayerOne.setText("Cure");
        jPanel4.add(btnCurePlayerOne, new org.netbeans.lib.awtextra.AbsoluteConstraints(139, 78, 89, -1));

        btnAttackPlayerTwo.setFont(new java.awt.Font("Papyrus", 0, 11)); // NOI18N
        btnAttackPlayerTwo.setText("Attack");
        jPanel4.add(btnAttackPlayerTwo, new org.netbeans.lib.awtextra.AbsoluteConstraints(717, 12, 73, -1));

        btnDefensePlayerTwo.setFont(new java.awt.Font("Papyrus", 0, 11)); // NOI18N
        btnDefensePlayerTwo.setText("Defense");
        jPanel4.add(btnDefensePlayerTwo, new org.netbeans.lib.awtextra.AbsoluteConstraints(717, 78, -1, -1));

        btnFinalAttackPlayerTwo.setFont(new java.awt.Font("Papyrus", 0, 11)); // NOI18N
        btnFinalAttackPlayerTwo.setText("Final Attack");
        jPanel4.add(btnFinalAttackPlayerTwo, new org.netbeans.lib.awtextra.AbsoluteConstraints(814, 12, -1, -1));

        btnCurePlayerTwo.setFont(new java.awt.Font("Papyrus", 0, 11)); // NOI18N
        btnCurePlayerTwo.setText("Cure");
        jPanel4.add(btnCurePlayerTwo, new org.netbeans.lib.awtextra.AbsoluteConstraints(814, 78, 89, -1));
        jPanel4.add(lblFontAttacks, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 940, 260));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 420, 940, 260));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    
    
    private void txtLifePlayerTwoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLifePlayerTwoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLifePlayerTwoActionPerformed

    
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
            java.util.logging.Logger.getLogger(PantallaPelea.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PantallaPelea.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PantallaPelea.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PantallaPelea.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PantallaPelea().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAttackPlayerOne;
    private javax.swing.JButton btnAttackPlayerTwo;
    private javax.swing.JButton btnCurePlayerOne;
    private javax.swing.JButton btnCurePlayerTwo;
    private javax.swing.JButton btnDefensePlayerOne;
    private javax.swing.JButton btnDefensePlayerTwo;
    private javax.swing.JButton btnFinalAttackPlayerOne;
    private javax.swing.JButton btnFinalAttackPlayerTwo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCharacterPlayerOne;
    private javax.swing.JLabel lblCharacterPlayerTwo;
    private javax.swing.JLabel lblFondFieldOne;
    private javax.swing.JLabel lblFondFieldTwo;
    private javax.swing.JLabel lblFondFightScreen;
    private javax.swing.JLabel lblFontAttacks;
    private javax.swing.JLabel lblLifePlayerOne;
    private javax.swing.JLabel lblLifePlayerTwo;
    private javax.swing.JLabel lblNamePlayerOne;
    private javax.swing.JLabel lblNamePlayerTwo;
    private javax.swing.JLabel lblPlayerOneFight;
    private javax.swing.JLabel lblPlayerTwoFight;
    private javax.swing.JLabel lblStaminaPlayerOne;
    private javax.swing.JLabel lblStaminaPlayerTwo;
    private javax.swing.JTextArea txtArea;
    private javax.swing.JTextField txtLifePlayerOne;
    private javax.swing.JTextField txtLifePlayerTwo;
    private javax.swing.JTextField txtStaminaPlayerOne;
    private javax.swing.JTextField txtStaminaPlayerTwo;
    // End of variables declaration//GEN-END:variables
}
