// mengimpor Scanner ke program
import java.util.Scanner;

// Membut Class
public class JobVacancyV2{
    public static void main (String [] args){

         // deklarasi variabel
         Scanner keyboard = new Scanner(System.in); // untuk inputan user
         String nama, JenisKelamin, posisi, lulusan, hasil;
         int umur;
         double pengalaman, penampilan;
         boolean kor1, kor2, ad1, ad2, ad3, spv1, spv2;

         // Mengatur inisialisasi

        hasil = "";
        lulusan = "";
       

         // Tampilkan input user
        System.out.println("Siapa Nama Mu : ");
        nama = keyboard.next();

        System.out.println("Berapa Umur Mu :");
        umur = keyboard.nextInt();

        System.out.println("Jenis Kelamin (Pria / Wanita):");
        JenisKelamin = keyboard.next();

        System.out.println("Lulusan (SMK / D3 / S1):");
        lulusan = keyboard.next();

        System.out.println("Pengalaman Bekerja : ");
        pengalaman = keyboard.nextDouble();

        System.out.println("Penampilan Anda (1 - 10)");
        penampilan = keyboard.nextDouble();

        System.out.println("Posisi yang Anda Dilamar ( SPV, Admin Atau Kordinator )? ");
        posisi = keyboard.next();

         // alogirtma IF Else dan tambah nested
         if (posisi.equalsIgnoreCase("Kordinator")){
            kor1 = JenisKelamin.equalsIgnoreCase("Pria") && umur >= 21 && umur <= 30 && (lulusan.equalsIgnoreCase("SMK") || lulusan.equalsIgnoreCase("D3")) && pengalaman >= 2;
            kor2 = JenisKelamin.equalsIgnoreCase("Pria") && umur >= 30 && (lulusan.equalsIgnoreCase("S1")) && pengalaman >= 5;
            if (kor1 || kor2 ){
                hasil = ("Selamat Anda memenuhi Persyaratan Sebagai " + posisi + " dan Berhak Untuk ke Tahap Berikutnya");
            }else hasil = ("Mohon Maaf, Anda Belum Memenuhi Syarat Sebagai " + posisi + " dan Anda Belum Berhak Untuk ke Tahap Berikutnya");
         }else if(posisi.equalsIgnoreCase("Admin")){
            ad1 = JenisKelamin.equalsIgnoreCase("Wanita") && umur >= 20 && umur <= 25 && lulusan.equalsIgnoreCase("D3") && (penampilan >= 8.5 || pengalaman >= 1);
            ad2 = JenisKelamin.equalsIgnoreCase("Wanita") && umur >= 25 && lulusan.equalsIgnoreCase("S1") && penampilan >= 8.5 && pengalaman >= 3;
            ad3 = JenisKelamin.equalsIgnoreCase("Pria") && umur >= 20 && umur <= 30 && penampilan >= 8.5 && (lulusan.equalsIgnoreCase("D3") || lulusan.equalsIgnoreCase("S1")) && pengalaman >= 2;
            if (ad1 || ad2 || ad3 ){
                hasil = ("Selamat Anda memenuhi Persyaratan Sebagai " + posisi + " dan Berhak Untuk ke Tahap Berikutnya");
            }else hasil = ("Mohon Maaf, Anda Belum Memenuhi Syarat Sebagai " + posisi + " dan Anda Belum Berhak Untuk ke Tahap Berikutnya");
         }else if(posisi.equalsIgnoreCase("SPV")){
            spv1 = (JenisKelamin.equalsIgnoreCase("Pria") || JenisKelamin.equalsIgnoreCase("Wanita")) && umur >= 23 && umur <= 30 && lulusan.equalsIgnoreCase("S1") && pengalaman >= 1;
            spv2 = (JenisKelamin.equalsIgnoreCase("Pria") || JenisKelamin.equalsIgnoreCase("Wanita")) && umur >= 25 && umur <= 35 && lulusan.equalsIgnoreCase("D3") && pengalaman >= 4;
            if (spv1 || spv2){
                hasil = ("Selamat Anda memenuhi Persyaratan Sebagai " + posisi + " dan Berhak Untuk ke Tahap Berikutnya");
            } else hasil = ("Mohon Maaf, Anda Belum Memenuhi Syarat Sebagai " + posisi + " dan Anda Belum Berhak Untuk ke Tahap Berikutnya");
         } else


// Untuk or di sini kita liat ceknya harus perhatikan if dan elsenya

         // Tampilan Output
         System.out.println("==========================");
         System.out.println(" Berikut Merupakan Hasil pengumuman dari perusahaan kami : ");
         System.out.println(" Hallo : " + nama);
         System.out.println("==========================");
         System.out.println(hasil);
         System.out.println("==========================");
         
    }
}