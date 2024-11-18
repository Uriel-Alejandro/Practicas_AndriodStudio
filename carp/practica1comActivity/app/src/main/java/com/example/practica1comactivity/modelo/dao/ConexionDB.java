package com.example.practica1comactivity.modelo.dao;

import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionDB {
    protected java.sql.Connection conn;
    public ConexionDB(){
    try {
        conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/basechida","root","");
        System.out.println("Conexion exitosa");

    }catch (SQLException ex){
        System.out.println("Fallo la conexion");

    }
    }
}
