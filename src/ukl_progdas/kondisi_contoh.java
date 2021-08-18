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

import java.util.Scanner;
public class kondisi_contoh {
    
    static int hitung(int nilai) {
        int bayar=20000;
        nilai=nilai-10;

        //pengitungan 10 kedua
        if (nilai>10){
            bayar=bayar+30000;
            nilai=nilai-10;
        }
        else {
            bayar=bayar+3000*nilai;
            nilai=0;
        }
 
        //pengitungan 10 ketiga
        if (nilai>10){
            bayar=bayar+40000;
            nilai=nilai-10;
        }
        else {
            bayar=bayar+4000*nilai;
            nilai=0;
        }
 
        //pengitungan selanjutnya
        if (nilai>10){
            bayar=bayar+3000*nilai;
        }
 
        return bayar;
    }
 
    public static void main(String[] args) { 
        int id[]={1,2,3,4,5};//id pelanggan
        String namaPelanggan[]={"Ali", "Budi", "Dani", "Edi", "Umar"};//nama pelanggan 

        Scanner myObj = new Scanner(System.in); 
        System.out.println("Masukkan id pelanggan");
        String idIn = myObj.nextLine(); 
        int iId=Integer.valueOf(idIn);

        System.out.println("Masukkan banyaknya pemakaian air dalam m3");
        String tagihan = myObj.nextLine(); 
        int iTagihan = Integer.valueOf(tagihan);

        if (iTagihan<=10){
            iTagihan=20000;
        }
        else {
            iTagihan=hitung(iTagihan);
        }

        iTagihan=iTagihan+10000;

        System.out.println("Print Out Tagihan");
        System.out.println("ID\t:" + idIn);
        System.out.println("Nama\t:" + namaPelanggan[iId-1]);
        System.out.println("Tagihan\t:Rp." + iTagihan+",-");
    }
}
