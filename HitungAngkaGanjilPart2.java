import java.util.*;

class HitungAngkaGanjilPart2 {
  public static void main(String[] args) {
   int baris, kolom, ganjil = 0;
   Scanner input = new Scanner(System.in);
   baris = input.nextInt();
   kolom = input.nextInt();
   int nilai[][] = new int[baris][kolom];
   for (int i = 0; i < baris; i++)
   {
     for (int j = 0; j < kolom; j++)
     {
       nilai[i][j] = input.nextInt();
     }
   }
   for(int a = 0; a < baris; a++) {
     ganjil = 0;
     for(int b = 0; b < kolom; b++) {
       if(nilai[a][b] % 2 != 0) {
         ganjil++;
       }
     }
     System.out.println(ganjil);
   }
  }
}