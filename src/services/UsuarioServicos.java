/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package services;

import dao.DAOFactory;
import dao.UsuarioDAO;
import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
import model.Usuario;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Mauro B H Jr
 */
public class UsuarioServicos {
    private final UsuarioDAO userDAO = DAOFactory.getUsuarioDAO();
    
    public void cadUsuarioServices(Usuario uVO) throws SQLException{
        userDAO.cadUsuario(uVO);
    }
    
    public ArrayList<Usuario> getUsuarios() throws SQLException{
        return userDAO.listaUsuarios();
    }
    
    public Usuario getByUsuario(String user) throws SQLException {
        return userDAO.getByUsuario(user);
    }

    public void atualizarUsuario(Usuario uVO) throws SQLException,
            NoSuchAlgorithmException, UnsupportedEncodingException {
        userDAO.atualizarUsuario(uVO);
    }

    public void deletarUsuario(int id) throws SQLException {
        userDAO.deletarUsuario(id);
    }
    
}
