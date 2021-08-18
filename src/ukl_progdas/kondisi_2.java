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
import java.text.NumberFormat;
public class kondisi_2 {
    static String golongan_pendapatan (int pendapatan){
        String gol = "";
        if (pendapatan < 2000000) {
            gol = "A";
        }
        else if (pendapatan <= 10000000){
            gol = "B";
        }
        else if (pendapatan > 10000000) {
            gol = "C";
        }
        return gol;
    }
    static int [] hitung (int id, String jalur, String gol){
        int tagihan[] = {0,0};
        switch (jalur) {
            case "sbmptn":
                switch (gol) {
                    case "A":
                        tagihan[0] = 5000000;//DSP
                        tagihan[1] = 500000;//SPP
                        break;
                    case "B":
                        tagihan[0] = 15000000;
                        tagihan[1] = 1000000;
                        break;
                    case "C":
                        tagihan[0] = 30000000;
                        tagihan[1] = 2000000;
                        break;
                    default:
                        throw new AssertionError();
                }
                break;
            case "snmptn":
                switch (gol) {
                    case "A":
                        tagihan[0] = 7000000;
                        tagihan[1] = 500000;
                        break;
                    case "B":
                        tagihan[0] = 17000000;
                        tagihan[1] = 1000000;
                        break;
                    case "C":
                        tagihan[0] = 35000000;
                        tagihan[1] = 2000000;
                        break;
                    default:
                        throw new AssertionError();
                }
                break;
            case "mandiri":
                switch (gol) {
                    case "A":
                        tagihan[0] = 10000000;
                        tagihan[1] = 1000000;
                        break;
                    case "B":
                        tagihan[0] = 25000000;
                        tagihan[1] = 2000000;
                        break;
                    case "C":
                        tagihan[0] = 50000000;
                        tagihan[1] = 3000000;
                        break;
                    default:
                        throw new AssertionError();
                }
                break;
            default:
                throw new AssertionError();
        }
        return tagihan;
    }
    public static void main(String[] args) {
        int id[] = {1,2,3,4};
        String nama[] = {"Mira", "Nina", "Oemar", "Pena"};
        String alamat[] = {"Sawojajar", "Kedungkandang", "Ijen", "Dinoyo"};
        String jalur[] = {"sbmptn", "snmptn", "mandiri"};
        int bulan = 8;
        
        Scanner myObj = new Scanner(System.in); 
        System.out.println("Masukkan id mahasiswa");
        String iid = myObj.nextLine(); 
        int idm=Integer.valueOf(iid);
        
        System.out.println("Masukkan pendapatan orang tua dalam rupiah");
        String ipendapatan = myObj.nextLine(); 
        int pendapatan = Integer.valueOf(ipendapatan);
        
        String gol = golongan_pendapatan(pendapatan);
        
        int tagihan[] = hitung(idm, jalur[idm-1], gol);
        
        System.out.println("Print Out Tagihan DSP dan SPP");
        System.out.println("ID\t\t:" + idm);
        System.out.println("Nama\t\t:" + nama[idm-1]);
        System.out.println("Alamat\t\t:" + alamat[idm-1]);
        System.out.println("Jalur\t\t:" + jalur[idm-1]);
        System.out.println("Golongan\t:" + gol);
        System.out.println("Tagihan DSP\t:Rp." + tagihan[0]+",-");
        System.out.println("Tagihan SPP\t:Rp." + tagihan[1]+",-");
        System.out.println("Total SPP\t:Rp." +(tagihan[1]*bulan));
    }
}
