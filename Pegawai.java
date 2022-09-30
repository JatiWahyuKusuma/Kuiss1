public class Pegawai {
    private String nama;
    private String NIP;
    private double gajiPokok = 2000;
    private double lembur = 3000;
    private double uangMakan = 3500;
    private double transport = 4000;
    private int jumlahJamKerja;
    private double totalGaji;

    public Pegawai(String nama, String NIP){
        this.nama = nama;
        this.NIP = NIP;
    }

    public void setJamKerja(int jumlahJamKerja){
        this.jumlahJamKerja = jumlahJamKerja;
    }

    public int getJamKerja(){
        return jumlahJamKerja;
        
    }
    public void hitungGajiHarian(){
        if(jumlahJamKerja > 0 && jumlahJamKerja <=7){
            totalGaji = gajiPokok * jumlahJamKerja;
        }else if(jumlahJamKerja > 7 && jumlahJamKerja <9){
            totalGaji = (gajiPokok * 7) + ((jumlahJamKerja -7) * lembur) + uangMakan;
        }else if (jumlahJamKerja >= 9){
            totalGaji = (gajiPokok * 7) +((jumlahJamKerja -7) * lembur) + uangMakan + transport;
        }else{
            System.out.println("Jam kerja tidak Valid!!");
        }
    }

    public void cetakPenghasilan(){
        System.out.println("Nama               :" +nama);
        System.out.println("NIP                :" +NIP);
        System.out.println("Gaji Pokok         :" +gajiPokok);
        System.out.println("Lembur             :" +lembur);
        System.out.println("Uang Makan         :" +uangMakan);
        System.out.println("Transport          :" +transport);
        System.out.println("Total Gaji         :" +totalGaji);
    }
}
