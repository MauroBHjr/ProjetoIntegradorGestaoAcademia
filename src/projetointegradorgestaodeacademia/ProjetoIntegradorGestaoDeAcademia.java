/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package projetointegradorgestaodeacademia;

import dao.PessoaDAO;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Mauro B H Jr
 */


/* Ianda não sei explicar exatamente o que é o método com ActionListener
eu deveria assistir algum vídeo explciando em maiores detalhes, mas falta tempo */
public class ProjetoIntegradorGestaoDeAcademia implements ActionListener {
    
    /*Em teoria, o DAO é substituto para o controller, certo?
    Então eu vou fazer assim A MENOS QUE exista uma forma mais adequada
    para fazer com Padrão Factory */
    public static PessoaDAO cadPessoaDAO = new PessoaDAO();
    
    
    /* Usando o CadastroPessoaJFDAO, vou iniciar minha aplciação com swing
    talvez eu crie outra tela inicial ou refatore essa janela para uma janela
    de login */
    JFrame PrimeiraJanela = new JFrame("Futura Tela de Login");
    JPanel painel = new JPanel();
    //talvez ue insira um JTextField para usuário e outro JPasswordField para senha
    // e então refatore os botões para "Entrar" e "Encerrar"
    JButton btnCadPessoa = new JButton("Matricular Aluno");
    JButton btnCadUser = new JButton("Cadastrar Funcionário");
    
    // Em teoria, aqui que estamos realmente criando a janela e etc
    private ProjetoIntegradorGestaoDeAcademia() {
        PrimeiraJanela.setSize(400, 300);
        PrimeiraJanela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        painel.setLayout(new FlowLayout(FlowLayout.CENTER, 30, 20));
        // Ainda implementando.
        painel.add(btnCadPessoa);
        painel.add(btnCadUser);
        PrimeiraJanela.add(painel);
        PrimeiraJanela.setVisible(true);
        btnCadPessoa.addActionListener(this);
        btnCadUser.addActionListener(this);
    }
            

            
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
