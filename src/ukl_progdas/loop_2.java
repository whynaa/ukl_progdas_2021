/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ukl_progdas;

/**
 *
 * @author whyna
 */
public class loop_2 {
    public static void main(String[] args) {
        /**
         * Matrix dari Deret Aritmatika
         */
        
        int a = 2;
        int b = 2;
        int baris = 6;
        int kolom = 6;
        int un = a;
        int sn = a;
        
        System.out.println("Deret Aritmatika : ");
        for (int i = 1; i <= baris; i++) {
            for (int j = 1; j <= kolom; j++) {
                System.out.print(un + "\t");
                un += b;
                sn += un;
            }
            System.out.println("");
        }
        sn -= un;
        System.out.println("jumlah Deret = " + sn);
    }
}
