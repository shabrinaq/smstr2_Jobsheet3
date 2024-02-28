import java.util.Scanner;

/**
 * PersegiPanjangDemo
 */
public class PersegiPanjangDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Praktikum03.PersegiPanjang[] arrayOfPersegiPanjang = new Praktikum03.PersegiPanjang[3];
        
        
        for (int i = 0; i < 3; i++) {
            System.out.println("Persegi panjang ke-" + (i + 1));
            System.out.print("Masukkan panjang: ");
            int panjang = sc.nextInt();
            System.out.print("Masukkan lebar: ");
            int lebar = sc.nextInt();

            arrayOfPersegiPanjang[i] = new Praktikum03.PersegiPanjang(panjang, lebar);
        }

        for (int i = 0; i < 3; i++) {
            System.out.println("Persegi Panjang ke-" + (i + 1)+ ", panjang: "
            + arrayOfPersegiPanjang[i].panjang + ", lebar: " + arrayOfPersegiPanjang[i].lebar);
        }

        sc.close();
    }  
}
