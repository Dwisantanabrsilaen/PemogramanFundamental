import java.util.Scanner;

class MenghitungJumlahPerbaris {
  public static void main(String[] args) {
   Scanner n = new Scanner(System.in) ;
   
   int matrix[][] = new int[5][5];
   
   for (int a = 0; a < 5; a++) {
     for (int b = 0; b < 5; b++) {
       matrix[a] [b] = n.nextInt();
     }
   }
   int res = 0;
   for (int a = 0; a < 5; a++) {
     for (int b = 0; b < 5; b++) {
       res += matrix[a][b];
       
     }
     System.out.println(res);
     res = 0;
   }
  }
}