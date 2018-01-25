package objectoriented;

import java.util.Scanner;

/**
 *
 * @author YusufHA
 */
public class Percabangan {
    public static void main(String[] args) {
        while (true) {
            System.out.println("\n=========================");
            Scanner scan = new Scanner(System.in);
            System.out.println("Masukkan tahun : ");
            int tahun = scan.nextInt();
            Scanner scanner = new Scanner(System.in);
            System.out.println("Masukkan bulan : ");
            BULAN bulan = BULAN.valueOf(scanner.next());
            int jlh_hari = 0;
            switch (bulan) {
                case JANUARY:
                case MARCH:
                case MAY:
                case JULY:
                case AUGUST:
                case OCTOBER:
                case DECEMBER:
                    jlh_hari = 31;
                    break;
                case FEBRUARY:
                    jlh_hari = tahun % 4 == 0 ? 29 : 28;
                    break;
                case APRIL:
                case JUNE:
                case SEPTEMBER:
                case NOVEMBER:
                    jlh_hari = 30;
                    break;
                default:
                    System.out.println("---");
                    break;
            }
            System.out.println("Jumlah hari = " + jlh_hari);
            System.out.println("=========================");
        }
    }
}

enum BULAN {
    JANUARY, FEBRUARY, MARCH, APRIL, MAY, JUNE, JULY, AUGUST, SEPTEMBER, OCTOBER, NOVEMBER, DECEMBER;
}
