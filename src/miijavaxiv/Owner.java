package miijavaxiv;

/**
 *
 * @author YusufHA
 */
public class Owner extends Penyelia{
    
    public Owner(){
        System.out.println("Ctor Owner.");
    }
    
    public Owner(String id, String nama, String alamat){
        
    }
    
    public static void main(String[] args) {
        Owner o = new Owner();
        
        Owner o1 = new Owner("2", "Jaja", "Medan");
    }
            
}
