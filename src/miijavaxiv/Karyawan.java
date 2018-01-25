package miijavaxiv;

/**
 *
 * @author YusufHA
 */
public class Karyawan {
    private String id;
    protected String nama;
    public String alamat;
    static int jumlah;
    
    protected Karyawan(){
        System.out.println("Ctor Karyawan");
    }
    
    public Karyawan(String id, String nama, String alamat){
        this.id = id;
        this.nama = nama;
        this.alamat = alamat;
    }
    
    /**
     * Method ini untuk mengajukan cuti
     */
    int mengajukanCuti(){
        int hari; //jumlah hari
        hari = 18;
        return hari;
    }
    
    /**
     * Mengajukan cuti overloading (nama sama tapi parameter beda)
     * @param k 
     */
    void mengajukanCuti(Karyawan k){
        k.setId("22");
    }

    /**
     * Method ini untuk mengajukan kerja
     */
    static void mengajukanKerja(){
        
    }

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return the nama
     */
    public String getNama() {
        return nama;
    }

    /**
     * @param nama the nama to set
     */
    public void setNama(String nama) {
        this.nama = nama;
    }

    /**
     * @return the alamat
     */
    public String getAlamat() {
        return alamat;
    }

    /**
     * @param alamat the alamat to set
     */
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
    
}
