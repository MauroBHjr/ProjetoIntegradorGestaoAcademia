/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package services;

/**
 *
 * @author Mauro B H Jr
 */
public class ServicosFactory {
    private static PessoaServicos pessoaServicos = new PessoaServicos();
    public static PessoaServicos getPessoaServicos(){
        return pessoaServicos;
    }
    
    private static UsuarioServicos userServicos = new UsuarioServicos();
    public static UsuarioServicos getUsuarioServicos(){
        return userServicos;
    }
    
}
