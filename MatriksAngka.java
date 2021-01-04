import java.util.Scanner;

class MatriksAngka {
  public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);
    int jumlah = input.nextInt();
    
    for(int i=0; i<jumlah; i++) {
      for(int j=0; j<jumlah; j++) {
        System.out.print(j+ " ");
      }
      System.out.println();
    }
  }
}