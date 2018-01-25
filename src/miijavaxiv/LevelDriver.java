package miijavaxiv;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.AbstractMap;
import java.util.AbstractQueue;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Dictionary;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.function.Consumer;
import static javafx.scene.input.KeyCode.K;
import static javafx.scene.input.KeyCode.V;
import javax.script.Bindings;

/**
 *
 * @author YusufHA
 */

public class LevelDriver {
    
    static void methodZ(int y, Level1 l){
        
    }
    
    static void methodZ(InterfaceX x){
        
    }
    
    public static void main(String[] args) {
        methodZ(new Level3());
        
        Level1 level11 = new Level3();
        level11.method1(0);
        
        System.out.println(level11.getClass());
        System.out.println(level11 instanceof Level1);
        System.out.println(level11 instanceof Level2);
        System.out.println(level11 instanceof Level3);
        
        Dictionary dict = new Hashtable();
        dict.put("tes", "Dictionary");
        System.out.println(dict.size());
        //dictSystem.out.println(k+" -> "v);
        
        InterfaceX ix = new Level3();
        
        List<Integer> x = new ArrayList();
        x.add(100);
        System.out.println(x.size());
        
        Map<String, Integer> m = new TreeMap();
        
        m.put("Jakarta", 021);
        
        Map<String, String> map = new HashMap();
        map.put("London", "Inggris");
        map.put("Roma", "Italia");
        map.put("Paris", "Perancis");
        
        map.forEach((k, v) -> System.out.println(k + " ==> " + v));
        
        List<Boolean> list = new ArrayList();
        list.add(true);
        list.add(10>8);
        list.forEach(y -> System.out.println(y));
        
        /**
         * Anonim Class
         * Menambahkan method yang dirujuk pada class
         */
        list.forEach(new Consumer() {
            @Override
            public void accept(Object t) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });
    }
}
