/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import conexao.Conexao;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import model.Pessoa;

/**
 *
 * @author Mauro BH Jr
 */
public class PessoaDAO {
    
    public void cadastrarPessoa(Pessoa pVO) throws SQLException{
        //Buscar conexão do Banco de Dados
        Connection con = Conexao.getConexao();
        /*cria espaço de trabalho sql 
        (área no Java onde vamos executar os scripts SQL)*/
        Statement stat = con.createStatement();
        
        try {
            String sql;
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
            stat.execute(sql);
        } catch (SQLException e) {
            throw new SQLException("Erro ao inserir pessoa. \n"
            + e.getMessage());
        } finally {
            con.close();
            stat.close();
        }
    }
}
