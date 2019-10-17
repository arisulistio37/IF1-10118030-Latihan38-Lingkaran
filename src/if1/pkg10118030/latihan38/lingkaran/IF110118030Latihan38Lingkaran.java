/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10118030.latihan38.lingkaran;

/**
 *
 * @author 
 * NAMA     : Ari Sulistio
 * KELAS    : IF-1
 * NIM      : 10118030
 * Deskripsi program : program ini berisi tentang perhitungan lingkaran
 */
public class IF110118030Latihan38Lingkaran {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Lingkaran lingkaran = new Lingkaran();

        System.out.println("=======Perhitungan Lingkaran=======");
        lingkaran.validasiInput();
        lingkaran.hasilPerhitungan(lingkaran.diameter);
    }
    
}
