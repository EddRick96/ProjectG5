import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class PantallaRegistro extends javax.swing.JFrame {
    
    String [][] player;
    DefaultTableModel tblModelCreatePlayer;
    
    int cont=0;
    
    ArrayList<Object> listPlayers = new ArrayList<>();
    //ArrayList<Player> listPlayersP = new ArrayList<Player>();
//    DefaultComboBoxModel listaMateriasModel = 
//            new DefaultComboBoxModel(listaMaterias.toArray());
    
    
    ClsControlador controller = new ClsControlador();

    public PantallaRegistro() {
        initComponents();
        this.setTitle("Register Screen");
        this.setLocationRelativeTo(null);
        
        listPlayers = controller.extraerObjetos("listPlayers.dat");
        fullCombo();
        fillTablePlayers();
        if(listPlayers.size() > 0){
            Player ultimo = (Player) listPlayers.get(listPlayers.size()-1);
            cont = ultimo.getCont();
        }
                
        /*no es necesario crear un tblamodel xq ya tenemos la funcion fillTablePlayers*/
//        
//        
//        String titleTablePlayers[] = new String [] {
//            "N°:", "Name:","Last Name:", "Id:","User", "Victories"
//        };
//        
//        tblModelCreatePlayer = new DefaultTableModel(player,titleTablePlayers); 
//        tblCreatePlayers.setModel(tblModelCreatePlayer);
        
        btnChange.setEnabled(false);
        btnDelete.setEnabled(false);

    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cmbId = new javax.swing.JComboBox<>();
        txtName = new javax.swing.JTextField();
        txtLastName = new javax.swing.JTextField();
        txtId = new javax.swing.JTextField();
        txtUser = new javax.swing.JTextField();
        lblName = new javax.swing.JLabel();
        lblLastName = new javax.swing.JLabel();
        lblId = new javax.swing.JLabel();
        lblUser = new javax.swing.JLabel();
        btnChange = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCreatePlayers = new javax.swing.JTable();
        btnCreate = new javax.swing.JButton();
        btnGoToSelectCharacters = new javax.swing.JButton();
        jlbFondoRegistro = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(553, 577));
        setPreferredSize(new java.awt.Dimension(530, 620));
        setSize(new java.awt.Dimension(200, 200));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cmbId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbIdActionPerformed(evt);
            }
        });
        getContentPane().add(cmbId, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 33, 238, -1));
        getContentPane().add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(177, 95, 191, -1));

        txtLastName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLastNameActionPerformed(evt);
            }
        });
        getContentPane().add(txtLastName, new org.netbeans.lib.awtextra.AbsoluteConstraints(177, 126, 191, -1));
        getContentPane().add(txtId, new org.netbeans.lib.awtextra.AbsoluteConstraints(177, 157, 191, -1));
        getContentPane().add(txtUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(177, 195, 191, -1));

        lblName.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblName.setText("Name:");
        getContentPane().add(lblName, new org.netbeans.lib.awtextra.AbsoluteConstraints(128, 98, -1, -1));

        lblLastName.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblLastName.setText("Last Name:");
        getContentPane().add(lblLastName, new org.netbeans.lib.awtextra.AbsoluteConstraints(105, 129, -1, -1));

        lblId.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblId.setText("Id:");
        getContentPane().add(lblId, new org.netbeans.lib.awtextra.AbsoluteConstraints(145, 160, -1, -1));

        lblUser.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblUser.setText("User:");
        getContentPane().add(lblUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(133, 198, -1, -1));

        btnChange.setText("Change");
        btnChange.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChangeActionPerformed(evt);
            }
        });
        getContentPane().add(btnChange, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 300, 89, 48));

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        getContentPane().add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 300, 86, 41));

        tblCreatePlayers.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "N°", "Name", "Last Name", "Id", "User", "Victories"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblCreatePlayers);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 370, -1, 137));

        btnCreate.setText("Create");
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });
        getContentPane().add(btnCreate, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, 86, 41));

        btnGoToSelectCharacters.setText("Go to Select Characters");
        btnGoToSelectCharacters.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGoToSelectCharactersActionPerformed(evt);
            }
        });
        getContentPane().add(btnGoToSelectCharacters, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 520, -1, 46));

        jlbFondoRegistro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Mechtanium_Surge_logo.png"))); // NOI18N
        getContentPane().add(jlbFondoRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 520, 580));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtLastNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLastNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLastNameActionPerformed

    private void btnGoToSelectCharactersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGoToSelectCharactersActionPerformed
        // TODO add your handling code here:
        
        PantallaJuego Obj = new PantallaJuego();
        Obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnGoToSelectCharactersActionPerformed

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
        
        String name = txtName.getText();
        String lastName = txtLastName.getText();
        String iD = txtId.getText();
        String user = txtUser.getText();
        
        boolean correct = false;
        
        if(!name.equals("") && !lastName.equals("") && !iD.equals("") && !user.equals("")){
            
            cont++;
            
            Player newPlayer = new Player(cont, name, lastName,iD ,user);                   
            for(Object p1 :  listPlayers = controller.extraerObjetos("listPlayers.dat")){
                //System.out.println("1. "+p1.toString());
                //System.out.println("2. "+newPlayer.getUser());
                Player.combox = 0;
                if(p1.toString().equals(newPlayer.getId())){
                    correct = true;
                    break;
                }
                Player.combox = 1;
                if(p1.toString().equals(newPlayer.getUser())){
                    correct = true;
                    break;
                }
            }  
            if(!correct){
                listPlayers.add(newPlayer);
                //listPlayersP.add(newPlayer);
                controller.escribirObjeto("listPlayers.dat", listPlayers);
                listPlayers =controller.extraerObjetos("listPlayers.dat");

                clean();
                fullCombo();

                Object[] playersG = {newPlayer.getCont(), newPlayer.getName(),newPlayer.getLastName(),newPlayer.getId(),newPlayer.getUser(), newPlayer.getVictories()};
                DefaultTableModel model = (DefaultTableModel)tblCreatePlayers.getModel();
                model.addRow(playersG);
            }else{
                JOptionPane.showMessageDialog(rootPane, "please, the id and username already exists enter others.",
                        "Alert!", 0);
            }
            
            
        }else{
            JOptionPane.showMessageDialog(rootPane, "Please, fill in all fields.","Message",0);
        }
    }//GEN-LAST:event_btnCreateActionPerformed

    private void cmbIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbIdActionPerformed
                
        Player playerSelected = (Player)cmbId.getSelectedItem();
        txtName.setText(playerSelected.getName());
        txtLastName.setText(playerSelected.getLastName());
        txtId.setText(playerSelected.getId());
        txtUser.setText(playerSelected.getUser());
        
        btnChange.setEnabled(true);
        btnDelete.setEnabled(true);
        btnCreate.setEnabled(false);

    }//GEN-LAST:event_cmbIdActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        
        Player playerSelected = (Player)cmbId.getSelectedItem();
        DefaultTableModel model = (DefaultTableModel) tblCreatePlayers.getModel();
        model.removeRow (cmbId.getSelectedIndex());
        listPlayers.remove(playerSelected);
        controller.escribirObjeto("listPlayers.dat",listPlayers );
        fullCombo();
        clean();
        btnChange.setEnabled(false);
        btnDelete.setEnabled(false);

        
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnChangeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChangeActionPerformed
        
        Player playerSelected = (Player)cmbId.getSelectedItem();
        playerSelected.setName(txtName.getText());
        playerSelected.setLastName(txtLastName.getText());
        playerSelected.setId(txtId.getText());
        playerSelected.setUser(txtUser.getText());
        
        Object playersG [] = {playerSelected.getCont() ,playerSelected.getName(),playerSelected.getLastName(), playerSelected.getId(), playerSelected.getUser(), playerSelected.getVictories()};
        DefaultTableModel model = (DefaultTableModel) tblCreatePlayers.getModel();
        model.removeRow(cmbId.getSelectedIndex());
        listPlayers.remove(cmbId.getSelectedIndex());
        model.insertRow(cmbId.getSelectedIndex(), playersG);
        listPlayers.add(cmbId.getSelectedIndex(), playerSelected);
        controller.escribirObjeto("listPlayers.dat", listPlayers);
        fullCombo();
        clean();
        btnChange.setEnabled(false);
        btnDelete.setEnabled(false);
    }
    
    
    
    public void fullCombo(){
        if(listPlayers.size() > 0){
            cmbId.setEnabled(true);
            listPlayers = controller.extraerObjetos("listPlayers.dat");
            Player.combox=0;
            cmbId.setModel(new javax.swing.DefaultComboBoxModel(listPlayers.toArray()));
        }else{
            cmbId.setEnabled(false);
        }
    }
    
    
    public void clean(){
        txtName.setText(null);
        txtLastName.setText(null);
        txtId.setText(null);
        txtUser.setText(null);
        btnCreate.setEnabled(true);
    }
    
    public void fillTablePlayers(){
        
        if(listPlayers.size() > 0){
            
            Player playerSelected = new Player();
            DefaultTableModel model = (DefaultTableModel) tblCreatePlayers.getModel();
            for(int i = 0; i < listPlayers.size(); i ++){
                playerSelected = (Player) listPlayers.get(i);
                Object playersG [] = {playerSelected.getCont(),playerSelected.getName(), playerSelected.getLastName(), 
                                      playerSelected.getId(), playerSelected.getUser(), playerSelected.getVictories()};
                model.insertRow(i, playersG);
            }
        }
  
        
    }//GEN-LAST:event_btnChangeActionPerformed

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
            java.util.logging.Logger.getLogger(PantallaRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PantallaRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PantallaRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PantallaRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PantallaRegistro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnChange;
    private javax.swing.JButton btnCreate;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnGoToSelectCharacters;
    private javax.swing.JComboBox<String> cmbId;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jlbFondoRegistro;
    private javax.swing.JLabel lblId;
    private javax.swing.JLabel lblLastName;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblUser;
    private javax.swing.JTable tblCreatePlayers;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtLastName;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables
}

