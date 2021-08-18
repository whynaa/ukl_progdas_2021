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
public class kondisi_1 {
    static int hitung(int listrik, int gol){
        int admin = 13000;
        int bayar = admin;
        
        switch (gol) {
            case 1:
                bayar += listrik * 1000;
                break;
            case 2:
                bayar += listrik * 1300;
                break;
            case 3:
                bayar += listrik * 1500;
                break;
            default:
                break;
        }

        return bayar;
    }
    public static void main(String[] args) {
        int id[] = {1,2,3,4};
        String nama[] = {"Galuh", "Indro", "Jedi" , "Kanu"};
        int golongan[] = {1,3,2,3};
        String alamat [] = {"Sawojajar", "Kedungkandang", "Ijen", "Dinoyo"};
        
        Scanner myObj = new Scanner(System.in); 
        System.out.println("Masukkan id pelanggan");
        String idIn = myObj.nextLine(); 
        int iId=Integer.valueOf(idIn);
        
        System.out.println("Masukkan banyaknya pemakaian listrik dalam kwh");
        String listrik = myObj.nextLine(); 
        int ilistrik = Integer.valueOf(listrik);
        
        int tagihan = hitung(ilistrik, golongan[iId-1]);
        
        System.out.println("Print Out Tagihan Listrik");
        System.out.println("ID\t\t:" + idIn);
        System.out.println("Nama\t\t:" + nama[iId-1]);
        System.out.println("Alamat\t\t:" + alamat[iId-1]);
        System.out.println("Golongan\t:" + golongan[iId-1]);
        System.out.println("Tagihan\t\t:Rp." + tagihan+",-");
        
    }
}
