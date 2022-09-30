import java.util.Scanner;
public class PegawaiDemo{
    public static void main (String args[]){
        Scanner masukkan = new Scanner(System.in);
        System.out.println("==================================");
        System.out.println("|     DATA PEGAWAI MAJU JAYA     |");
        System.out.println("==================================");
        System.out.println("Masukkan jumlah pegawai :");
        int jp = masukkan.nextInt();
        for(int i=0; i<jp; i++){
            System.out.println("==================================");
            System.out.println("Masukkan Nama Pegawai       :");
            String nama = masukkan.next();
            System.out.println("Masukkan NIP pegawai        :");
            String NIP = masukkan.next();
            Pegawai peg1 = new Pegawai(nama, NIP);
            System.out.println("Masukkan Jumlah jam kerja   :");
            int jumlahJamKerja = masukkan.nextInt();
            System.out.println("==================================");
            peg1.setJamKerja(jumlahJamKerja);
            peg1.hitungGajiHarian();
            peg1.cetakPenghasilan();
        } 
    }
}
