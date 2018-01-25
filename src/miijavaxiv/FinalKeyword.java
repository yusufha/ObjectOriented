package miijavaxiv;

/**
 *
 * @author YusufHA
 */
public class FinalKeyword {
    final int x; //Variabel final hanya dapat diisi sekali di contructor atau pada deklarasi;
    
    public FinalKeyword(){
        x = 12;
    }
    
    public FinalKeyword(int x){
        this.x = x;
    }
    
    final void methodFinal(){
        
    }
    
}
