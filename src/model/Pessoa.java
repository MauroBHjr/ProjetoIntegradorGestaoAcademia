/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.time.LocalDate;

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
    private LocalDate birthdayPessoa; //usado para data de Nascimento, ainda tenho dúvidas sobre qual tipo de variável implementar, visto que dateTime ficaria mais adequado
    private short idade; //Recebe um cálculo de birthdatePessoa subtraindo o datetime atual, não lembro como faz.
    private String sexoPessoa; //identifica o sexo biológico do indivíduo. Relevancia médica.
    private boolean notificaEmail; //recebe notificações relevantes ao termos de serviço e cobrança por e-mail
    private boolean notificaPromo; //recebe promoções, planos e etc por e-mail
    
    public Pessoa(){
        //Construtor vazio para usar os métodos acessores geters and seters
    }

    public Pessoa(int idPessoa, String nomePessoa, String rgPessoa, String cpfPessoa, String estadoPessoa, String enderecoPessoa, String enderecoPessoaComplemento, String telefonePessoa01, String telefonePessoa02, String emailAdressPessoa01, String emailAdressPessoa02, LocalDate birthdayPessoa, short idade, String sexoPessoa, boolean notificaEmai, boolean notificaPromo) {
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
        this.notificaEmail = notificaEmai;
        this.notificaPromo = notificaPromo;
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

    public LocalDate getBirthdayPessoa() {
        return birthdayPessoa;
    }

    public void setBirthdayPessoa(LocalDate birthdayPessoa) {
        this.birthdayPessoa = birthdayPessoa;
    }

    public short getIdade() {
        return idade;
    }

    public void setIdade(short idade) {
        this.idade = idade;
    }

    public String getSexoPessoa() {
        return sexoPessoa;
    }

    public void setSexoPessoa(String sexoPessoa) {
        this.sexoPessoa = sexoPessoa;
    }

    public boolean isNotificaEmail() {
        return notificaEmail;
    }

    public void setNotificaEmail(boolean notificaEmai) {
        this.notificaEmail = notificaEmail;
    }

    public boolean isNotificaPromo() {
        return notificaPromo;
    }

    public void setNotificaPromo(boolean notificaPromo) {
        this.notificaPromo = notificaPromo;
    }

    @Override
    public String toString() {
        return "Pessoa{" + "idPessoa=" + idPessoa + ", nomePessoa=" + nomePessoa + ", rgPessoa=" + rgPessoa + ", cpfPessoa=" + cpfPessoa + ", estadoPessoa=" + estadoPessoa + ", enderecoPessoa=" + enderecoPessoa + ", enderecoPessoaComplemento=" + enderecoPessoaComplemento + ", telefonePessoa01=" + telefonePessoa01 + ", telefonePessoa02=" + telefonePessoa02 + ", emailAdressPessoa01=" + emailAdressPessoa01 + ", emailAdressPessoa02=" + emailAdressPessoa02 + ", birthdayPessoa=" + birthdayPessoa + ", idade=" + idade + ", sexoPessoa=" + sexoPessoa + ", notificaEmail=" + notificaEmail + ", notificaPromo=" + notificaPromo + '}';
    }
}