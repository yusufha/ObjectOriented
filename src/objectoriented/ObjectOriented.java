/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objectoriented;

import java.util.Arrays;

/**
 *
 * @author YusufHA
 */
public class ObjectOriented {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i = 10;
        long l = (long) i;
        
        short x = 110;
        int z = (int) x;
        
        int y = 1_000_000;
        
        System.out.println(i);       
        System.out.println(l);
        
        System.out.println(x);
        System.out.println(z);
        
        System.out.println(y);
        
        System.out.println(Double.MIN_VALUE);
        System.out.println("Print Tes");
        
        System.out.println("========================");
        
        double d1 = 5.6;
        double d2 = 5.8;
        
        System.out.println(d1 + d2);
        
        char c = 89;
        String b = "abcde";
        
        System.out.println(c);
        
        for (char a='a'; a<='z'; a++){
            System.out.print(a);
        }
        
        
        for (int ii=0; ii<10; ii++ ){
            if(ii % 5 == 4) break; 
            
            System.out.println(ii);
        }
        
        System.out.println("=====Array=====");
        
        int [] arrInt [] = { {1,2} , {4,5,6} };
        
        System.out.println("Panjang Array = " + arrInt.length);
        
        System.out.println("--------");
        
        for (int[] is : arrInt) {
            for (int j : is) {
                System.out.println(j);
            }
        }
        
        System.out.println("--------");
        
        int [] f = new int [5];
        for (int fx = 0; fx <5; fx++){
            f[fx] = fx + 1;
        }
        System.out.println(Arrays.toString(f));
        
        System.out.println("--------");
        
        int [][] g = new int [5][5];
        for (int gx = 0; gx <5; gx++){
            for (int gy = 0; gy <5; gy++){
                g[gx][gy] = (gx *5) + 1 + gy;
            }
            System.out.println(Arrays.toString(g[gx]));
        }
        
        System.out.println("--------");
        
        int [][] h = new int [5][5];
        for (int hx = 0; hx <5; hx++){
            for (int hy = 0; hy <5; hy++){
                h[hx][hy] = (hx+hy) % 2 ;
            }
            System.out.println(Arrays.toString(h[hx]));
        }
    }
}
