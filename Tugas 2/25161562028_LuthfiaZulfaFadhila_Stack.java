package _25161562028_luthfiazulfafadhila_stack;

public class _25161562028_LuthfiaZulfaFadhila_Stack {
    // === BAGIAN 1: Deklarasi Stack ===
    static String[] stack = new String[10];
    static int top = -1;
    
    // === BAGIAN 2: Operasi Stack ===
    
    // TODO: Lengkapi method push()
    static void push(String tiket) { 
        if (top==stack.length -1) { //Cek kondisi stack penuh (overflow) sebelum push
            System.out.println ("Stack Penuh!"); //jika penuh ,jangan tambahkan data
        }
        else{
            top++; //untuk menggeser posisi top ke atas
            stack[top]= tiket; // untuk memasukkan data tiket ke posisi top baru
        }
 }
    // TODO: Lengkapi method pop()
    static String pop() {  
        if (isEmpty()) {  //Cek kondisi stack kosong (underflow) sebelum pop
            return "Stack Kosong!";  //jika kosong, beri peringatan
        }
        else{
            String DataDihapus= stack[top];  //untuk menyimpan data teratas ke variabel sementara
            top--;  //untuk menurunkan posisi top karena secara logis data teratas sudah terhapus
            return DataDihapus;  //kembalikan data yang baru saja diambil
        }
 }
    // TODO: Lengkapi method peek()
    static String peek() {
        if (isEmpty()) {
            return "Stack Kosong";  // jika tidak ada data return "stack Kosong"
        }
        else{
            return stack[top];  //untuk mengembalikan data yang ada di posisi top saat ini
        }
 }
    static boolean isEmpty() {
    return top == -1;
 }
    static void tampilkanStack() {
    System.out.println("=== Isi Stack (TOP -> BOTTOM) ===");
    for (int i = top; i >= 0; i--) {  //looping mundur dari indeks 'top' ke bawah / (indeks 0)
    System.out.println("| " + stack[i] + " |");
 }
    System.out.println("=================================");
 }
    // === BAGIAN 3: Main Program ===
    public static void main(String[] args) {
    //TODO: push 3 transaksi berikut ke dalam stack:
    push ("Tiket-A01: Avengers Rp50.000");
    push ("Tiket-B02: Interstellar Rp45.000");
    push ("Tiket-C03: Inception Rp45.000");
    
    tampilkanStack();
    
    HitungTotal();
    
    // TODO: tampilkan tiket paling atas (peek)
    System.out.println("Tiket terakhir masuk: " + peek());
    
    // TODO: batalkan 1 transaksi teratas (pop) dan tampilkan
    System.out.println("Tiket dibatalkan: " + pop());
    
    System.out.println("=================================");
    
    tampilkanStack();
    }
    
    static void HitungTotal() {
        int Total= 0;
        for (int i= 0; i<= top; i++) {    
            String HargaStr= stack[i].split("Rp")[1].replace(".","");  
            Total += Integer.parseInt(HargaStr);
            
            // stack[i] untuk mengambil data pada indeks ke-i didlm array stack
            // split("Rp")[1] untuk memecah 1 string menjadi 2 bagian dengan kata kunci "Rp"
            //[1] memilih indeks ke 1 setelah dipecah yaitu "50.000"
            //replace(".","") untuk mengubah semua karakter titik menjadi kosong
            //Total += artinya Total = Total + angka... program ini akan terus menambahkan harga tiket dari indeks 0 sampai top
            //Integer.parseInt(HargaStr) mengubah teks(string) menjadi int (angka)i agar bisa dijumlahkan
        }
            // REPLACE untuk mengubah isi teks teks dalam tipe data string
            //FORMATTING untuk mengolah data int (angka) menjadi teks(string)
            
        String Formattotal= String.format("%, d", Total).replace(",",".");
            //String.format("%, d" untuk mendeteksi ribuan dan menyisipkan karakter pemisah 
            //replace(",",".") untuk mengubah semua karakter koma menjadi titk
        
        System.out.println ("Total Transaksi: Rp" + Formattotal);
    }
}
