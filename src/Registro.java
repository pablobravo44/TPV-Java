import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pablo
 */
public class Registro {

    static void addRegistro(String mensaje){
        //Paso 1: Conectar con la base de datos
        if (BD.conexion != null) {
            System.out.println("Conexion realizada con éxito");
        }
        //Paso 2: Ejecutar una consulta
        try {
            String sql = "INSERT INTO registro ( cod_registro , cod_empleado , registro , fecha ) values ( ?, ?, ?, ?)";
            System.out.println("empleado: "+ InicioSesion.empleado.getNombre());
            PreparedStatement pstmt = BD.conexion.prepareStatement(sql);
            Date f = new Date();
            pstmt.setInt(1, numRegistro());
            pstmt.setInt(2, InicioSesion.empleado.getCodigo());
            pstmt.setString(3, mensaje);
            pstmt.setTimestamp(4,new Timestamp(f.getTime()));
            pstmt.executeUpdate();

        } catch (SQLException ex) {
            System.out.println("Error" + ex);
        }
    }
    static int numRegistro(){
        
        int num=0;
        
        if (BD.conexion != null) {
            System.out.println("Conexion realizada con éxito");
        }
        //Paso 2: Ejecutar una consulta
        try {
            String sql = "SELECT max(cod_registro) FROM registro";
            PreparedStatement stmt = BD.conexion.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery(sql);
            if (rs.next()) { //Para leer varias posibles filas se cambia el while por el if
                num=rs.getInt("max(cod_registro)") + 1;
            }
        } catch (SQLException ex) {
            System.out.println("Error");
        }
        
        return num;
    }

}
