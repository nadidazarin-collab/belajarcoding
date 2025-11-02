import java.util.Scanner;
public class soal4 {

     public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan sebuah bilangan: ");
        int bilangan = in.nextInt();

        boolean isPrima = true;
        if (bilangan <= 1) isPrima = false;
        for (int i = 2; i <= bilangan / 2; i++) {
            if (bilangan % i == 0) {
                isPrima = false;
                break;
            }
        }

        System.out.println(bilangan + (isPrima ? " adalah bilangan prima." : " bukan bilangan prima."));
    }
}
    

