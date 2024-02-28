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
            System.out.println("Persegi panjang ke- " + (i + 1));
            System.out.print("Masukkan panjang : ");
            panjang = sc.nextInt();
            System.out.print("Masukkan lebar : ");
            lebar = sc.nextInt();
    
            arrayOfPersegiPanjang[i] = new Praktikum03.PersegiPanjang(panjang, lebar);
        }
    
        arrayOfPersegiPanjang[0] = new Praktikum03.PersegiPanjang(110, 30);
        arrayOfPersegiPanjang[1] = new Praktikum03.PersegiPanjang(80, 40);
        arrayOfPersegiPanjang[2] = new Praktikum03.PersegiPanjang(100, 20);
    
        for (int i = 0; i < 3; i++) {
            System.out.println("Persegi panjang ke- " + (i + 1) + ", panjang: " + arrayOfPersegiPanjang[i].panjang
                    + ", lebar : " + arrayOfPersegiPanjang[i].lebar + ", luas : " + arrayOfPersegiPanjang[i].hitungLuas()
                    + ", keliling : " + arrayOfPersegiPanjang[i].hitungKeliling());
        }
    
        sc.close();
    }  
}
