package Agenda;
import java.lang.String;
import java.time.LocalDate;

public class Pessoa {
    private String nome;
    private String sobreNome;
    //private int totalElementos; ou na agenda
    public String telefone;
    public String email;
    private LocalDate dNasc;
    private Pessoa[] pessoas;

    public Pessoa(String nome, String sobreNome,String email,String telefone, String dNasc) {
        this.nome = nome;
        this.sobreNome = sobreNome;
        this.email = email;
        this.telefone = telefone;
        this.setdNasc();
    }

    public boolean addTelefone(String n) {
        this.telefone = n;
        return true;
    }

    public boolean addEmail(String mail) {
        this.email = mail;
        return true;
    }

    public boolean updateTelefone(String r, String n, int pindex) {
        return true;
    }

    public boolean updateEmail(String r, String n, int pindex) {
        return true;
    }

    public boolean removeTelefone(String r, int pindex) {
        return true;
    }

    public boolean removeEmail(String r, int pindex) {
        return true;
    }

    public String toString() {
        return "";
    }

    public void setdNasc(){
        /*String[] d = dNasc.split("/");
        this.dNasc = LocalDate.of(Integer.parseInt(d[0]),Integer.parseInt(d[1]),Integer.parseInt(d[2]));*/
    }

    public LocalDate getdNasc() {
        return dNasc;
    }
}