package miijavaxiv;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author YusufHA
 */
public class CommonMistake {
    public static void main(String[] args) {
        
        //*1*
        int [] x = {1,3,4,5,2,2,9,8,3};
        
        List<Integer> tujuan = new ArrayList<>();
        for (int i = 0; i < x.length; i++){
            tujuan.add(x[i]);
        }
        System.out.println(tujuan.size());
        
        
        //*2*
        Karyawan karyawan;
        List<Karyawan> k = new ArrayList<>();
        String [] alamats = {"Bandung", "Jakarta", "Jogja", "Klaten"};
        for(int i = 0; i < alamats.length; i++){
            karyawan = new Karyawan();
            karyawan.setAlamat(alamats[i]);
            k.add(karyawan);
        }
        for(Karyawan kar : k){
            System.out.println(kar.getAlamat());
        }
        
        //*3*
        //Perbandingan String menggunakan 'equals'
        String a1 = new String("Solo");
        String a2 = "Solo";
        System.out.println(a1 == a2);
        System.out.println(a1.equals(a2));
        
        StringBuilder builder = new StringBuilder();
        builder.append("solo");
        
        System.out.println(a1 = builder.toString());
        System.out.println(a1.equals(builder.toString()));
        
        //*4*
        System.out.println(2 + 5 + "Jumlah");
        System.out.println("Jumlah" + 2 + 5);
        System.out.println("JUmlah" + (2+5));
        
        //*5*
        int j = Integer.MAX_VALUE + 10;
        System.out.println(j);
        System.out.println(Integer.MAX_VALUE);
    }
}
