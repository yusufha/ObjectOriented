package miijavaxiv;

/**
 *
 * @author YusufHA
 */
public class ScopeVariable {
    int z;
    static int y;
    
    public void methodA(int z){
        this.z = 29;
        y = 14;
        methodC(); 
    }
    /**
     * Static method hanya dapat memanggil variable atau method static juga.
     */
    public static void methodC(){
        y = 20;
  //    z = 10; Error: Harus static juga
    }
    
    public static void methodD(){
  //    methodA();  Error: Harus static juga
        methodC();
    }
    
    public void methodB(){
        int z = 20;
        this.z = z;
        methodD();
    }
}
