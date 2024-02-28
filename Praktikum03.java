import java.util.Scanner;

public class Praktikum03 {
    public static class PersegiPanjang {
        public int panjang;
        public int lebar;

        public PersegiPanjang(int panjang, int lebar) {
            this.panjang = panjang;
            this.lebar = lebar;
        }
        public void cetakInfo() {
            System.out.println("Panjang: " + panjang);
            System.out.println("Lebar: " + lebar);
            System.out.println("Luas: " + hitungLuas());
            System.out.println("Keliling: " + hitungKeliling());
        }

        public int hitungLuas() {
            return (panjang * lebar);
        }

        public int hitungKeliling() {
            return 2 * (panjang + lebar);
        }


        public static int jumlahPersegiPanjang() {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Masukkan Jumlah Persegi Panjang: ");
            int jumlah = scanner.nextInt();
            return jumlah;
        }
        
        }
    }
