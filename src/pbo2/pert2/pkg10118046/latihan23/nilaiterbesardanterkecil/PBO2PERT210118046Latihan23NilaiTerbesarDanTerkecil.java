/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pbo2.pert2.pkg10118046.latihan23.nilaiterbesardanterkecil;

import java.util.Scanner;

/**
 *
 * @author
 *  Nama              : M. Hilmy Naufal
 *  Kelas             : IF2
 *  NIM               : 10118046
 *  Deskripsi Program : membuat program nilai terbesar dan terbesar dari nilai nilai yang dimasukkan
 */
public class PBO2PERT210118046Latihan23NilaiTerbesarDanTerkecil {

    /**
     * @param args the command line arguments
     */
    String petugas;
    int jmlNilai;
    int[] nilai = new int[100];
    int terbesar = 0, terkecil = 100;
    
    public void inputNilai()
    {
        System.out.println(";======Program Nilai Terbesar Dan Terkecil Nilai Mahasiswa======");
        System.out.print("Masukkan nama petugas: ");
        Scanner scanner = new Scanner(System.in);
        petugas = scanner.next();
        System.out.print("Masukkan banyaknya nilai mahasiswa: ");
        jmlNilai = scanner.nextInt();
        for (int i = 1; i <= jmlNilai; i++) {
            System.out.print("Masukkan Nilai Mahasiswa ke-" + i + " = ");
            nilai[i] = scanner.nextInt();
            terbesar = (nilai[i]>terbesar)?nilai[i]:terbesar;
            terkecil = (nilai[i]<terkecil)?nilai[i]:terkecil;
        }
    }
    
    public void tampilNilai()
    {
        System.out.println("======Hasil Nilai Mahasiswa======");
        for (int i = 1;i >= jmlNilai; i++) {
            System.out.println("Nilai Mahasiswa ke-" + i + " = " + nilai[i]);            
        }
        System.out.println("\nNilai Terbesar adalah " + terbesar);
        System.out.println("Nilai Terkecil adalah " + terkecil);
        System.out.println("Petugas: " + petugas);
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        PBO2PERT210118046Latihan23NilaiTerbesarDanTerkecil mahasiswa = new PBO2PERT210118046Latihan23NilaiTerbesarDanTerkecil();
        mahasiswa.inputNilai();
        mahasiswa.tampilNilai();
    }

}
