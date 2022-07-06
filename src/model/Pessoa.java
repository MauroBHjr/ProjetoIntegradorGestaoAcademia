/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Mauro B H Jr
 */
public class Pessoa {
    private int idPessoa;//PK
    private String nomePessoa; //Usado para armazenar nome completo
    private String rgPessoa; //Usado para armazenar documento de registro Geral Brasileiro
    private String cpfPessoa; //Usado para armazenar documento de CPF
    private String estadoPessoa; //Usado para armazenar a sigla do estado onde habita essa pessoa
    private String enderecoPessoa; //Usado para armazenar a Rua, Bairo e número onde essa pessoa reside.
    private String enderecoPessoaComplemento; //Usado como complemento para endereço
    private String telefonePessoa01; // Usado para o telefone de contato primário com o indivíduo
    private String telefonePessoa02; //Usado para um número de contato alternativo, Whatsapp ou outro meio que a empresa decidir implementar
    private String emailAdressPessoa01; //Usado para e-mail principal, onde o usuário poderá receber notificações improtantes como pagamentos e editar dados cadastrais
    private String emailAdressPessoa02; //e-mail secundário para enviar promoções e recuperação de senha
    private int birthdayPessoa; //usado para data de Nascimento, ainda tenho dúvidas sobre qual tipo de variável implementar, visto que dateTime ficaria mais adequado
    private int idade; //Recebe um cálculo de birthdatePessoa subtraindo o datetime atual, não lembro como faz.
    private boolean sexoPessoa; //identifica o sexo biológico do indivíduo. Relevancia médica.
    
    public Pessoa(){
        //Construtor vazio para usar os métodos acessores geters and seters
    }

    /**
     * Conntrutor com todos os atributos como parâmetro.
     * @param idPessoa
     * @param nomePessoa
     * @param rgPessoa
     * @param cpfPessoa
     * @param estadoPessoa
     * @param enderecoPessoa
     * @param enderecoPessoaComplemento
     * @param telefonePessoa01
     * @param telefonePessoa02
     * @param emailAdressPessoa01
     * @param emailAdressPessoa02
     * @param birthdayPessoa
     * @param idade
     * @param sexoPessoa
     */
    public Pessoa(int idPessoa, String nomePessoa, String rgPessoa, String cpfPessoa, String estadoPessoa, String enderecoPessoa, String enderecoPessoaComplemento, String telefonePessoa01, String telefonePessoa02, String emailAdressPessoa01, String emailAdressPessoa02, int birthdayPessoa, int idade, boolean sexoPessoa) {
        this.idPessoa = idPessoa;
        this.nomePessoa = nomePessoa;
        this.rgPessoa = rgPessoa;
        this.cpfPessoa = cpfPessoa;
        this.estadoPessoa = estadoPessoa;
        this.enderecoPessoa = enderecoPessoa;
        this.enderecoPessoaComplemento = enderecoPessoaComplemento;
        this.telefonePessoa01 = telefonePessoa01;
        this.telefonePessoa02 = telefonePessoa02;
        this.emailAdressPessoa01 = emailAdressPessoa01;
        this.emailAdressPessoa02 = emailAdressPessoa02;
        this.birthdayPessoa = birthdayPessoa;
        this.idade = idade;
        this.sexoPessoa = sexoPessoa;
    }

    public int getIdPessoa() {
        return idPessoa;
    }
    public void setIdPessoa(int idPessoa) {
        this.idPessoa = idPessoa;
    }
    public String getNomePessoa() {
        return nomePessoa;
    }
    public void setNomePessoa(String nomePessoa) {
        this.nomePessoa = nomePessoa;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public String getRgPessoa() {
        return rgPessoa;
    }
    public void setRgPessoa(String rgPessoa) {
        this.rgPessoa = rgPessoa;
    }
    public String getCpfPessoa() {
        return cpfPessoa;
    }
    public void setCpfPessoa(String cpfPessoa) {
        this.cpfPessoa = cpfPessoa;
    }
    public String getEstadoPessoa() {
        return estadoPessoa;
    }
    public void setEstadoPessoa(String estadoPessoa) {
        this.estadoPessoa = estadoPessoa;
    }
    public String getEnderecoPessoa() {
        return enderecoPessoa;
    }
    public void setEnderecoPessoa(String enderecoPessoa) {
        this.enderecoPessoa = enderecoPessoa;
    }
    public String getEnderecoPessoaComplemento() {
        return enderecoPessoaComplemento;
    }
    public void setEnderecoPessoaComplemento(String enderecoPessoaComplemento) {
        this.enderecoPessoaComplemento = enderecoPessoaComplemento;
    }
    public String getTelefonePessoa01() {
        return telefonePessoa01;
    }
    public void setTelefonePessoa01(String telefonePessoa01) {
        this.telefonePessoa01 = telefonePessoa01;
    }
    public String getTelefonePessoa02() {
        return telefonePessoa02;
    }
    public void setTelefonePessoa02(String telefonePessoa02) {
        this.telefonePessoa02 = telefonePessoa02;
    }
    public String getEmailAdressPessoa01() {
        return emailAdressPessoa01;
    }
    public void setEmailAdressPessoa01(String emailAdressPessoa01) {
        this.emailAdressPessoa01 = emailAdressPessoa01;
    }
    public String getEmailAdressPessoa02() {
        return emailAdressPessoa02;
    }
    public void setEmailAdressPessoa02(String emailAdressPessoa02) {
        this.emailAdressPessoa02 = emailAdressPessoa02;
    }
    public int getBirthdayPessoa() {
        return birthdayPessoa;
    }
    public void setBirthdayPessoa(int birthdayPessoa) {
        this.birthdayPessoa = birthdayPessoa;
    }
    public boolean isSexoPessoa() {
        return sexoPessoa;
    }
    public void setSexoPessoa(boolean sexoPessoa) {
        this.sexoPessoa = sexoPessoa;
    }

    @Override
    public String toString() {
        return "Pessoa{" + "idPessoa=" + idPessoa + ", nomePessoa=" + nomePessoa + ", rgPessoa=" + rgPessoa + ", cpfPessoa=" + cpfPessoa + ", estadoPessoa=" + estadoPessoa + ", enderecoPessoa=" + enderecoPessoa + ", enderecoPessoaComplemento=" + enderecoPessoaComplemento + ", telefonePessoa01=" + telefonePessoa01 + ", telefonePessoa02=" + telefonePessoa02 + ", emailAdressPessoa01=" + emailAdressPessoa01 + ", emailAdressPessoa02=" + emailAdressPessoa02 + ", birthdayPessoa=" + birthdayPessoa + ", idade=" + idade + ", sexoPessoa=" + sexoPessoa + '}';
    }

}