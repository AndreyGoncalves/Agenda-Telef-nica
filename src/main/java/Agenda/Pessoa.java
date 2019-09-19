package Agenda;
import java.lang.String;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Pessoa {
    private String nome;
    private String sobreNome;
    //private int totalElementos; ou na agenda
    public String telefone;
    public String email;
    private LocalDate dNasc;
    private Email emails;
    private Telefone telefones;

    public Pessoa(){
        this.nome = "";
        this.sobreNome="";
        this.telefone="";
        this.email="";
    }
    public Pessoa(String nome, String sobreNome,String email,String telefone, int anoNas, int mesNas, int diaNas) {
        this.nome = nome;
        this.sobreNome = sobreNome;
        this.telefone = telefone;
        this.email = email;
        this.setdNasc(anoNas,mesNas,diaNas);
    }

    public boolean addTelefone(String n) {
        this.telefone = n;
        return true;
    }

    public boolean addEmail(String mail) {
        this.email = mail;
        return true;
    }

    public boolean updateTelefone(String r, String n) {
        return this.telefones.update(r,n);
    }

    public boolean updateEmail(String r, String n) {
        return this.emails.update(r,n);
    }

    public boolean removeTelefone(String r) {
        return this.telefones.remove(r);
    }

    public boolean removeEmail(String r) {
        return this.emails.remove(r);
    }

    public void setdNasc(int ano,int mes, int dia){

        LocalDate hoje = LocalDate.of(ano, mes, dia);
        DateTimeFormatter formatadorBarra = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Data de Nascimento: " + hoje.format(formatadorBarra));
    }

    public LocalDate getdNasc() {
        return dNasc;
    }

    public String getNome() {
        return nome;
    }

    public String getSobreNome() {
        return sobreNome;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", sobreNome='" + sobreNome + '\'' +
                ", telefone='" + telefone + '\'' +
                ", email='" + email + '\'' +
                ", dNasc=" + dNasc +
                ", emails=" + emails +
                ", telefones=" + telefones +
                '}';
    }

    public void setSobreNome(String sobreNome) {
        this.sobreNome = sobreNome;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setdNasc(LocalDate dNasc) {
        this.dNasc = dNasc;
    }
}