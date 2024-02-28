import java.util.Scanner;

/**
 * PersegiPanjangDemo
 */
public class PersegiPanjangDemo {
    public static void main(String[] args) {
        int jumlahPersegi = Praktikum03.PersegiPanjang.jumlahPersegiPanjang();
        Praktikum03.PersegiPanjang[] arrayOfPersegiPanjang = new Praktikum03.PersegiPanjang[jumlahPersegi];
        Scanner sc = new Scanner(System.in);
        int panjang, lebar;
        Praktikum03.PersegiPanjang persegi = new Praktikum03.PersegiPanjang(5, 10);
        persegi.cetakInfo();

        for (int i = 0; i < jumlahPersegi; i++) {
            System.out.println("Persegi panjang ke- " + (i + 1));
            System.out.print("Masukkan panjang : ");
            panjang = sc.nextInt();
            System.out.print("Masukkan lebar : ");
            lebar = sc.nextInt();

            arrayOfPersegiPanjang[i] = new Praktikum03.PersegiPanjang(panjang, lebar);
        }

        for (int i = 0; i < jumlahPersegi; i++) {
            System.out.println("Persegi panjang ke- " + (i + 1) + ", panjang: " + arrayOfPersegiPanjang[i].panjang
                    + ", lebar : " + arrayOfPersegiPanjang[i].lebar + ", luas : " + arrayOfPersegiPanjang[i].hitungLuas()
                    + ", keliling : " + arrayOfPersegiPanjang[i].hitungKeliling());
        }

        sc.close();
    }  
}
