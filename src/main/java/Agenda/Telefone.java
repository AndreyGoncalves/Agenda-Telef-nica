package Agenda;

import javax.swing.text.MaskFormatter;
import java.text.ParseException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Telefone {
    private String tipo;
    private String numero;
    private HashMap<String, String> dados_telefones = new HashMap<String, String>();
    int i=0;

    public Telefone(String rotulo, String phone){
        this.tipo = rotulo;
        this.numero = phone;
    }
    public Telefone(){
        this.tipo = "";
        this.numero = "";
    }
    //Colocar um laço caso não esteja no formato do telefone, para digitar novamente o telefone ou um erro
    public boolean add(int rotulo,String telefone) throws ParseException {
        MaskFormatter mask = new MaskFormatter("(##) #####-####");
        mask.setValueContainsLiteralCharacters(false);
        mask.setPlaceholderCharacter('_');
        String teste= mask.valueToString(telefone);

        return true;
    }

    public boolean remove(String telefo){

        return true;
    }

    public boolean update(String rot, String number){
      //  dados.replace(rot,number);
        return true;
    }

    public String getTipo() {
        return tipo;
    }

    public String getNumero() {
        return numero;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }
    public String toString(){
        return this.tipo + ":" + this.numero;
    }

}

