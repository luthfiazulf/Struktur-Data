# UTS Struktur Data - Part 1

Tugas ini berisi simulasi algoritma **Selection Sort**, **Bubble Sort**, dan **Insertion Sort** menggunakan bahasa Java dengan data inventaris barang sebanyak 10 data.

---

## 1. Selection Sort
Algoritma ini mencari nilai terkecil dalam deret dan menukarnya ke posisi depan.

### Cuplikan Logika (Code Snippet):
```java
for (int i = 0; i < n - 1; i++) {
    int minIdx = i;
    for (int j = i + 1; j < n; j++) {
        if (DaftarBarang[j].Harga < DaftarBarang[minIdx].Harga) {
            minIdx = j;
        }
    }
    // Proses Swapping
    Barang temp = DaftarBarang[minIdx];
    DaftarBarang[minIdx] = DaftarBarang[i];
    DaftarBarang[i] = temp;
}
