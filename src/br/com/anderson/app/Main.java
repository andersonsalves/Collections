package br.com.anderson.app;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author Anderson Silva
 */
public class Main {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {

        Aluno a1 = new Aluno("João");
        Aluno a2 = new Aluno("Maria");
        Aluno a3 = new Aluno("José");
        Aluno a4 = new Aluno("Pedro");

        List<Aluno> list = new ArrayList<>();
        list.add(a1);  list.add(a2); list.add(a3); list.add(a4); 
        
        imprimir(list, "ArrayList");
        
        Map<Integer, Aluno> map = new HashMap<>();
        map.put(1, a1);  map.put(2, a2);   map.put(3, a3);   map.put(4, a4); 
        
        imprimir(map, "MapHashMap");
        
        Set<Aluno> st = new HashSet<>();
        st.add(a1);  st.add(a2);  st.add(a3);  st.add(a4);  st.add(a1);  st.add(a3);  st.add(a4);
        
        imprimir(st, "SetHashSet");        
    }
    
    /**
     * 
     */
    private static void imprimir(Object o, String tipo) {
        
        if(tipo.equals("ArrayList")) {
            
            System.out.println("Imprimindo - " + tipo + "\n");
            
            for(Aluno a : (List<Aluno>)o) {
                
                System.out.println(a.getNome());  
            }
            
            System.out.println("---------------------------- ");
        }
        
        if(tipo.equals("MapHashMap")) {
            
            System.out.println("Imprimindo - " + tipo + "\n");
            
            for(Aluno a :((HashMap<String, Aluno>)o).values()) {
                
                System.out.println(a.getNome());  
            }
            
            System.out.println("---------------------------- ");
        }
        
        if(tipo.equals("SetHashSet")) {
            
            System.out.println("Imprimindo - " + tipo + "\n");
            
            for(Aluno a : (HashSet<Aluno>)o) {
                
                System.out.println(a.getNome());  
            }
            
            System.out.println("---------------------------- ");
        }      
    }
}
