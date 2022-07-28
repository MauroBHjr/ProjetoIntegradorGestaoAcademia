/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Mauro B H Jr
 */
public class Validacao {
    private boolean loginSucedido;

    public Validacao(boolean loginSucedido) {
        this.loginSucedido = loginSucedido;
    }

    public Validacao() {
    }

    public boolean isLoginSucedido() {
        return loginSucedido;
    }

    public void setLoginSucedido(boolean loginSucedido) {
        this.loginSucedido = loginSucedido;
    }
    
    
    
}
