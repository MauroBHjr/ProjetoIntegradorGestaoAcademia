/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import conexao.Conexao;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import model.Pessoa;

/**
 *
 * @author Mauro BH Jr
 */
public class PessoaDAO {

    /*
    Coisas que precisam ser feitas ainda:
    -------------------- Model ------------------------
    ---- Converter variável birthday para datetime
    ---- Criar classe de Usuários usando polimorfismo com pessoa
    ------------------ Controller ---------------------
    ---- Cálculo de idade por datetime e birthday
    ------------------- J Frames ----------------------
    ---- nos paineis ainda é necessário tratamento de erro
    ---- formatar alguns campos como o de data, telefone e documentos
    ---- tooltips com instruções
    ---- Fazer texto clicável para o recuperar senha
     */
    public void cadastrarPessoa(Pessoa pVO) throws SQLException {
        //Buscar conexão do Banco de Dados
        Connection con = Conexao.getConexao();
        /*cria espaço de trabalho sql 
        (área no Java onde vamos executar os scripts SQL)*/
        Statement stat = con.createStatement();

        try {
            /*
                Pelo o que entendi:
                Salvamos os dados como uma string, não importando realmente o
            tipo de dado que era antes, pois no banco de dados ele irá receber
            a string e então fragmentá-la na ordem que os dados estão organizados
            dentro do banco de dados. Portanto, é importante organizar de acordo
            com a ordem que o Banco de dados disponibiliza esses dados.
            
                Sendo assim, possivelmente será necessária uma refatoração 
            na ordem que os dados estão dispostos.
            
            Por hora, vou adotar O seguinte padrão para a ordem das minhas variáveis
            
            int idPessoa
            String nomePessoa
            String rgPessoa
            String cpfPessoa
            String estadoPessoa
            String enderecoPessoa
            String enderecoPessoaComplemento
            String telefonePessoa01
            String telefonePessoa02
            String emailAdressPessoa01
            String emailAdressPessoa02
            int birthdayPessoa
            int idade
            boolean sexoPessoa
             */
            String sql; //A string que deve ser criada para enviar para o DB.
            sql = "insert into pessoa values "
                    + "(null, '" //null porque deve ser o id
                    + pVO.getNomePessoa() + "', '"
                    + pVO.getRgPessoa() + "', '"
                    + pVO.getCpfPessoa() + "', '"
                    + pVO.getEstadoPessoa() + "', '"
                    + pVO.getEnderecoPessoa() + "', '"
                    + pVO.getEnderecoPessoaComplemento() + "', '"
                    + pVO.getTelefonePessoa01() + "', '"
                    + pVO.getTelefonePessoa02() + "', '"
                    + pVO.getEmailAdressPessoa01() + "', '"
                    + pVO.getEmailAdressPessoa02() + "', "
                    //inserir cálculo de idade
                    + pVO.getIdade() + ", "
                    + pVO.isSexoPessoa() + ");";
            //O que exatamente faz o execute sql eu não sei, mas presumo ser
            //o envio dessa tring para o banco
            stat.execute(sql);
        } catch (SQLException e) {
            throw new SQLException("Erro ao adicionar pessoa. \n"
                    + e.getMessage());
        } finally {
            //Importante encerrar conexão
            con.close();
            stat.close();
        }
    }

    public ArrayList<Pessoa> listarPessoas() throws SQLException {
        //Buscar conexão do Banco de Dados
        Connection con = Conexao.getConexao();
        /*cria espaço de trabalho sql 
            (área no Java onde vamos executar os scripts SQL)*/
        Statement stat = con.createStatement();

        try {
            String sql;
            /*Novamente, criação de uma string que será enviada para a DB
                que enviará um comando para selecionar*/
            sql = "select * from pessoa";
            /*Não entendi tão bem o ResultSet, mas aparentemente trata-se de
                Placeholder para fazer testes até que acondição seja estabelecida
                talvez seja apena suma padronização de um laço de repetição para
                comparação de igualdades até que condição seja atingida ou falhe*/
            ResultSet rs = stat.executeQuery(sql);
            ArrayList<Pessoa> pessoas = new ArrayList<>();
            /* Então aqui entramos no laço de repetição.
                De início, criamos uma pessoa
                A princípio, o que deu a entender enquanto eu analiso esse código
                é de que cria-se a pessoa NO JAVA, copiando ela do banco de dados
                onde essa pessoa seria uma pessoa temporária criada em memória
                apenas para nossa exibição
             */

 /*
                int idPessoa
                String nomePessoa
                String rgPessoa
                String cpfPessoa
                String estadoPessoa
                String enderecoPessoa
                String enderecoPessoaComplemento
                String telefonePessoa01
                String telefonePessoa02
                String emailAdressPessoa01
                String emailAdressPessoa02
                int birthdayPessoa
                int idade
                boolean sexoPessoa
             */
            while (rs.next()) {
                Pessoa p = new Pessoa();
                //lado do java |x| lado do banco
                p.setIdPessoa(rs.getInt("idPessoa"));
                p.setNomePessoa(rs.getString("nomePessoa"));
                p.setRgPessoa(rs.getString("rgPessoa"));
                p.setCpfPessoa(rs.getString("cpfPessoa"));
                p.setEstadoPessoa(rs.getString("estadoPessoa"));
                p.setEnderecoPessoa(rs.getString("enderecoPessoa"));
                p.setEnderecoPessoaComplemento(rs.getString("enderecoPessoaComplemento"));
                p.setTelefonePessoa01(rs.getString("telefonePessoa01"));
                p.setTelefonePessoa02(rs.getString("telefonePessoa02"));
                p.setEmailAdressPessoa01(rs.getString("emailAdressPessoa01"));
                p.setEmailAdressPessoa02(rs.getString("emailAdressPessoa02"));
                p.setBirthdayPessoa(rs.getInt("birthdayPessoa"));
                p.setIdade(rs.getInt("idade"));
                p.setSexoPessoa(rs.getBoolean("sexoPessoa"));
                /* vvvv popula arraylist e armazena os dados do banco de dados
                    para que possamos trabalhar com eles dentro do java*/
                pessoas.add(p);
            }
            return pessoas;

        } catch (SQLException e) {
            throw new SQLException("Erro ao buscar pessoas.\n"
                    + e.getMessage());
        } finally {
            con.close();
            stat.close();
        }
    }

    public boolean mostrarCPFDAO(String cpfPessoa) throws SQLException {
        //Buscar conexão do Banco de Dados
        Connection con = Conexao.getConexao();
        /*cria espaço de trabalho sql 
            (área no Java onde vamos executar os scripts SQL)*/
        Statement stat = con.createStatement();

        boolean encontrarCPF = false;

        try {
            String sql;
            sql = "select cpfPessoa from pessoa where cpfPessoa = " + cpfPessoa;
            ResultSet rs = stat.executeQuery(sql);
            while (rs.next()) {
                encontrarCPF = rs.wasNull();
            }
        } catch (SQLException e) {
            throw new SQLException("CPF não registrado. \n"
                    + e.getMessage());
        } finally {
            con.close();
            stat.close();
        }
        return encontrarCPF;
    }

    public Pessoa getByDocDAO(String cpfPessoa) throws SQLException {
        //Buscar conexão do Banco de Dados
        Connection con = Conexao.getConexao();
        /*cria espaço de trabalho sql 
            (área no Java onde vamos executar os scripts SQL)*/
        Statement stat = con.createStatement();

        Pessoa p = new Pessoa();

        try {
            String sql;
            sql = "select * from pessoa where cpfPessoa = " + cpfPessoa;
            ResultSet rs = stat.executeQuery(sql);
            while (rs.next()) {
                //lado do java |x| lado do banco
                p.setIdPessoa(rs.getInt("idPessoa"));
                p.setNomePessoa(rs.getString("nomePessoa"));
                p.setRgPessoa(rs.getString("rgPessoa"));
                p.setCpfPessoa(rs.getString("cpfPessoa"));
                p.setEstadoPessoa(rs.getString("estadoPessoa"));
                p.setEnderecoPessoa(rs.getString("enderecoPessoa"));
                p.setEnderecoPessoaComplemento(rs.getString("enderecoPessoaComplemento"));
                p.setTelefonePessoa01(rs.getString("telefonePessoa01"));
                p.setTelefonePessoa02(rs.getString("telefonePessoa02"));
                p.setEmailAdressPessoa01(rs.getString("emailAdressPessoa01"));
                p.setEmailAdressPessoa02(rs.getString("emailAdressPessoa02"));
                p.setBirthdayPessoa(rs.getInt("birthdayPessoa"));
                p.setIdade(rs.getInt("idade"));
                p.setSexoPessoa(rs.getBoolean("sexoPessoa"));
            }
        } catch (SQLException e) {
            throw new SQLException("Pessoa com este CPF não está cadastrada.\n"
                    + e.getMessage());
        } finally {
            con.close();
            stat.close();
        }
        return p; //retorna o objeto pessoa criado para exibir no java
    }

    public void deletarPessoaDAO(int id) throws SQLException {
        //Buscar conexão do Banco de Dados
        Connection con = Conexao.getConexao();
        /*cria espaço de trabalho sql 
            (área no Java onde vamos executar os scripts SQL)*/
        Statement stat = con.createStatement();

        try {
            String sql;
            sql = "Delete from pessoa where idPessoa = "
                    + id;
            stat.execute(sql);
        } catch (SQLException e) {
            throw new SQLException("Erro ao deletar Pessoa. \n"
                    + e.getMessage());
        } finally {
            con.close();
            stat.close();
        }
    }

    public void atualizarPessoaDAO(Pessoa pVO) throws SQLException {
        //Buscar conexão do Banco de Dados
        Connection con = Conexao.getConexao();
        /*cria espaço de trabalho sql 
                (área no Java onde vamos executar os scripts SQL)*/
        Statement stat = con.createStatement();

        try {
            String sql;
            sql = "update pessoa set "
                    + "nomePessoa = '" + pVO.getNomePessoa() + "', "
                    + "rgPessoa = '" + pVO.getRgPessoa() + "', "
                    + "cpfPessoa = '" + pVO.getCpfPessoa() + "', "
                    + "estadoPessoa = '" + pVO.getEnderecoPessoa() + "', "
                    + "estadoPessoaComplemento = '" + pVO.getEnderecoPessoaComplemento() + "', "
                    + "telefonePessoa01 = '" + pVO.getTelefonePessoa01() + "', "
                    + "telefonePessoa02 = '" + pVO.getTelefonePessoa02() + "', "
                    + "emailAdressPessoa01 = '" + pVO.getEmailAdressPessoa01() + "', "
                    + "emailAdressPessoa02 = '" + pVO.getEmailAdressPessoa02() + "', "
                    /*
                            ==========================================================================================================
                            ================ Lembrar do datetime para refatorar depois ===============================================
                            ==========================================================================================================
                            also... Possivelmente terei erros d esintaxe referente a tipagem de dados com as vísculas e aspas
                           
                     */
                    + "birthdayPessoa = " + pVO.getBirthdayPessoa() + ", "
                    + "idade = " + pVO.getIdade() + ", "
                    + "sexoPessoa " + pVO.isSexoPessoa() + " "
                    + "where idPessoa = " + pVO.getIdPessoa();
            stat.executeUpdate(sql);
        } catch (SQLException e) {
            throw new SQLException("Erro ao atualizar pessoa. \n"
                    + e.getMessage());
        } finally {
            con.close();
            stat.close();
        }
    }
    
    

}
