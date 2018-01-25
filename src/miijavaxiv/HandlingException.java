package miijavaxiv;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author YusufHA
 */
public class HandlingException {
    
    static void bacaFile(String namaFile) throws FileNotFoundException, IOException{
        FileReader reader =  new FileReader(namaFile); //Instantiate
            int i;
            while( (i = reader.read()) > 0){
                System.out.println((char)i);
            }
    }
    
    public static void main(String[] args) {
        
        try {
            int c = -1;
            assert c > 0;
            if(c == 0)
                    throw new CustomException("c tidak boleh sama dengan 0");
            int y = 10 / c;
            
            bacaFile(args[0]);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
            //Logger.getLogger(HandlingException.class.getName()).log(Level.SEVERE, null, ex);
        } catch (CustomException ex) {
            System.out.println(ex.getMessage());
            //Logger.getLogger(HandlingException.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Error er){
            System.out.println(er.getMessage());
        }
    } 
    
}
