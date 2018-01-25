package miijavaxiv;

/**
 *
 * @author YusufHA
 */
public class Driver {
    public static void main(String[] args) {
        Karyawan karyawan = new Karyawan();
        karyawan.setId("Y25");
        karyawan.setNama("Yusuf");
        karyawan.setAlamat("Jakarta Barat");
        karyawan.mengajukanCuti();
        karyawan.mengajukanKerja();
        
        Math.min(6, 5);
        System.out.println(Math.min(6, 5));
        System.out.println(Math.pow(2, 64));
        
        int x = (int) (40.0 +  Math.random() * 60.0);
        System.out.println(x);
        
        int hari = karyawan.mengajukanCuti();
        System.out.println(hari);
        
        karyawan.mengajukanCuti(karyawan);
        System.out.println(karyawan.getId());
        
        Karyawan k1 = new Karyawan();
        k1.setNama("Hanafi");
        
        Karyawan k2 = k1;
        k2.setNama("Andi");
        
        System.out.println(k2.getNama());
        
        k1.jumlah = 50;
        
        Karyawan k3 = new Karyawan();
        Karyawan.jumlah = 100;
        System.out.println(k3.jumlah);
        
        
        
    }
}
