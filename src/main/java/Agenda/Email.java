package Agenda;

import java.util.HashMap;

public class Email {
    private HashMap<String, String> tab_email = new HashMap<>();
    private String email;
    private String tipo;

    public Email(){
        this.email ="";
        this.tipo ="";
    }
    public Email(String tipo, String email){
        this.tipo =tipo;
        this.email =email;
    }
    public boolean add(String type,String e){
        String emailER ="^[\\w-\\+]+(\\.[\\w]+)*@[\\w-]+(\\.[\\w]+)*(\\.[a-z]{2,})$";
        if(e.matches(emailER) == true){
            tab_email.put("",e);
            return true;
        }else return false;
    }

    public boolean remove(String r){
        return true;
    }

    public boolean update(String r, String e){
        tab_email.replace(r,e);
        return true;
    }

    public String getEmail() {
        return email;
    }

    public String getTipo() {
        return tipo;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String toString() {
        return this.tipo + ":" + this.email;
    }

}