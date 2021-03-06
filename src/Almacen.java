import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Blob;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.imageio.ImageIO;
import javax.sql.rowset.serial.SerialBlob;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pablo
 */
public class Almacen extends javax.swing.JFrame {

    static DefaultTableModel modelo = new DefaultTableModel();

    static ArrayList<ImageIcon> imagenes = new ArrayList<ImageIcon>();
    
    public Almacen() {
        initComponents();
        modelo = (DefaultTableModel) Tabla.getModel();
        Tabla.setModel(modelo);
        Tabla.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        cargarArticulos();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnAtras = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla = new javax.swing.JTable();
        btnNombre = new javax.swing.JButton();
        btnPrecio = new javax.swing.JButton();
        btnStock = new javax.swing.JButton();
        btnIVA = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lblImg = new javax.swing.JLabel();
        btnImagen = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gestión Almacén");

        btnAtras.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnAtras.setText("ATRÁS");
        btnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasActionPerformed(evt);
            }
        });

        Tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nombre", "Precio", "Stock", "% IVA"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Double.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Tabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Tabla);

        btnNombre.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnNombre.setText("CAMBIAR NOMBRE");
        btnNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNombreActionPerformed(evt);
            }
        });

        btnPrecio.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnPrecio.setText("CAMBIAR PRECIO");
        btnPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrecioActionPerformed(evt);
            }
        });

        btnStock.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnStock.setText("CAMBIAR STOCK");
        btnStock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStockActionPerformed(evt);
            }
        });

        btnIVA.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnIVA.setText("CAMBIAR % IVA");
        btnIVA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIVAActionPerformed(evt);
            }
        });

        btnImagen.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnImagen.setText("CAMBIAR IMAGEN");
        btnImagen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImagenActionPerformed(evt);
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
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 542, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnNombre)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnImagen)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel1))
                            .addComponent(btnPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnStock, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(btnAtras, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnIVA, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblImg, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblImg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnNombre)
                                    .addComponent(btnImagen))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnPrecio)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnStock)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnIVA)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnAtras))
                            .addComponent(jLabel1))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed

        
        Menu m = new Menu();
        m.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnAtrasActionPerformed

    private void btnNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNombreActionPerformed
    
        if(Tabla.getSelectedRow()==-1){
            return;
        }
        String nuevoNombre = JOptionPane.showInputDialog(null,"Introduce el nuevo nombre","");
        
        //Paso 1: Conectar con la base de datos
        int cod = Integer.parseInt(String.valueOf(modelo.getValueAt(Tabla.getSelectedRow(),0)));
        if (BD.conexion != null) {
            System.out.println("Conexion realizada con éxito");
        }
        //Paso 2: Ejecutar una consulta
        try {
            String sql = "update articulo set nombre = '"+nuevoNombre+"' where cod_articulo="+cod+";";
            PreparedStatement pstmt = BD.conexion.prepareStatement(sql);
            pstmt.executeUpdate();
            
        } catch (SQLException ex) {
            System.out.println("Error" + ex);
        }
        String art=String.valueOf(modelo.getValueAt(Tabla.getSelectedRow(),1));
        Registro.addRegistro("El empleado "+InicioSesion.empleado.getNombre()+" "+InicioSesion.empleado.getApellido()+" cambió el nombre de "+art+" a "+nuevoNombre);
        cargarArticulos();
    }//GEN-LAST:event_btnNombreActionPerformed

    private void btnPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrecioActionPerformed
    
        if(Tabla.getSelectedRow()==-1){
            return;
        }
        boolean continuar=false;
        String s;
        Double nuevoPrecio =0.0;
        do{
            s=JOptionPane.showInputDialog(null,"Introduce el nuevo precio","");
            try{
                nuevoPrecio = Double.parseDouble(s);
                if(nuevoPrecio<=0 || nuevoPrecio>9999){
                    JOptionPane.showMessageDialog(this, "El precio debe ser mayor que 0 y menor o igual que 9999", "Error", JOptionPane.ERROR_MESSAGE);
                    continuar=false;
                }
                else{
                    continuar=true; 
                }
                
            }
            catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Debes introducir un número válido", "Error", JOptionPane.ERROR_MESSAGE);
            } 
        }while(!continuar);

        
        //Paso 1: Conectar con la base de datos
        int cod = Integer.parseInt(String.valueOf(modelo.getValueAt(Tabla.getSelectedRow(),0)));
        if (BD.conexion != null) {
            System.out.println("Conexion realizada con éxito");
        }
        //Paso 2: Ejecutar una consulta
        try {
            String sql = "update articulo set precio = "+nuevoPrecio+" where cod_articulo="+cod+";";
            PreparedStatement pstmt = BD.conexion.prepareStatement(sql);
            pstmt.executeUpdate();
            
        } catch (SQLException ex) {
            System.out.println("Error" + ex);
        }
        Registro.addRegistro("El empleado "+InicioSesion.empleado.getNombre()+" "+InicioSesion.empleado.getApellido()+" cambió el precio de "+String.valueOf(modelo.getValueAt(Tabla.getSelectedRow(),1))+" a "+nuevoPrecio);
        cargarArticulos();
    }//GEN-LAST:event_btnPrecioActionPerformed

    private void btnStockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStockActionPerformed
    
        if(Tabla.getSelectedRow()==-1){
            return;
        }
        int nuevoStock;
     
        while(true){
            nuevoStock=Integer.parseInt(JOptionPane.showInputDialog(null,"Introduce el nuevo stock",""));
            if(nuevoStock<0 || nuevoStock>9999){
                JOptionPane.showMessageDialog(this, "El stock debe estar en 0 y 9999", "Error", JOptionPane.ERROR_MESSAGE);
                continue;
            }
            else{
                break;
            }
        }

        //Paso 1: Conectar con la base de datos
        int cod = Integer.parseInt(String.valueOf(modelo.getValueAt(Tabla.getSelectedRow(),0)));
        if (BD.conexion != null) {
            System.out.println("Conexion realizada con éxito");
        }
        //Paso 2: Ejecutar una consulta
        try {
            String sql = "update articulo set stock = "+nuevoStock+" where cod_articulo="+cod+";";
            PreparedStatement pstmt = BD.conexion.prepareStatement(sql);
            pstmt.executeUpdate();
            
        } catch (SQLException ex) {
            System.out.println("Error" + ex);
        }
        Registro.addRegistro("El empleado "+InicioSesion.empleado.getNombre()+" "+InicioSesion.empleado.getApellido()+" cambió el stock de "+String.valueOf(modelo.getValueAt(Tabla.getSelectedRow(),1))+" a "+nuevoStock);
        cargarArticulos();
    }//GEN-LAST:event_btnStockActionPerformed

    private void btnIVAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIVAActionPerformed
    
        if(Tabla.getSelectedRow()==-1){
            return;
        }
        int nuevoIVA;
     
        while(true){
            nuevoIVA=Integer.parseInt(JOptionPane.showInputDialog(null,"Introduce el nuevo stock",""));
            if(nuevoIVA<0 || nuevoIVA>100){
                JOptionPane.showMessageDialog(this, "El stock debe estar en 0 y 100", "Error", JOptionPane.ERROR_MESSAGE);
            }
            else{
                break;
            }
        }

        //Paso 1: Conectar con la base de datos
        int cod = Integer.parseInt(String.valueOf(modelo.getValueAt(Tabla.getSelectedRow(),0)));
        if (BD.conexion != null) {
            System.out.println("Conexion realizada con éxito");
        }
        //Paso 2: Ejecutar una consulta
        try {
            String sql = "update articulo set porcentaje_iva = "+nuevoIVA+" where cod_articulo="+cod+";";
            PreparedStatement pstmt = BD.conexion.prepareStatement(sql);
            pstmt.executeUpdate();
            
        } catch (SQLException ex) {
            System.out.println("Error" + ex);
        }
        Registro.addRegistro("El empleado "+InicioSesion.empleado.getNombre()+" "+InicioSesion.empleado.getApellido()+" cambió el IVA de "+String.valueOf(modelo.getValueAt(Tabla.getSelectedRow(),1))+" a "+nuevoIVA);
        cargarArticulos();
    }//GEN-LAST:event_btnIVAActionPerformed

    private void TablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaMouseClicked
    
        if(Tabla.getSelectedRow()==-1){
            return;
        }
        int c = Tabla.getSelectedRow();
        Icon fondo = new ImageIcon(imagenes.get(c).getImage().getScaledInstance(lblImg.getWidth(), lblImg.getHeight(), Image.SCALE_DEFAULT));
        lblImg.setIcon(fondo);
        lblImg.repaint();
    }//GEN-LAST:event_TablaMouseClicked

    private void btnImagenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImagenActionPerformed

        boolean img=false;
        JFileChooser fileChooser = new JFileChooser();
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("JPG y PNG","jpg","png");
        
        fileChooser.setFileFilter(filtro);
        int r = fileChooser.showOpenDialog(null);
        byte[] imagenArticulo = null;
        
        if (r==JFileChooser.APPROVE_OPTION){

        try{
            File file = fileChooser.getSelectedFile();
            ImageIcon imagen = new ImageIcon(file.getAbsolutePath());
            imagenArticulo = new byte[(int)file.length()];            
            FileInputStream leerFichero = new FileInputStream(file);
            leerFichero.read(imagenArticulo);
            SerialBlob crearImagenArticulo = new SerialBlob(imagenArticulo);
            }
        catch(Exception ex){        
            JOptionPane.showMessageDialog(null, "Error abriendo la                   imagen "+ ex);        
            }
    
        }
        
        
        //Paso 1: Conectar con la base de datos
        int cod = Integer.parseInt(String.valueOf(modelo.getValueAt(Tabla.getSelectedRow(),0)));
        if (BD.conexion != null) {
            System.out.println("Conexion realizada con éxito");
        }
        //Paso 2: Ejecutar una consulta
        try {
            Statement statement = BD.conexion.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
            ResultSet resultset = statement.executeQuery("SELECT * FROM articulo WHERE cod_articulo = " + cod);
            resultset.next();
            SerialBlob crearImagenArticulo = new SerialBlob(imagenArticulo);
            resultset.updateBlob("imagen", crearImagenArticulo);
            resultset.updateRow();
        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Error al modificar la imagen en la base de datos:\n " + ex.getMessage(), "Error al modificar", JOptionPane.WARNING_MESSAGE);
            return;
        }
        Registro.addRegistro("El empleado "+InicioSesion.empleado.getNombre()+" "+InicioSesion.empleado.getApellido()+" cambió la imagen de "+String.valueOf(modelo.getValueAt(Tabla.getSelectedRow(),1)));
        cargarArticulos();
        
    }//GEN-LAST:event_btnImagenActionPerformed

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
            java.util.logging.Logger.getLogger(Almacen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Almacen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Almacen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Almacen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Almacen().setVisible(true);
            }
        });
    }
    
    static void cargarArticulos(){
       
        for (int i = 0; i < Tabla.getRowCount(); i++) {     //Borramos la tabla
            modelo.removeRow(i);
            i -= 1;
        }
        imagenes.clear();                                   //Borramos todas las imágenes
        //Paso 1: Conectar con la base de datos
        if(BD.conexion != null) {
            System.out.println("Conexion realizada con éxito");
            }
        
        try{
        ResultSet rs = null;
        Statement sentencia = BD.conexion.createStatement();
        String sql = "SELECT * FROM articulo";
        rs = sentencia.executeQuery(sql);
        //Paso 3: Extrayendo los datos del resultset
        while(rs.next()) {
            //Recuperar datos por el nombre de la columna
            int cod_articulo = rs.getInt("cod_articulo");
            String nombre = rs.getString("nombre");
            double precio = rs.getDouble("precio");
            int stock = rs.getInt("stock");
            int porcentaje_iva = rs.getInt("porcentaje_iva");
            byte[] img = rs.getBytes("imagen");
            
            modelo.addRow(new Object[]{ cod_articulo , nombre , precio , stock , porcentaje_iva });
            ImageIcon icon = new ImageIcon(img);
            imagenes.add(icon);
                
        }
            }
        catch (SQLException ex) {
            System.out.println("Error");
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private static javax.swing.JTable Tabla;
    private javax.swing.JButton btnAtras;
    private javax.swing.JButton btnIVA;
    private javax.swing.JButton btnImagen;
    private javax.swing.JButton btnNombre;
    private javax.swing.JButton btnPrecio;
    private javax.swing.JButton btnStock;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblImg;
    // End of variables declaration//GEN-END:variables
}
