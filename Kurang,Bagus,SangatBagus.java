import java.util.Scanner;

class Kurang,Bagus,SangatBagus {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    System.out.print("");
    int nilai = input.nextInt();
    
    if ( nilai > 75 ) {
      System.out.println("Sangat Bagus");
    } else if ( nilai > 54) {
       System.out.println("Bagus");
    } else {
        System.out.println("Kurang");
    }
  }
}