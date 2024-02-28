

/**
 * Praktikum03
 */
public class Praktikum03 {
    public static class PersegiPanjang {
        public int panjang;
        public int lebar;

        public PersegiPanjang(int panjang, int lebar) {
            this.panjang = panjang;
            this.lebar = lebar;
        }

        public int hitungLuas() {
            return (panjang * lebar);
        }

        public int hitungKeliling() {
            return 2 * (panjang + lebar);
        }
    }
}