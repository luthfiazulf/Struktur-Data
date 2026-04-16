package utsinsertionsort;

class Barang {
    String Nama;
    String Kode;
    int Harga;
    
    public Barang (String Nama, String Kode, int Harga) {
        this.Nama = Nama;
        this.Kode = Kode;
        this.Harga = Harga;
    }
    public void tampilkan() {
        System.out.printf ("| %-15s | %-12s | Rp %-7d | \n", Nama, Kode, Harga);
    }
}

public class UTSInsertionSort {

    public static void main(String[] args) {
        // 10 DATA NAMA BARANG, KODE & HARGA
        Barang[] DaftarBarang = {
            new Barang ("BUKU TULIS", "BL-218", 6000),
            new Barang ("PENSIL", "PL-218", 3000),
            new Barang ("BUKU GAMBAR", "BG-035", 12000),
            new Barang ("BOLPOIN", "BP-526", 4000),
            new Barang ("TINTA", "TN-736", 50000),
            new Barang ("PENGHAPUS", "PS-432", 2000),
            new Barang ("SPIDOL", "SL-224", 9000),
            new Barang ("KOTAK PENSIL", "KP-367", 25000),
            new Barang ("STABILO", "SO-651", 7000),
            new Barang ("PENGGARIS", "PE-349", 5000),

        };
        
        System.out.println ("            DATA SEBELUM DIURUTKAN             ");
        System.out.println ("+-----------------+--------------+------------+");
        System.out.println ("| NAMA BARANG     | KODE BARANG  | HARGA      |");
        System.out.println ("+-----------------+--------------+------------+");
        for (Barang b : DaftarBarang) b.tampilkan();
        System.out.println ("+-----------------+--------------+------------+");
        
        int n = DaftarBarang.length;
        for (int i = 1; i < n; i++) {
            Barang key = DaftarBarang[i];
            int j = i - 1;
            
            while (j >= 0 && DaftarBarang [j].Harga > key.Harga) {
                DaftarBarang [j+1] = DaftarBarang [j];
                j = j - 1;
            }
            DaftarBarang [j + 1] = key;
        }
        System.out.println ();
        System.out.println ();
        System.out.println ("            DATA SESUDAH DIURUTKAN             ");
        System.out.println ("+-----------------+--------------+------------+");
        System.out.println ("| NAMA BARANG     | KODE BARANG  | HARGA      |");
        System.out.println ("+-----------------+--------------+------------+");
        for (Barang b : DaftarBarang) b.tampilkan();
        System.out.println ("+-----------------+--------------+------------+");
    }
    
}
