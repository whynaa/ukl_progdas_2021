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
public class loop_4a {
    public static void main(String[] args) {
        /**
         * Matrix model a
         *    *
         *    *  *
         *    *  *  *
         *    *  *
         *    *
         */
        
        int a = 10;
        int b = 2;
        int kolom = 5;
        int un = a;
        int sn = a;
        
        System.out.println("Deret Aritmatika : ");
        for (int i = 0; i < kolom; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(un + "\t");
                un += b;
                sn += un;
            }
            System.out.println("");
        }
        for (int i = 0; i < kolom; i++) {
            for (int j = 0; j < kolom-1-i; j++) {
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
