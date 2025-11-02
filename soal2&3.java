
import java.util.Scanner;
public class soal3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
             
//        for (int i = 1; i <=30; i++) {
//        if(i%3==0 && i%5==0){
//            
//            System.out.println("FizzBuzz");
//        }else if(i%5==0){
//            System.out.println("Buzz");
//        }else if(i%3==0){
//            System.out.println("Fizz");
//        }else{
//            System.out.println(i);
//        }
//       
//        }

           System.out.print("Masukkan tinggi piramida: ");
           int a = in.nextInt();
           
           for (int i = 1; i <= a; i++) {
               for (int j = 1; j <= i; j++) {
                   System.out.print("*");
                   
               }
               System.out.println();
            
        }
        
           
    }
    
}
