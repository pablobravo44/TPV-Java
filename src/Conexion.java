


import Objetos.BaseDatos;
import java.sql.Connection;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pablo
 */
public class Conexion{
public static Connection mySQL(BaseDatos bd) {
        java.sql.Connection con = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            java.util.Properties props = new java.util.Properties();
            props.put("charSet", "iso-8859-1");
            props.put("user", bd.getUser());
            props.put("password", bd.getContra());
            String url = "jdbc:mysql://" + bd.getUrl() + "/" + bd.getBasedatos();
            con = (java.sql.Connection) java.sql.DriverManager.getConnection(url, props);
            return (Connection) con;
        } catch (java.sql.SQLException e) {
            System.out.println("SQL Exception: " + e.toString());
            return null;
        } catch (ClassNotFoundException e) {
            System.out.println("Class Not Found Exception: " + e.toString());
            return null;
        }
    }
        }

