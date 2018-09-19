package Agenda;

import javax.swing.text.MaskFormatter;
import java.text.ParseException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Telefone {
    private HashMap<String,String> dados = new HashMap<>();
   // private HashMap<String,String>dados[] = new HashMap<>();
    int i=0;

    //Colocar um laço caso não esteja no formato do telefone, para digitar novamente o telefone ou um erro
    public boolean add(String rotulo,String telefone) throws ParseException {
        MaskFormatter mask = new MaskFormatter("(##) #####-####");
        mask.setValueContainsLiteralCharacters(false);
        mask.setPlaceholderCharacter('_');
        String teste= mask.valueToString(telefone);
        i++;
        dados.put(rotulo,teste);

        return true;
    }

    public boolean remove(String telefo){

        return true;
    }

    public boolean update(String rot, String number){
        dados.replace(rot,number);
        return true;
    }

    public void imprime_telefone(){
        dados.entrySet().forEach(item -> {
            System.out.println("Número: "+item.toString());
        });

    }
}

