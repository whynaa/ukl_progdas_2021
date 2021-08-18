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
public class array_1 {
    /**
     * Pengurangan array 
     * Syarat Kolom dan Baris kedua array sama
     */
    public static void main(String[] args) {
        int a[][] = {{1,-8,2},{-3,5,4},{2,8,6}};
        int b[][] = {{4,3,-1},{7,8,9},{-2,3,1}};
        System.out.println(a.length);
        System.out.println(b.length);
         
        System.out.println("Hasil A + B");
        for (int i = 0; i < a.length ; i++) {
            for (int j = 0; j < b[0].length; j++) {
                System.out.print(a[i][j] + b[i][j] + "\t");
            }
            System.out.println("");
        }
    }
}
