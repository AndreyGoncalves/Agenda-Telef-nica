package Agenda;

import javax.swing.text.MaskFormatter;
import java.text.ParseException;
import java.util.*;

public class Telefone {
    private String tipo;
    private String numero;
    private HashMap<String, String> dados_telefones = new HashMap<String, String>();
    int i = 0;

    public Telefone(String rotulo, String phone) {
        this.tipo = rotulo;
        this.numero = phone;
    }

    public Telefone() {
        this.tipo = "";
        this.numero = "";
    }

    public void add(String rotulo, String telefone) throws ParseException {
        try {
            if (telefone.length() == 11) {
                MaskFormatter mask = new MaskFormatter("(##) #####-####");
                mask.setValueContainsLiteralCharacters(false);
                mask.setPlaceholderCharacter('_');
                String teste = mask.valueToString(telefone);
                if (!this.dados_telefones.containsKey(rotulo)) {
                    this.dados_telefones.put(rotulo, teste);
                }
            }
        } catch (ParseException e) {
            e.printStackTrace();
        }

    }

    public boolean remove(String rot){

        return this.dados_telefones.remove(rot,this.dados_telefones.get(rot));

    }

    public boolean update(String rot, String newNumber){
        this.dados_telefones.replace(rot,newNumber);
        return true;
    }
    public String toString() {
        for(Map.Entry<String,String> elemento: dados_telefones.entrySet()){
                System.out.println(elemento.getKey() + ":" + elemento.getValue());
            }
        return null;
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


}

