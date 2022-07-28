/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import conexao.Conexao;
import model.Usuario;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author Mauro B H Jr
 */
public class UsuarioDAO {

    public void cadUsuario(Usuario uVO) {
        try ( Connection con = Conexao.getConexao();  Statement stat = con.createStatement();) {
            String sql;
            sql = "insert into usuario values(null,"
                    + "'" + uVO.getNomeUsuario() + "',"
                    + "'" + uVO.getUsuario() + "',"
                    + "'" + uVO.getSenha() + "')";
            stat.execute(sql);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,
                    "Erro ao inserir.\n" + e.getMessage(),
                    "Erro", JOptionPane.ERROR_MESSAGE);
        }

    }

    public Usuario getByUsuario(String user) throws SQLException {
        Usuario u = new Usuario();
        try ( Connection con = Conexao.getConexao();  Statement stat = con.createStatement();) {
            String sql;
            sql = "select * from usuario where usuario='" + user + "'";
            ResultSet rs = stat.executeQuery(sql);
            while (rs.next()) {
                u.setIdUsuario(rs.getInt("idUsuario"));
                u.setNomeUsuario(rs.getString("nomeUsuario"));
                u.setUsuario(rs.getString("usuario"));
                u.setSenha(rs.getString("senha"));
            }
        } catch (SQLException e) {
            throw new SQLException("Usuario não encontrado.\n" + e.getMessage());
        }
        return u;
    }

}
