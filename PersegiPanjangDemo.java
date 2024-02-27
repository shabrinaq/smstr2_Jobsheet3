/**
 * PersegiPanjangDemo
 */
public class PersegiPanjangDemo {

    public static void main(String[] args) {
        Praktikum03.PersegiPanjang[] arrayOfPersegiPanjang = new Praktikum03.PersegiPanjang[3];

        arrayOfPersegiPanjang[0] = new Praktikum03.PersegiPanjang();
        arrayOfPersegiPanjang[0].panjang = 110;
        arrayOfPersegiPanjang[0].lebar = 30;
    
        arrayOfPersegiPanjang[1] = new Praktikum03.PersegiPanjang();
        arrayOfPersegiPanjang[1].panjang = 80;
        arrayOfPersegiPanjang[1].lebar = 40;
    
        arrayOfPersegiPanjang[2] = new Praktikum03.PersegiPanjang();
        arrayOfPersegiPanjang[2].panjang = 100;
        arrayOfPersegiPanjang[2].lebar = 20;
    
        System.out.println("Persegi panjang ke-1, panjang: " + arrayOfPersegiPanjang[0].panjang + ", lebar: " + arrayOfPersegiPanjang[0].lebar);
        System.out.println("Persegi panjang ke-2, panjang: " + arrayOfPersegiPanjang[1].panjang + ", lebar: " + arrayOfPersegiPanjang[1].lebar);
        System.out.println("Persegi panjang ke-3, panjang: " + arrayOfPersegiPanjang[2].panjang + ", lebar: " + arrayOfPersegiPanjang[2].lebar);
    }
} //cobadeh yaaa