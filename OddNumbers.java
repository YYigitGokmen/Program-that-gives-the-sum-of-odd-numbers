
import java.util.Scanner;


public class OddNumbers {

 public static void main(String[] args) {

 Scanner scan = new Scanner(System.in);

    int n;
    int total = 0;

     do  {
         System.out.print("Bir Sayı Giriniz : ");
         n = scan.nextInt();
         if (n % 4==0){
             total += n;
         }
     } while ( n % 2 ==0);

     System.out.println("toplam : "+ total);

 }
}
