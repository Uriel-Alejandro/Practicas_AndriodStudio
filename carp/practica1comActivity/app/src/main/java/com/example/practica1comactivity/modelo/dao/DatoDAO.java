package com.example.practica1comactivity.modelo.dao;

import com.example.practica1comactivity.modelo.dto.Datos.DTO;

import java.sql.PreparedStatement;

public class DatoDAO extends ConexionDB {
    protected PreparedStatement ps = null;
    private String SQLINSERT = "INSERT INTO dato (`id`, `nombre`, `correo`) VALUES (?,?,?)";
    public boolean insertarDato (DTO dto) {
        try {
            ps = conn.prepareStatement(SQLINSERT);
            ps.setInt(1, dto.getId());
            ps.setString(1, dto.getNombre());
            ps.setString(1, dto.getCorreo());
            ps.executeUpdate();
            ps.close();
            System.out.println("Insertado");
            return (true);
        } catch (Exception e) {
            System.out.println("No Insertado");
            return (false);

        }
    }
}
