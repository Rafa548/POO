package Treino20202021;

import java.util.HashSet;
import java.util.Set;

public class PasseioBicicleta extends Atividade{
    private String[] s_list;
    private Set<String> locals = new HashSet<String>();

    public PasseioBicicleta(int id, String name, String[] s_list) {
        super(id, name);
        this.s_list = s_list;
    }

    public PasseioBicicleta(int id, String name) {
        super(id, name);
    }
    
    public void addLocal(String local){
        locals.add(local);
    }

    @Override
    public Set<String> locais(){
        if (s_list != null){
            for (String s : s_list){
                locals.add(s);

            }
            return locals;
        }
        return locals;
    }

}
