import java.util.Scanner;
class ArrayTerbalik {
  public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);
    System.out.print("");
    int jumlah = (5);
    int[] nilai = new int[jumlah];
    
    for (int i = 0; i < jumlah; i++) {
      System.out.print("");
      nilai[i] = input.nextInt();
    }
    for (int i = jumlah - 1; i >= 0; i--) {
      System.out.println(nilai[i] + " ");
    }
  }
}