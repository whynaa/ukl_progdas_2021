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
public class loop_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /**
         * Deret Aritmatika
         */
        
        int a = 8;
        int b = 7;
        int n_awal = 4;
        int n_akhir = 14;
        int un = a; //suku ke n
        int sn = a; //jumlah deret
        
        System.out.println("Deret Aritmatika : ");
        for (int i = 1; i <= n_akhir; i++) {
            if (i >= n_awal) {
                System.out.println(un);
            }
            un += b;
            sn += un;
        }
        sn -= un;
        System.out.println("jumlah Deret = " + sn);
    }
    
}
