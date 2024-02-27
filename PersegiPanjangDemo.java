import java.util.Scanner;

/**
 * PersegiPanjangDemo
 */
public class PersegiPanjangDemo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Praktikum03.PersegiPanjang[] arrayOfPersegiPanjang = new Praktikum03.PersegiPanjang[3];

        for (int i = 0; i < 3; i++) {
            arrayOfPersegiPanjang[i] = new Praktikum03.PersegiPanjang();
    
            System.out.println("Persegi panjang ke-" +(i + 1));
            System.out.print("Masukkan panjang: ");
            arrayOfPersegiPanjang[i].panjang = sc.nextInt();
            System.out.print("Masukkan lebar: ");
            arrayOfPersegiPanjang[i].lebar = sc.nextInt();
           } 

        arrayOfPersegiPanjang[0] = new Praktikum03.PersegiPanjang();
        arrayOfPersegiPanjang[0].panjang = 110;
        arrayOfPersegiPanjang[0].lebar = 30;
   
        arrayOfPersegiPanjang[1] = new Praktikum03.PersegiPanjang();
        arrayOfPersegiPanjang[1].panjang = 80;
        arrayOfPersegiPanjang[1].lebar = 40;
   
        arrayOfPersegiPanjang[2] = new Praktikum03.PersegiPanjang();
        arrayOfPersegiPanjang[2].panjang = 100;
        arrayOfPersegiPanjang[2].lebar = 20;
   
        for (int i = 0; i < 3; i++) {
            System.out.println("Persegi Panjang ke-" + (i + 1)+ ", panjang: "
            + arrayOfPersegiPanjang[i].panjang + ", lebar: " + arrayOfPersegiPanjang[i].lebar);
        }

        System.out.println("Persegi panjang ke-1, panjang: " + arrayOfPersegiPanjang[0].panjang + ", lebar: " + arrayOfPersegiPanjang[0].lebar);
        System.out.println("Persegi panjang ke-2, panjang: " + arrayOfPersegiPanjang[1].panjang + ", lebar: " + arrayOfPersegiPanjang[1].lebar);
        System.out.println("Persegi panjang ke-3, panjang: " + arrayOfPersegiPanjang[2].panjang + ", lebar: " + arrayOfPersegiPanjang[2].lebar);
    }
} 