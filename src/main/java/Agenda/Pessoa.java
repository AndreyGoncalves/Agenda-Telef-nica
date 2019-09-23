package Agenda;
import java.lang.String;
import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class    Pessoa {
    private String nome;
    private String sobreNome;
    private LocalDate dNasc;
    private Email emails;
    private Telefone telefones;

    public Pessoa(){
        this.nome = "";
        this.sobreNome="";

    }
    public Pessoa(String nome, String sobreNome,String email,String telefone, int anoNas, int mesNas, int diaNas) {
        this.nome = nome;
        this.sobreNome = sobreNome;
        this.setdNasc(anoNas,mesNas,diaNas);
    }

    public boolean addTelefone(String rot, String n) throws ParseException {
        this.telefones.add(rot, n);
        return true;
    }

    public boolean addEmail(String rot, String mail) {
        this.emails.add(rot,mail);
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
    }

    public LocalDate getdNasc() {
        return this.dNasc;
    }

    public String getSobreNome() {
        return this.sobreNome;
    }
    public String getTelefone() {
         return this.telefones.toString();
    }

    public String getNome() {
        return this.nome;
    }
    public String getEmail() {
        return this.emails.toString();
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String toString() {
        System.out.println("Nome:"+ getNome());
        System.out.println("Sobrenome:"+ getSobreNome());
        System.out.println("Data de Nascimento:"+ getdNasc());
        System.out.println("Telefone:"+ getTelefone());
        System.out.println("E-mail:"+ getEmail());
        return null;
    }

    public void setSobreNome(String sobreNome) {
        this.sobreNome = sobreNome;
    }

    public void setTelefone(String rot, String telefone) throws ParseException {
        this.telefones.add(rot,telefone);
    }

    public void setEmail(String rot, String email) {
        this.emails.add(rot,email);
    }

    public void setdNasc(LocalDate dNasc) {
        this.dNasc = dNasc;
    }

}