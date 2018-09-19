package Agenda;

import java.util.ArrayList;

public class Agenda {
    private ArrayList<Pessoa> lista = new ArrayList<Pessoa>();

    public Agenda(){
        return;
    }
    public boolean addPessoa(Pessoa p){
        //leitura do nome sobrenome e data de nascimento;
        // Pessoa p = new Pessoa(nome...........);
        //this.pessoas[totalElementos] = p
        //Pessoa p = new Pessoa(nome,sobreNome);
        //totalElementos ++


        if (!lista.add(p)){
                return false;
            }
            return true;
    }

    public boolean removePessoa(String name, String lastname){
        return true;
    }

    public boolean addTelefone(String r, String n, int pindex){
        return true;
    }

    public boolean addEmail(String r, String n, int pindex){
        return true;
    }

    public boolean updateTelefone(String r, String n, int pindex){
        return true;
    }

    public boolean updateEmail(String r, String n, int pindex){
        return true;
    }

    public boolean removeTelefone(String r, int pindex){
        return true;
    }

    public boolean removeEmail(String r, int pindex){
        return true;
    }

    public String toString(){
        return "";
    }
}