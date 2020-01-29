import Objetos.BaseDatos;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pablo Bravo
 */
public class BD extends javax.swing.JFrame {

    static DefaultComboBoxModel modelo = new DefaultComboBoxModel();
    
    public static Connection conexion=null;
    
    static int e=0;
    
    public BD() {
        initComponents();
        if(cargarBD()==-1){
            JOptionPane.showMessageDialog(this, "No se encontró el archivo bd.txt, iniciando en remoto...", "Error", JOptionPane.ERROR_MESSAGE);
            conexion = Conexion.mySQL(new BaseDatos("remotemysql.com:3306","uwUNNVp4Ac","uwUNNVp4Ac","TQI3LGYIqA","remotemysql ( por defecto )"));
            if(conexion!=null){
                InicioSesion i = new InicioSesion();
                i.setVisible(true);
                this.setVisible(false);
            }
        }
        ComboBox.setModel(modelo);
        ComboBox.setSelectedIndex(0);
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
        btnAceptar = new javax.swing.JButton();
        lblUrl = new javax.swing.JLabel();
        txtBd = new javax.swing.JTextField();
        lblBD = new javax.swing.JLabel();
        txtUrl = new javax.swing.JTextField();
        lblUser = new javax.swing.JLabel();
        txtUser = new javax.swing.JTextField();
        lblContra = new javax.swing.JLabel();
        txtContra = new javax.swing.JPasswordField();
        ComboBox = new javax.swing.JComboBox<>();
        lblPerfil = new javax.swing.JLabel();
        txtDescripcion = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        btnBorrar = new javax.swing.JButton();
        checkBox = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Selección Base Datos");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("SELECCIONA UN BD PARA INICIAR EL PROGRAMA");

        btnAceptar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnAceptar.setText("INICIAR");
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });

        lblUrl.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblUrl.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblUrl.setText("URL");

        txtBd.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        lblBD.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblBD.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblBD.setText("BASE DATOS");

        txtUrl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtUrl.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtUrlFocusGained(evt);
            }
        });

        lblUser.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblUser.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblUser.setText("USUARIO");

        txtUser.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        lblContra.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblContra.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblContra.setText("CONTRASEÑA");

        ComboBox.setModel(new javax.swing.DefaultComboBoxModel());
        ComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBoxActionPerformed(evt);
            }
        });

        lblPerfil.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblPerfil.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblPerfil.setText("DESCRIPCIÓN");

        txtDescripcion.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        btnGuardar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnGuardar.setText("GUARDAR PERFIL");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnBorrar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnBorrar.setText("BORRAR PERFIL");
        btnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarActionPerformed(evt);
            }
        });

        checkBox.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        checkBox.setText("BD en local");
        checkBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkBoxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblUser, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(lblPerfil, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(lblBD, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addComponent(lblContra)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtBd, javax.swing.GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE)
                                            .addComponent(txtDescripcion, javax.swing.GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE)
                                            .addComponent(txtUser, javax.swing.GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE)
                                            .addComponent(txtContra)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(lblUrl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtUrl, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
                            .addComponent(btnAceptar, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
                            .addComponent(btnBorrar, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
                            .addComponent(checkBox, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 464, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUrl, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblUrl, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(checkBox, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBd, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblBD, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUser, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblUser, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtContra, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblContra, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGuardar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBorrar))
                .addGap(26, 26, 26))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
    
        BaseDatos bd = (BaseDatos) modelo.getElementAt(ComboBox.getSelectedIndex());
        conexion = Conexion.mySQL(bd);
        if(conexion!=null){
            InicioSesion i = new InicioSesion();
            i.setVisible(true);
            this.setVisible(false);
        }
        else{
            JOptionPane.showMessageDialog(this, "La conexión es errónea, vuelve a intentarlo", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

    
    }//GEN-LAST:event_btnAceptarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed

        
        BaseDatos n = new BaseDatos(txtBd.getText(),txtUrl.getText(),txtUser.getText(),txtContra.getText(),txtDescripcion.getText());
        modelo.insertElementAt(n,ComboBox.getItemCount()-1);

        escribirFichero();
        
        txtBd.setText("");
        txtUrl.setText("");
        txtUser.setText("");
        txtContra.setText("");
        txtDescripcion.setText("");
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

        if(e==-1){
            JOptionPane.showMessageDialog(null, "No se encontró el archivo 'bd.txt', Iniciando con Base de Datos por internet", "ERROR", JOptionPane.WARNING_MESSAGE);
            conexion = Conexion.mySQL(new BaseDatos( "remotemysql.com:3306", "uwUNNVp4Ac", "uwUNNVp4Ac" , "TQI3LGYIqA" , "remotemysql ( por defecto )"));
            InicioSesion i = new InicioSesion();
            i.setVisible(true);
            this.setVisible(false); 
        }
    }//GEN-LAST:event_formWindowOpened

    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed

        modelo.removeElementAt(ComboBox.getSelectedIndex());
        ComboBox.setSelectedIndex(0);
        
        escribirFichero();
        
        txtBd.setText("");
        txtUrl.setText("");
        txtUser.setText("");
        txtContra.setText("");
        txtDescripcion.setText("");
    }//GEN-LAST:event_btnBorrarActionPerformed

    private void checkBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkBoxActionPerformed
        
        if(checkBox.isSelected()==true){
            txtUrl.setText("localhost:3306");
            txtUrl.setEditable(false);
        }
        if(checkBox.isSelected()==false){
            txtUrl.setText("");
            txtUrl.setEditable(true); 
        }
        if(ComboBox.getSelectedIndex()==0){
            return;
        }
        btnGuardar.setEnabled(true);
    }//GEN-LAST:event_checkBoxActionPerformed

    private void ComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBoxActionPerformed
    
        BaseDatos bd = (BaseDatos) modelo.getElementAt(ComboBox.getSelectedIndex());

        if(ComboBox.getSelectedIndex()==0){
            btnGuardar.setEnabled(false);
            btnBorrar.setEnabled(false);
            checkBox.setEnabled(false);
            txtUrl.setEditable(false);
            txtBd.setEditable(false);
            txtUser.setEditable(false);
            txtContra.setEditable(false);
            txtDescripcion.setEditable(false);
        } 
        else if(ComboBox.getSelectedIndex()==ComboBox.getItemCount()-1){
            btnGuardar.setEnabled(false);
            btnBorrar.setEnabled(false);
            checkBox.setEnabled(true);
            txtUrl.setEditable(true);
            txtBd.setEditable(true);
            txtUser.setEditable(true);
            txtContra.setEditable(true);
            txtDescripcion.setEditable(true);
        }
        else{
            btnGuardar.setEnabled(true);
            btnBorrar.setEnabled(true);
            checkBox.setEnabled(true);
            txtUrl.setEditable(true);
            txtBd.setEditable(true);
            txtUser.setEditable(true);
            txtContra.setEditable(true);
            txtDescripcion.setEditable(true);
        }

        
        txtUrl.setText(bd.getUrl());
        txtBd.setText(bd.getBasedatos());
        txtUser.setText(bd.getUser());
        txtContra.setText(bd.getContra());
        txtDescripcion.setText(bd.getDescripcion());
    }//GEN-LAST:event_ComboBoxActionPerformed

    private void txtUrlFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUrlFocusGained

        if(ComboBox.getSelectedIndex()==0){
            return;
        }
        btnGuardar.setEnabled(true);
        
    }//GEN-LAST:event_txtUrlFocusGained

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
            java.util.logging.Logger.getLogger(BD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BD().setVisible(true);
            }
        });
    }
  
    static int cargarBD(){
        FileReader fr;
        BufferedReader fichero;
        String url,bd,user,pass,descripcion;
        try {
            fr = new FileReader("bd.txt");
            fichero = new BufferedReader(fr);
            
            url=fichero.readLine();
            while(url!=null){
                bd=fichero.readLine();
                user=fichero.readLine();
                pass=fichero.readLine();
                descripcion=fichero.readLine();
                modelo.addElement(new BaseDatos(url.replaceAll("\\s*$",""),bd,user,pass,descripcion));
                url=fichero.readLine();
            }
            fichero.close();
            fr.close();
            
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(BD.class.getName()).log(Level.SEVERE, null, ex);
            return -1;
        } catch (IOException ex) {
            Logger.getLogger(BD.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        modelo.addElement(new BaseDatos("url", "basedatos","usuario","contraseña","Nuevo perfil"));
        btnGuardar.setEnabled(false);
        btnBorrar.setEnabled(false);
        return 0;
    }
    
    static void escribirFichero(){
        try {
            FileWriter fw = new FileWriter("bd.txt");
            BufferedWriter fichero = new BufferedWriter(fw);
            
            for(int i=0;i<modelo.getSize()-1;i++){
                BaseDatos b = (BaseDatos) modelo.getElementAt(i);
                fichero.write(b.getUrl()+"\r\n");
                fichero.write(b.getBasedatos()+"\r\n");
                fichero.write(b.getUser()+"\r\n");
                fichero.write(b.getContra()+"\r\n");
                fichero.write(b.getDescripcion()+"\r\n");
            }
            
            fichero.close();
            fw.close();
            
        } catch (IOException ex) {
            Logger.getLogger(BD.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private static javax.swing.JComboBox<String> ComboBox;
    private javax.swing.JButton btnAceptar;
    private static javax.swing.JButton btnBorrar;
    private static javax.swing.JButton btnGuardar;
    private javax.swing.JCheckBox checkBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblBD;
    private javax.swing.JLabel lblContra;
    private javax.swing.JLabel lblPerfil;
    private javax.swing.JLabel lblUrl;
    private javax.swing.JLabel lblUser;
    private javax.swing.JTextField txtBd;
    private javax.swing.JPasswordField txtContra;
    private javax.swing.JTextField txtDescripcion;
    private javax.swing.JTextField txtUrl;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables
}
