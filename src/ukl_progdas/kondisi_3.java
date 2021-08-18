/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ukl_progdas;
import java.util.Scanner;
/**
 *
 * @author whyna
 */
public class kondisi_3 {
    static int hitung(int gol, String in, String out){
        int harga = 0;
        switch (in) {
            case "A":
                switch (out) {
                    case "B":
                        switch (gol) {
                            case 1:
                                harga = 6000;
                                break;
                            case 2:
                                harga = 9000;
                                break;
                            case 3:
                                harga = 9000;
                                break;
                            default:
                                throw new AssertionError();
                        }
                    break;
                    case "C":
                        switch (gol) {
                            case 1:
                                harga = 9000;
                                break;
                            case 2:
                                harga = 14000;
                                break;
                            case 3:
                                harga = 14000;
                                break;
                            default:
                                throw new AssertionError();
                        }
                    break;
                    default:
                        throw new AssertionError();
                }
            break;
            case "B":
                switch (out) {
                    case "A":
                        switch (gol) {
                            case 1:
                                harga = 6000;
                                break;
                            case 2:
                                harga = 9000;
                                break;
                            case 3:
                                harga = 9000;
                                break;
                            default:
                                throw new AssertionError();
                        }
                    break;
                    case "C":
                        switch (gol) {
                            case 1:
                                harga = 5500;
                                break;
                            case 2:
                                harga = 8500;
                                break;
                            case 3:
                                harga = 8500;
                                break;
                            default:
                                throw new AssertionError();
                        }
                    break;
                    default:
                        throw new AssertionError();
                }
            break;
            case "C":
                switch (out) {
                    case "B":
                        switch (gol) {
                            case 1:
                                harga = 5500;
                                break;
                            case 2:
                                harga = 8500;
                                break;
                            case 3:
                                harga = 8500;
                                break;
                            default:
                                throw new AssertionError();
                        }
                    break;
                    case "A":
                        switch (gol) {
                            case 1:
                                harga = 9000;
                                break;
                            case 2:
                                harga = 14000;
                                break;
                            case 3:
                                harga = 14000;
                                break;
                            default:
                                throw new AssertionError();
                        }
                    break;
                    default:
                        throw new AssertionError();
                }
            break;
            default:
                throw new AssertionError();
        }
        return harga;
    }
    static String tol (String kode){
        String nama = "";
        switch (kode) {
            case "A":
                nama = "Waru";
                break;
            case "B":
                nama = "Sidaoarjo";
                break;
            case "C":
                nama = "Porong";
                break;
            default:
                throw new AssertionError();
        }
        return nama;
    }
    public static void main(String[] args) {
        int gol;
        String in, out;
        
        System.out.println("Golongan Kendaraan");
        System.out.println("1. Sedan/Jip/PickUp");
        System.out.println("2. Truk Sumbu Roda 2");
        System.out.println("3. Truk Sumbu Roda 3");
        
        Scanner myObj = new Scanner(System.in); 
        do {
            System.out.println("Masukkan Golongan Kendaraan");
            String igol = myObj.nextLine(); 
            gol=Integer.valueOf(igol);
        } while (gol < 1 || gol >3);
        
        System.out.println("Kode Gerbang TOL");
        System.out.println("A. Waru");
        System.out.println("B. Sidoarjo");
        System.out.println("C. Porong");
        
        do {
            System.out.println("Masukkan Kode Gerbang Masuk");
            in = myObj.nextLine(); 
        } while (in == "A" || in == "B" || in == "C");
        
        System.out.println("Masukkan Kode Gerbang Keluar");
        out = myObj.nextLine(); 
        
        int hitung = hitung(gol, in, out);
        String masuk = tol(in);
        String keluar = tol(out);
        
        System.out.println("Print Out Tagihan TOL");
        System.out.println("Golongan\t:" + gol);
        System.out.println("Asal\t\t:" + masuk);
        System.out.println("Tujuan\t\t:" + keluar);
        System.out.println("Harga\t\t:Rp." + hitung);
    }
}
