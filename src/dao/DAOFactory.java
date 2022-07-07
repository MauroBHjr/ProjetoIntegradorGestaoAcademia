/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

/**
 *
 * @author Mauro B H Jr
 */
public class DAOFactory {
    private static PessoaDAO personDAO = new PessoaDAO();
    public static PessoaDAO getPessoaDAO(){
        return personDAO;
    }
    
    
    
    
}
