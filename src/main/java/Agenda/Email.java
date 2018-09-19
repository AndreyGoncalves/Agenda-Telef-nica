package Agenda;

import java.util.HashMap;

public class Email {
    private HashMap<String, String> tab_email = new HashMap<>();
    int i=0;
    public boolean add(String e){
        String emailER ="^[\\w-\\+]+(\\.[\\w]+)*@[\\w-]+(\\.[\\w]+)*(\\.[a-z]{2,})$";
        if(e.matches(emailER) == true){
            tab_email.put("",e);
            i++;
            return true;
        }else return false;
    }

    public boolean remove(String r){
        return true;
    }

    public boolean update(String r, String e,String novo){
        tab_email.replace(r,e,novo);
        return true;
    }

    public void imprime_email(){
        tab_email.entrySet().forEach(item -> {
            System.out.println("E-mail: "+item.toString());
        });
    }

}