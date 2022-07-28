/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import conexao.Conexao;
import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
import model.Usuario;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import static view.telaLoginFuncionario.geraSenha;

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
            sql = "select * from usuario where usuario = '" + user + "'";
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

    public ArrayList<Usuario> listaUsuarios() throws SQLException {
        try ( Connection con = Conexao.getConexao();  Statement stat = con.createStatement();) {
            String sql;
            sql = "select idUsuario, nomeUsuario, usuario from usuario";
            ResultSet rs = stat.executeQuery(sql);
            ArrayList<Usuario> usuarios = new ArrayList<>();
            while (rs.next()) {
                Usuario u = new Usuario();
                u.setIdUsuario(rs.getInt("idUsuario"));
                u.setNomeUsuario(rs.getString("nomeUsuario"));
                u.setUsuario(rs.getString("usuario"));
                usuarios.add(u);
            }
            return usuarios;
        } catch (SQLException e) {
            throw new SQLException("Erro ao listar usuários!\n"
                    + e.getMessage());
        }
    }

    public void atualizarUsuario(Usuario uVO) throws SQLException, NoSuchAlgorithmException, UnsupportedEncodingException {
        String sql;
        sql = "update usuario set nomeUsuario = ?, senha = ? where idUsuario = ?";
        try ( Connection con = Conexao.getConexao();  PreparedStatement pStat = con.prepareStatement(sql);) {
            pStat.setString(1, uVO.getNomeUsuario());
            pStat.setString(2, geraSenha(uVO.getSenha()));
            pStat.setInt(3, uVO.getIdUsuario());
            pStat.executeUpdate();
        } catch (SQLException e) {
            throw new SQLException("Erro ao atualizar.\n" + e.getMessage());
        }
    }

    public void deletarUsuario(int id) throws SQLException {
        String sql;
        sql = "delete from usuario where idUsuario = ?";
        try ( Connection con = Conexao.getConexao();  PreparedStatement pStat = con.prepareStatement(sql);) {
            pStat.setInt(1, id);
            pStat.execute();
        } catch (SQLException e) {
            throw new SQLException("Erro ao deletar.\n" + e.getMessage());
        }
    }

}
