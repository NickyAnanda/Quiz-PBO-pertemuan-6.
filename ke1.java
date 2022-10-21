import java.util.ArrayList;
import java.util.Scanner;

public class ke1 {

    public static void main(String[] args) {
        ArrayList<ke2> z = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        Integer pilih = 0;

        System.out.println("-----------------------------------");
        System.out.println("- Selamat Datang di Nichida Store -");
        System.out.println("-----------------------------------");
        System.out.println("1.Peminjaman Video Games");
        System.out.println("2.Pembelian Video Games");
        System.out.println("3.Keluar");
        System.out.println("-----------------------------------");
        System.out.print("Pilih : ");
        pilih = sc.nextInt();

        if (pilih == 1) {
            z = sewa(z);
        } else if (pilih == 2) {
            z = beli(z);
        }
        while (pilih != 3)
            ;
    }

    private static ArrayList<ke2> sewa(ArrayList<ke2> z) {
        Scanner sc = new Scanner(System.in);
        String nama, a, w;
        Integer n, p;

        System.out.println("=========================================");
        System.out.print("Nama : ");
        nama = sc.nextLine();

        System.out.print("Alamat : ");
        a = sc.nextLine();

        System.out.print("No Telfon : ");
        w = sc.nextLine();

        System.out.println("Games yang saat ini tersedia : ");
        System.out.println("1.God of War IV");
        System.out.println("2.Persona 5 Royal");
        System.out.println("3.Phasmophobia");

        System.out.print("Game yang akan di sewa : ");
        p = sc.nextInt();

        System.out.println("waktu yang tersedia sewa : 3,7,15,30 hari");
        System.out.print("Lama penyewaan : ");
        n = sc.nextInt();

        System.out.println("=========================================");
        System.out.println("=            Hasil Pemesanan            =");
        System.out.println("=========================================");

        System.out.println("Nama : " + nama);
        System.out.println("Alamat : " + a);
        System.out.println("No Telfon : " + w);
        System.out.print("Game yang di sewa : ");
        if (p == 1) {
            System.out.println("1.God of War IV");
        } else if (p == 2) {
            System.out.println("2.Persona 5 Royal");
        } else if (p == 3) {
            System.out.println("3.Phasmophobia");
        }
        System.out.println("Lama yang akan disewa : " + n + " Hari.");

        System.out.println("========================================================");
        System.out.println("=              Terimakasih sudah memesan.              =");
        System.out.println("= Silahkan anda ke kasir untuk melanjutkan pembayaran. =");
        System.out.println("========================================================");
        return z;
    }

    private static ArrayList<ke2> beli(ArrayList<ke2> z) {
        Scanner sc = new Scanner(System.in);
        String nama, a, w;
        Integer p;

        System.out.println("=========================================");
        System.out.print("Nama : ");
        nama = sc.nextLine();

        System.out.print("Alamat : ");
        a = sc.nextLine();

        System.out.print("No Telfon : ");
        w = sc.nextLine();

        System.out.println("Games yang saat ini tersedia : ");
        System.out.println("1.God of War IV");
        System.out.println("2.Persona 5 Royal");
        System.out.println("3.Phasmophobia");

        System.out.print("Game yang akan di Beli : ");
        p = sc.nextInt();

        System.out.println("=========================================");
        System.out.println("=            Hasil Pemesanan            =");
        System.out.println("=========================================");
        System.out.println("Nama : " + nama);
        System.out.println("Alamat : " + a);
        System.out.println("No Telfon : " + w);
        System.out.print("Game yang di sewa : ");
        if (p == 1) {
            System.out.println("1.God of War IV");
        } else if (p == 2) {
            System.out.println("2.Persona 5 Royal");
        } else if (p == 3) {
            System.out.println("3.Phasmophobia");
        }
        System.out.println("========================================================");
        System.out.println("=              Terimakasih sudah memesan.              =");
        System.out.println("= Silahkan anda ke kasir untuk melanjutkan pembayaran. =");
        System.out.println("========================================================");
        return z;
    }
}