package Tugas1;

public class No_4 {
    public static void main(String[] args) {
        int[][] arrayDua = {
            {12, 10, 40},
            {13, 11, 41},
            {14, 12, 42},
        };
        
        // Menampilkan isi array
        for (int i = 0; i < arrayDua.length; i++) {
            for (int j = 0; j < arrayDua[i].length; j++) {
                System.out.print(arrayDua[i][j] + " ");
            }
            
            System.out.println(); // pindah ke baris berikutnya 
        }
    }
}