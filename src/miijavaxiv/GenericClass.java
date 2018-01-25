package miijavaxiv;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author YusufHA
 */
public class GenericClass<T> {
    
    public void add(T t){
        
    }
    
    public static void main(String[] args) {
        
        /**
         * Typing save.
         * Jenis data telah ditentukan.
         */
        GenericClass<String> gc = new GenericClass<>();
        gc.add("test");
        
        GenericClass<Integer> gc1 = new GenericClass<>();
        gc1.add(100);
        
        /**
         * Typing not save.
         * Jenis data belum ditentukan.
         */
        List l = new ArrayList();
        l.add("String");
        l.add(20);
    }
}
