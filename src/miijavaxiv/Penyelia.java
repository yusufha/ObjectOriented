package miijavaxiv;

/**
 *
 * @author YusufHA
 */
public class Penyelia extends Karyawan{
    
    /**
     * Constructor
     */
    public Penyelia(){
        System.out.println("Ctor Penyelia");
    }
    
    public Penyelia(String id, String nama, String alamat){
    //    super(id, nama, alamat); 
        System.out.println("Ctor Penyelia");
    }
    
    public int methodC(){
        
        return 0;
    }

    @Override
    public String getAlamat() {
        return "Jakarta Barat"; //To change body of generated methods, choose Tools | Templates.
    }

    @Override // Menimpa method yang dibawahnya.
    public String toString() {
        StringBuilder builder = new StringBuilder(); // Penampung String
        builder.append("Nama : ");
        builder.append(nama);
        builder.append(", Alamat : ");
        builder.append(alamat);
        
        return builder.toString();
       //To change body of generated methods, choose Tools | Templates.
    }
    
    public static void main(String[] args) {
        Penyelia penyelia = new Penyelia();
        penyelia.setAlamat("Bandung");
        
        System.out.println(penyelia.getAlamat());
        
        System.out.println(penyelia.toString());
        
        Penyelia penyelia1 = new Penyelia();
        penyelia1.setAlamat("Jogjakarta");
        penyelia1 = penyelia;
        
        System.out.println(penyelia.hashCode());
        System.out.println(penyelia1.hashCode());
        
        Karyawan k = new Karyawan("101", "Totti", "Bandung");
        //System.out.println(k.);
        
        Penyelia p = new Penyelia("1", "hana", "Jogja");
        
    }
    
    
}
