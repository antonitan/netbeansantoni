/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gudang1;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ASUS
 */
public class dataregistrasi extends javax.swing.JFrame {
private DefaultTableModel model=null;
private PreparedStatement stat;
private ResultSet rs;
koneksi k = new koneksi();
    /**
     * Creates new form dataregistrasi
     */
    public dataregistrasi() {
        initComponents();
        k.connect ();
        refreshTable();
    }
class user extends dataregistrasi{
        int id_user,level;
        String username,password;
        
        public user(){
            this.username=usernametxt.getText();
            this.password=passwordtxt.getText();
            this.level=Integer.parseInt(levelcombo.getSelectedItem().toString());
            
        }
    }
    public void refreshTable() { 
model=new DefaultTableModel(); 
model.addColumn("Id_user"); 
model.addColumn("Username"); 
model.addColumn("Password"); 
model.addColumn("Level");
tableuser.setModel(model); 
try {
this.stat=k.getCon().prepareStatement("select * from user"); 
this.rs=this.stat.executeQuery();
while(rs.next()) { 
Object[] data={ rs.getInt("id_user"), 
rs.getString("username"),
rs.getString("password"),
rs.getString("level") 
}; 
model.addRow (data);
}
}catch (Exception e) { 
        JOptionPane.showMessageDialog(null,e.getMessage());
        } 

idusertxt.setText(""); 
usernametxt.setText("");
passwordtxt.setText("");
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        idusertxt = new javax.swing.JTextField();
        usernametxt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        passwordtxt = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        levelcombo = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        inputbtn = new javax.swing.JButton();
        ubahbtn = new javax.swing.JButton();
        hapusbtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableuser = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Data Registrasi");

        jLabel2.setText("Id_user");

        idusertxt.setEnabled(false);

        jLabel3.setText("Username");

        jLabel4.setText("Password");

        jLabel5.setText("Level");

        levelcombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", " " }));

        jButton1.setText("Log out");
        jButton1.setEnabled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        inputbtn.setText("Input");
        inputbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputbtnActionPerformed(evt);
            }
        });

        ubahbtn.setText("Ubah");
        ubahbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ubahbtnActionPerformed(evt);
            }
        });

        hapusbtn.setText("Hapus");
        hapusbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hapusbtnActionPerformed(evt);
            }
        });

        tableuser.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tableuser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableuserMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableuser);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(43, 43, 43)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(60, 60, 60)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(usernametxt)
                            .addComponent(idusertxt)
                            .addComponent(passwordtxt)
                            .addComponent(levelcombo, 0, 233, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(inputbtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
                .addComponent(ubahbtn)
                .addGap(55, 55, 55)
                .addComponent(hapusbtn)
                .addGap(39, 39, 39))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1))
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(idusertxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(usernametxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(passwordtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(levelcombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputbtn)
                    .addComponent(ubahbtn)
                    .addComponent(hapusbtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
Login l= new Login();
l.setVisible(true);
this.setVisible(false);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void inputbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputbtnActionPerformed
        // TODO add your handling code here:
        try{
         user m=new user();
         this.stat=k.getCon().prepareStatement("insert into user values (?,?,?,?)");
         stat.setInt(1,0);
         stat.setString(2,m.username);
         stat.setString(3,m.password);
         stat.setInt(4,m.level);
         stat.executeUpdate();
        }catch (Exception e) { 
        JOptionPane.showMessageDialog(null,e.getMessage());
        }
    }//GEN-LAST:event_inputbtnActionPerformed

    private void ubahbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ubahbtnActionPerformed
     try{
         user m=new user();
         this.stat=k.getCon().prepareStatement("update barang set username=?,"+"password=?"+"level=?");
         stat.setString(1,m.username);
         stat.setString(2,m.password);
         stat.setInt(4,m.level);
         stat.executeUpdate();
        }catch (Exception e) { 
        JOptionPane.showMessageDialog(null,e.getMessage());
        }       // TODO add your handling code here:
    }//GEN-LAST:event_ubahbtnActionPerformed

    private void hapusbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hapusbtnActionPerformed
try{
         user m=new user();
         this.stat=k.getCon().prepareStatement("DELETE FROM user WHERE id_user=?");
         stat.setInt(1,Integer.parseInt(idusertxt.getText()));
         stat.executeUpdate();
        }catch (Exception e) { 
        JOptionPane.showMessageDialog(null,e.getMessage());
        }  
    }//GEN-LAST:event_hapusbtnActionPerformed

    private void tableuserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableuserMouseClicked
idusertxt.setText(model.getValueAt(tableuser.getSelectedRow(),0).toString());
    usernametxt.setText(model.getValueAt(tableuser.getSelectedRow(),1).toString());
    passwordtxt.setText(model.getValueAt(tableuser.getSelectedRow(),2).toString());        // TODO add your handling code here:
    }//GEN-LAST:event_tableuserMouseClicked

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
            java.util.logging.Logger.getLogger(dataregistrasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(dataregistrasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(dataregistrasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(dataregistrasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new dataregistrasi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton hapusbtn;
    private javax.swing.JTextField idusertxt;
    private javax.swing.JButton inputbtn;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> levelcombo;
    private javax.swing.JTextField passwordtxt;
    private javax.swing.JTable tableuser;
    private javax.swing.JButton ubahbtn;
    private javax.swing.JTextField usernametxt;
    // End of variables declaration//GEN-END:variables
}
