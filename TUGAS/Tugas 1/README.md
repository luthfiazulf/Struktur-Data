#Selection_ Sort
Tugas 1 ini adalah Simulasi algoritma Selection Sort menggunakan bahasa Java dengan deret angka awal:
[20, 15, 90, 13, 26]
Intruksi nya Program harus menunjukkan proses pengurutan dari Iterasi 1 sampai Iterasi 4.
```// Deklarasi variabel
        int []a = {20, 15, 90, 13, 26};
        int n = a.length;

        System.out.println("Data Awal: 20, 15, 90, 13, 26 \n");
        
        for (int i = 0; i < n - 1; i++) {
            int min = i;
            for (int j = i + 1; j < n; j++) {
                if (a[j] < a[min]) {
                    min = j;
                }
            }

            // Proses Swapping
            int temp = a [min];
            a[min] = a[i];
            a[i] = temp;

            // Output Setiap Iterasi
        System.out.print("Iterasi " + (i + 1) + ": ");
            for (int m = 0; m < a.length; m++){
                System.out.print(a[m] + (m == a.length - 1 ? "" : ", "));
            }
            System.out.println(" ");
        }

</p>


![code alt](https://github.com/luthfiazulf/Struktur-Data/blob/7825b98c2f6b6a2fbade8de145ba80b2ced3ea6c/TUGAS/Tugas%201/Selection_sort.NetBeans%20Java)

![RUN](https://github.com/luthfiazulf/Struktur-Data/blob/e68f37f2017ec84d90d26c71251c216b945d8aac/TUGAS/Tugas%201/Screenshot%20(391).png)
