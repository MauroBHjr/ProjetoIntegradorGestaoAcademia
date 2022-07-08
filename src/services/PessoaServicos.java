/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package services;

import dao.DAOFactory;
import dao.PessoaDAO;
import model.Pessoa;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Mauro B H Jr
 */
public class PessoaServicos {
    
    /*Ao Chamar PessoaServicos.cadPessoaServices usando uma Pessoa p 
    com valores de objeto, eu acesso o controller com o PessoaDAO
    com DAOFactory que vai então armazenar o objeto personDAO
    que será criado nesse método para então o cadastrar com
    o cadastrarPessoa dentro do Controller que é o PessoaDAO
    
    Ou seja, o método que devemos chamar para cadastrar pessoa
    é o PessoaServicos.cadPessoaServices */
    public void cadPessoaServices(Pessoa pVO) throws SQLException{
        PessoaDAO personDAO = DAOFactory.getPessoaDAO();
        personDAO.cadastrarPessoa(pVO); 
    }
    
    
    /*Basicamente, o controller PessoaDAO.listarPessoas é o método que clona
    as pessoas do banco de dados e instancia em um arrayList
    para exibir no java uma representação do que há no banco de dados
    
    então esse método de PessoaServicos.getPessoas serve para criar objeto pessoa
    referente aod pVO das pessoas registradas no Arraylist do PessoaDAO
    */
    public ArrayList<Pessoa> getPessoas() throws SQLException{
        PessoaDAO personDAO = DAOFactory.getPessoaDAO();
        return personDAO.listarPessoas();
    }
    
    
    /* Ao meu ver, esse encapsulamento parece desnecessário...
    Pode ser que não escapsular abra uma margem de acesso ao PessoaDAO
    e isso se torne um problema de segurança se a pessoa for capaz 
    de navegar puxando some o PessoaDAO.mostrarCPFDAO */
    public boolean verCpfBD(String cpfPessoa) throws SQLException{
        PessoaDAO personDAO = DAOFactory.getPessoaDAO();
        return personDAO.mostrarCPFDAO(cpfPessoa);
    }
    
    
    /* Executa o PessoaDAO.getByDocDAO, o que cria um objeto pessoa e instancia
    com os dados da pessoa cadastrada com aquele CPF e retorna esse objeto
    dentro desse método */
    public Pessoa buscarPessoaByCpfBD(String cpfPessoa) throws SQLException{
        PessoaDAO personDAO = DAOFactory.getPessoaDAO();
        return personDAO.getByDocDAO(cpfPessoa);
    }
    
    /* Não sei se é necessário ou se está funcionando, mas já fica a referência.
    Mas o método de NomeByIdDAO ainda não foi criado no PessoaDAO, então
    vamos desconsiderar esse método por enquanto
    */
    /*public String NomeByIdBD(int idPessoa) throws SQLException{
        PessoaDAO pDAO = DAOFactory.getPessoaDAO();
        return pDAO.NomeByIdDAO(idPessoa);
    }*/
    
    /* Ok, agora me deu um nó na cabeça, ao meu ver, estamos criando um objeto
    dentro desse método, clonando a partir dos dados que ele acessa do PessoaDAO
    e ao- ..... ahhhhhhh, entendi.
    o objeto criado (personDAO) não está sendo necessariamente "usado", apenas
    cria um objeto para acessar um de seus dados que será enviado ao executar
    o comando no PessoaDAo, ou seja, o personDAO.método serve apenas para
    indicar que deve chamar o método PessoaDAO.deletarPessoaDAO(número de id
    armazenado pelo objeto personDAO, ou seja, não precisava criar toda uma pessoa
    apenas era ncessário armazenar o número d eid e enviar para o deletarPessoaDAO)n */
    public void deletarPessoaBD(int idPessoa) throws SQLException{
        PessoaDAO personDAO = DAOFactory.getPessoaDAO();
        personDAO.deletarPessoaDAO(idPessoa);
    }
    
    public void atualizarPessoaBD(Pessoa pVO) throws SQLException{
        PessoaDAO personDAO = DAOFactory.getPessoaDAO();
        personDAO.atualizarPessoaDAO(pVO);
    }
    
    
}
