import java.util.Scanner;

/**
 * PersegiPanjangDemo
 */
public class PersegiPanjangDemo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Praktikum03.PersegiPanjang[] arrayOfPersegiPanjang = new Praktikum03.PersegiPanjang[3];
        int panjang, lebar;

        for (int i = 0; i < 3; i++) {
            System.out.println("Persegi panjang ke-" + (i + 1));
            System.out.print("Masukkan panjang: ");
            panjang = sc.nextInt();
            System.out.print("Masukkan lebar: ");
            lebar = sc.nextInt();

            arrayOfPersegiPanjang[i] = new Praktikum03.PersegiPanjang();

        arrayOfPersegiPanjang[0] = new Praktikum03.PersegiPanjang();
        arrayOfPersegiPanjang[0].panjang = 2;
        arrayOfPersegiPanjang[0].lebar = 3;
   
        arrayOfPersegiPanjang[1] = new Praktikum03.PersegiPanjang();
        arrayOfPersegiPanjang[1].panjang = 4;
        arrayOfPersegiPanjang[1].lebar = 5;
   
        arrayOfPersegiPanjang[2] = new Praktikum03.PersegiPanjang();
        arrayOfPersegiPanjang[2].panjang = 2;
        arrayOfPersegiPanjang[2].lebar = 4;
    }

    for (int i = 0; i < 3; i++) {
        System.out.println("Persegi Panjang ke-" + (i + 1)+ ", panjang: "
        + arrayOfPersegiPanjang[i].panjang + ", lebar: " + arrayOfPersegiPanjang[i].lebar);
    }
} 
}